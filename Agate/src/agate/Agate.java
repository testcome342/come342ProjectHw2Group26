package agate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Agate {

    public static void main(String[] args) throws ParseException {
        AccountManager accountant = new AccountManager();
        StaffMember staffMember = null;
        CreativeStaff createdStaff = null;

        accountant.createCreativeStaffMember(0, "Eren", "1.1.1995", "erenst543@gmail.com");
        System.out.println("----------------Select Staff Type---------------");
        System.out.println("1. CreativeStaff");
        System.out.println("2. AdminStaff");

        System.out.print("Select Staff Member Type:");
        Scanner enterSelection = new Scanner(System.in);
        int slcNo = enterSelection.nextInt();
        if (slcNo >= 1 && slcNo <= 2) {
            System.out.println("----------------Add a new Staff Member---------------");
            System.out.println("Enter Staff Details");
            System.out.print("StaffNo:");
            Scanner enterStaffNo = new Scanner(System.in);
            int sNo = enterStaffNo.nextInt();

            System.out.print("StaffName:");
            Scanner enterStaffName = new Scanner(System.in);
            String sName = enterStaffName.next();

            System.out.print("StaffStartDate:");
            Scanner enterStartDate = new Scanner(System.in);
            String stDate = enterStartDate.next();

            System.out.print("StaffEmailAddress:");
            Scanner enterEmailAddress = new Scanner(System.in);
            String sEmailAddress = enterEmailAddress.next();

            if (slcNo == 1) {
                CreativeStaff creativeStaff = accountant.createCreativeStaffMember(sNo, sName, stDate, sEmailAddress);
                createdStaff = creativeStaff;
                staffMember = new CreativeStaff();
                StaffGrade staffGrade = new StaffGrade();
                staffGrade.setCreativeStaff(creativeStaff);
                System.out.println("----------------Add a new Staff Grade-----------------");
                System.out.println("Enter Grade Details");

                System.out.print("GradeName:");
                Scanner enterGradeName = new Scanner(System.in);
                String gradeName = enterGradeName.next();

                System.out.print("StaffGradeStartDate:");
                Scanner enterGradeStartDate = new Scanner(System.in);
                String gradeStrtDate = enterGradeStartDate.next();

                DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
                Date grStartDate = df.parse(gradeStrtDate);
                staffGrade.setGradeStartDate(grStartDate);

                System.out.print("StaffGradeRate:");
                Scanner enterGradeRate = new Scanner(System.in);
                double gradeRate = enterGradeRate.nextDouble();

                staffGrade.createStaffGrade(gradeName, gradeRate, gradeStrtDate);
                creativeStaff.setStaffGrade(staffGrade);
                staffMember = creativeStaff;
            } else if (slcNo == 2) {
                staffMember = new AdminStaff();
                AdminStaff adminStaff = accountant.createAdminStaff(sNo, sName, stDate, sEmailAddress);
                StaffGrade staffGrade = new StaffGrade();
                staffGrade.setAdminStaff(adminStaff);
                accountant.createAdminStaff(sNo, sName, stDate, sEmailAddress);
                System.out.println("----------------Add a new Staff Grade-----------------");
                System.out.println("Enter Grade Details");
                System.out.print("GradeName:");
                Scanner enterGradeName = new Scanner(System.in);
                String gradeName = enterGradeName.next();

                System.out.print("StaffGradeStartDate:");
                Scanner enterGradeStartDate = new Scanner(System.in);
                String gradeStrtDate = enterGradeStartDate.next();

                DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
                Date grStartDate = df.parse(gradeStrtDate);
                staffGrade.setGradeStartDate(grStartDate);

                System.out.print("StaffGradeRate:");
                Scanner enterGradeRate = new Scanner(System.in);
                double gradeRate = enterGradeRate.nextDouble();

                staffGrade.createStaffGrade(gradeName, gradeRate, gradeStrtDate);
                adminStaff.setStaffGrade(staffGrade);
                staffMember = adminStaff;
            }
        } else {
            System.out.println("Wrong Number");
            return;
        }

        accountant.printCreativeStaffs();
        System.out.println("-----------------Add a new Client---------------");
        System.out.println("Enter Client Details");
        System.out.print("CompanyName:");
        Scanner enterCmName = new Scanner(System.in);
        String cmName = enterCmName.next();

        System.out.print("CompanyAddress:");
        Scanner enterCmAddress = new Scanner(System.in);
        String cmAddress = enterCmAddress.next();

        System.out.print("CompanyEmail:");
        Scanner enterCmEmail = new Scanner(System.in);
        String cmEmail = enterCmEmail.next();

        System.out.print("ContactName:");
        Scanner enterCnName = new Scanner(System.in);
        String cnName = enterCnName.next();

        System.out.print("ContactEmail:");
        Scanner enterCnEmail = new Scanner(System.in);
        String cnEmail = enterCnEmail.next();

        Client addedClient = accountant.creativeStaff.createNewClient(cmName, cmAddress, cmEmail, cnName, cnEmail);
        System.out.println("--------------Add a new Campaign---------------");
        System.out.println("Enter Campaign Details");
        System.out.print("Title:");
        Scanner enterCampaignDetails = new Scanner(System.in);
        String ttl = enterCampaignDetails.next();
        System.out.print("StartDate:");

        Scanner enterStDate = new Scanner(System.in);
        String sDate = enterStDate.next();

        System.out.print("FinishDate:");
        Scanner enterFnshDate = new Scanner(System.in);
        String fDate = enterFnshDate.next();

        System.out.print("EstimatedCost:");
        Scanner enterEstCost = new Scanner(System.in);
        int estCost = enterEstCost.nextInt();

        System.out.print("Overheads:");
        Scanner enterOverHeads = new Scanner(System.in);
        double overHead = enterOverHeads.nextDouble();

        Campaign addedCampaign = addedClient.addNewCampaign(ttl, sDate, fDate, estCost, overHead);

        ArrayList<StaffMember> campaignStaffs = addedCampaign.assignStaffToCampaign(staffMember);
        System.out.println("-----------------Assign Staff to work on a Campaign-----------------------");
        System.out.println("------All Staffs of this Campaign------");
        for (int p = 0; p < campaignStaffs.size(); p++) {
            System.out.println("StaffName:  " + campaignStaffs.get(p).getStaffName());
            System.out.println();
        }

        ArrayList<StaffMember> allStaffs = accountant.getStaffs();
        System.out.println("------All Staffs------");
        for (int o = 0; o < allStaffs.size(); o++) {
            System.out.println("StaffName:  " + allStaffs.get(o).getStaffName());
        }
        System.out.println();

        ArrayList<StaffMember> listOfAvailableStaffs = new ArrayList<StaffMember>();
        if (campaignStaffs.size() > 0) {
            for (int l = 0; l < campaignStaffs.size(); l++) {
                for (int k = 0; k < allStaffs.size(); k++) {
                    if (allStaffs.get(k).getStaffNo() != campaignStaffs.get(l).getStaffNo()) {
                        listOfAvailableStaffs.add(allStaffs.get(k));
                    }
                }
            }
        } else {
            for (int k = 0; k < allStaffs.size(); k++) {
                listOfAvailableStaffs.add(allStaffs.get(k));
            }
        }
        System.out.println("-------Available Staffs to assign this Campaign-------");
        System.out.println();

        for (int n = 0; n < listOfAvailableStaffs.size(); n++) {
            System.out.println("NO:" + (n + 1) + " " + "StaffNo:" + listOfAvailableStaffs.get(n).getStaffNo() + " "
                    + "StaffName:" + listOfAvailableStaffs.get(n).getStaffName());
        }
        System.out.println();

        System.out.println("-----Select a Staff------");
        System.out.print("Enter Staff Number:");

        Scanner enterStaffNo = new Scanner(System.in);
        int staffNumber = enterStaffNo.nextInt();
                System.out.println();


        StaffMember staffToAdd = listOfAvailableStaffs.get(staffNumber - 1);
        addedCampaign.assignStaffToCampaign(staffToAdd);
        System.out.println("-----Campaign Staffs-----");
        System.out.println();

        for (int y = 0; y < addedCampaign.getStaffMembers().size(); y++) {
            System.out.println("StaffNo:" + addedCampaign.getStaffMembers().get(y).getStaffNo() + "  " + "StaffName:" + addedCampaign.getStaffMembers().get(y).getStaffName()
            );
        }
    }
}
