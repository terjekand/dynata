package com.dynata.service;

import com.dynata.model.Member;
import com.dynata.model.Survey;

import java.util.List;

public class Calculate {
    
    //sum of lines Participation.csv / participation list length
    public List<Member> calculateCompletedSurveys (){
        return null;
    }
    
    //sum of lines Participation.csv by memberId 
    public List<Survey> gcalculateCompletedSurveysByOneMember (){
        return null;
    }
      
    //sum of gained points Participation.csv by memberId and Surveys.csv by SurveyId
    public int calculateGainedPointsByOneMember () {
        return 0
    }
    
    //
    public List<Member> calculateNotAskedMembersForSurvey () {
        return null;
    }
}
