package agate;

public class AdminStaff extends StaffMember {
    
    StaffGrade staffGrade = new StaffGrade();

    public StaffGrade getStaffGrade() {
        return staffGrade;
    }

    public void setStaffGrade(StaffGrade staffGrade) {
        this.staffGrade = staffGrade;
    }
    
    public void assignStaffContact() {

    }

    public StaffMember getStaffDetails() {
        return this;
    }
    
      public void printStaffGrade(){
        for(int j=0;j<=this.getStaffGrade().getGrade().getGradeRates().size();j++){
            System.out.println("GradeRates:" + " " + this.getStaffGrade().getGrade().getGradeRates().get(j).getRate());
        } 

    }
}
