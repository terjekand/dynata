package com.dynata.model;

public class Member {
    int memberId;
    String fullName;
    String emailAddress;
    Boolean isActive;

    public Member(int memberId, String fullName, String emailAddress, Boolean isActive) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.isActive = isActive;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
