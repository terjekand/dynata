package com.dynata.reader;

import com.dynata.model.Member;
import com.dynata.model.Participation;
import com.dynata.model.Status;
import com.dynata.model.Survey;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVDataReader {

    private static final String MEMBERS_CSV_FILE_PATH = ".//.//resources//Members.csv";
    private static final String PARTICIPATION_CSV_FILE_PATH = ".//.//resources//Participation.csv";
    private static final String STATUSES_CSV_FILE_PATH = ".//.//resources//Statuses.csv";
    private static final String SURVEYS_CSV_FILE_PATH = ".//.//resources//Surveys.csv";

    public List<String[]> readAll(String filePath) throws IOException,
            CsvException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(filePath));
                CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        ) {
            String[] nextRecord;
            List<String[]> list = new ArrayList<>();
            while ((nextRecord = csvReader.readNext()) != null) {
                list.add(nextRecord);
            }

            return list;
        }
    }

    public List<Member> processMembersData() throws IOException,
            CsvException {
        List<Member> members = new ArrayList<>();
        List<String[]> membersStringList = readAll(MEMBERS_CSV_FILE_PATH);
        for (String[] actual : membersStringList) {
            int memberId = Integer.parseInt(actual[0]);
            String fullName = actual[1];
            String emailAdress = actual[2];
            Boolean isActive = actual[3].equals("1");
            Member member = new Member(memberId, fullName, emailAdress, isActive);
            members.add(member);
        }

        return members;
    }

    public List<Status> processStatusData() throws IOException,
            CsvException {
        List<Status> statuses = new ArrayList<>();
        List<String[]> statusesStringList = readAll(STATUSES_CSV_FILE_PATH);
        for (String[] actual : statusesStringList) {
            int statusId = Integer.parseInt(actual[0]);
            String name = actual[1];
            Status status = new Status(statusId, name);
            statuses.add(status);
        }

        return statuses;
    }

    public List<Survey> processSurveysData() throws IOException,
            CsvException {
        List<Survey> surveys = new ArrayList<>();
        List<String[]> surveysStringList = readAll(SURVEYS_CSV_FILE_PATH);
        for (String[] actual : surveysStringList) {
            int surveyId = Integer.parseInt(actual[0]);
            String surveyName = actual[1];
            int expectedCompletes = Integer.parseInt(actual[2]);
            int completionPoints = Integer.parseInt(actual[3]);
            int filteredPoints = Integer.parseInt(actual[4]);
            Survey survey = new Survey(surveyId, surveyName, expectedCompletes, completionPoints, filteredPoints);
            surveys.add(survey);
        }

        return surveys;
    }

    public List<Participation> processParticipationData() throws IOException,
            CsvException {
        List<Participation> participationList = new ArrayList<>();
        List<String[]> participationStringList = readAll(PARTICIPATION_CSV_FILE_PATH);
        for (String[] actual : participationStringList) {
            int memberId = Integer.parseInt(actual[0]);
            int surveyId = Integer.parseInt(actual[1]);
            int status = Integer.parseInt(actual[2]);
            int length = Integer.parseInt(actual[3]);
            Participation participation = new Participation(memberId, surveyId, status, length);
            participationList.add(participation);
        }

        return participationList;
    }

}
