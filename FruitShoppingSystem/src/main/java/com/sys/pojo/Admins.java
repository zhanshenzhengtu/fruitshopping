package com.sys.pojo;

public class Admins {
    private Integer aId;
    private String aName;
    private String aPassword;

    public Admins() {
    }

    public Admins(Integer aId, String aName, String aPassword) {
        this.aId = aId;
        this.aName = aName;
        this.aPassword = aPassword;
    }

    @Override
    public String toString() {
        return "Admins{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aPassword='" + aPassword + '\'' +
                '}';
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }
}
