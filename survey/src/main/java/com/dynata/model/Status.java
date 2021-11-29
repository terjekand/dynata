package com.dynata.model;

public class Status {

    int statusId;
    String Name;

    public Status(int statusId, String name) {
        this.statusId = statusId;
        Name = name;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
