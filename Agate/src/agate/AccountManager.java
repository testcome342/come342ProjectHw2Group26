package agate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AccountManager extends StaffMember {

    ArrayList<StaffMember> staffs = new ArrayList<StaffMember>();

    public ArrayList<StaffMember> getStaffs() {
        return this.staffs;
    }

    public void setStaffs(ArrayList<StaffMember> staffs) {
        this.staffs = staffs;
    }
    
    ArrayList<CreativeStaff> creativeStaffs = new ArrayList<CreativeStaff>();
    ArrayList<AdminStaff> adminStaffs = new ArrayList<AdminStaff>();


    CreativeStaff creativeStaff = new CreativeStaff();
    AdminStaff adminStaff = new AdminStaff();

    public void assignStaffContact() {

    }

    public StaffMember getStaffDetails() {
        return this;
    }

    public CreativeStaff createCreativeStaffMember(int sNo, String name, String startDate, String email) throws ParseException {
        
        this.creativeStaff.setStaffNo(sNo);
        this.creativeStaff.setStaffName(name);

        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

        Date cStartDate = df.parse(startDate);

        this.creativeStaff.setStaffStartDate(cStartDate);
        this.creativeStaff.setStaffEmail(email);

        this.staffs.add(this.creativeStaff.populate());
        this.creativeStaffs.add(this.creativeStaff.populate());
        return this.creativeStaff;

    }
    


    public AdminStaff createAdminStaff(int sNo, String sName, String stDate, String sEmailAddress) throws ParseException {
        adminStaff.setStaffNo(sNo);
        adminStaff.setStaffName(sName);

        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

        Date cStartDate = df.parse(stDate);

        adminStaff.setStaffStartDate(cStartDate);
        adminStaff.setStaffEmail(sEmailAddress);

        this.staffs.add(adminStaff);
        this.adminStaffs.add(adminStaff);
        return this.adminStaff;
    }


    public void printCreativeStaffs() {
        for (int i = 0; i < this.creativeStaffs.size(); i++) {
            System.out.println("StaffNo:" + this.creativeStaffs.get(i).getStaffNo()
                    + " " +"StaffName:" + this.creativeStaffs.get(i).getStaffName());
            this.creativeStaffs.get(i).printStaffGrade();
   
        }
    }
    
    public void printAdminStaffs() {
        for (int i = 0; i < this.adminStaffs.size(); i++) {
            System.out.println("StaffNo:" + this.adminStaffs.get(i).getStaffNo() + " "+"Staff Name:" + this.adminStaffs.get(i).getStaffName());
                   this.adminStaffs.get(i).printStaffGrade();

        }
    }
  
}
