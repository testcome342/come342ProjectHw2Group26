package agate;

import java.text.ParseException;
import java.util.Date;

public class StaffGrade {
    private Date gradeStartDate;
    private Date gradeFinishDate;
    private Grade grade;
    private CreativeStaff creativeStaff;
    private AdminStaff adminStaff;

    public AdminStaff getAdminStaff() {
        return adminStaff;
    }

    public void setAdminStaff(AdminStaff adminStaff) {
        this.adminStaff = new AdminStaff();
        this.adminStaff = adminStaff;
    }

    public CreativeStaff getCreativeStaff() {
        return creativeStaff;
    }

    public void setCreativeStaff(CreativeStaff creativeStaff) {
        
        this.creativeStaff = creativeStaff.populate();
    }

    public Date getGradeStartDate() {
        return gradeStartDate;
    }

    public void setGradeStartDate(Date gradeStartDate) {
        this.grade = new Grade();
        this.gradeStartDate = gradeStartDate;
    }

    public Date getGradeFinishDate() {
        return gradeFinishDate;
    }

    public void setGradeFinishDate(Date gradeFinishDate) {
        this.gradeFinishDate = gradeFinishDate;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public void createStaffGrade(String gradeName,double rate,String rateStartDate) throws ParseException{
       this.grade = new Grade(); 
       this.grade= this.grade.createGrade(gradeName,rate,rateStartDate);
    }
    public void getStaffGrades(){
        
    }
    public void assignLatestGrade(){
        
    }
}
