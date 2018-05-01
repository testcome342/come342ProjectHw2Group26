package agate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Grade {
    private String gradeName;
    private ArrayList<GradeRate> gradeRates = new ArrayList<GradeRate>();
    private GradeRate gradeRate=new GradeRate();

    public GradeRate getGradeRate() {
        return gradeRate;
    }

    public void setGradeRate(GradeRate gradeRate) {
        this.gradeRate = gradeRate;
    }

    public ArrayList<GradeRate> getGradeRates() {
        return gradeRates;
    }

    public void setGradeRates(ArrayList<GradeRate> gradeRates) {
        this.gradeRates = gradeRates;
       
    }
    public void addGradeRate(GradeRate gradeRate){
        this.gradeRates.add(gradeRate);
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
    public Grade createGrade(String gradeName,double rate,String rateStartDate ) throws ParseException{
        this.gradeName = gradeName;
        this.gradeRate=this.gradeRate.createGradeRate(rate, rateStartDate);
        this.gradeRates.add(this.gradeRate);
        return this;
    }
    public void assignGradeRate(){
        
    }
}
