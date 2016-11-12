package org.lqk.lspring.bean;

public class Office {
    private String officeId;

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String tostring() {
        return "Office " + officeId;
    }

}
