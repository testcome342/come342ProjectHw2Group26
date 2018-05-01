package agate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GradeRate {
    private double rate;
    private Date rateStartDate;
    private Date rateFinishDate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getRateStartDate() {
        return rateStartDate;
    }

    public void setRateStartDate(Date rateStartDate) {
        this.rateStartDate = rateStartDate;
    }

    public Date getRateFinishDate() {
        return rateFinishDate;
    }

    public void setRateFinishDate(Date rateFinishDate) {
        this.rateFinishDate = rateFinishDate;
    }
    public GradeRate createGradeRate(double rate,String rateStartDate) throws ParseException{
        this.setRate(rate);
        
         DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Date grStartDate = df.parse(rateStartDate);
        this.setRateStartDate(grStartDate);
        return this;
    }
    public void assignLatestGradeRate(){
        
    }
}
