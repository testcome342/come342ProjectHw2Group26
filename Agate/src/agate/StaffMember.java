package agate;

import java.util.Date;

public abstract class StaffMember {
    private int staffNo;
    private String staffName;
    private Date staffStartDate;
    private String staffEmail;
    public abstract StaffMember getStaffDetails();
    
    public abstract void assignStaffContact();

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Date getStaffStartDate() {
        return staffStartDate;
    }

    public void setStaffStartDate(Date staffStartDate) {
        this.staffStartDate = staffStartDate;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }
    
}
