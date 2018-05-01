package agate;

import java.util.ArrayList;
import java.util.Date;

public class Campaign {
    private String title;
    private Date campaignStartDate;
    private Date campaignFinishDate;
    private int estimatedCost;
    private double campaignOverheads;
    private ArrayList<CreativeStaff> staffs = new ArrayList<CreativeStaff>();
    private ArrayList<StaffMember> staffMembers = new ArrayList<StaffMember>();

    public ArrayList<StaffMember> getStaffMembers() {
        return staffMembers;
    }

    public void setStaffMembers(ArrayList<StaffMember> staffMembers) {
        this.staffMembers = staffMembers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCampaignStartDate() {
        return campaignStartDate;
    }

    public void setCampaignStartDate(Date campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }

    public Date getCampaignFinishDate() {
        return campaignFinishDate;
    }

    public void setCampaignFinishDate(Date campaignFinishDate) {
        this.campaignFinishDate = campaignFinishDate;
    }

    public int getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(int estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public double getCampaignOverheads() {
        return campaignOverheads;
    }

    public void setCampaignOverheads(double campaignOverheads) {
        this.campaignOverheads = campaignOverheads;
    }

   public Campaign(){
       title = "";
       campaignStartDate = new Date();
       campaignFinishDate = new Date();
       estimatedCost = 0;
       campaignOverheads = 0.0;
   }
   public Campaign(String ttl, Date cmpStartDate, Date cmpFinishDate, int estmCost, double cmpOverheads){
       title = ttl;
       campaignStartDate = cmpStartDate;
       campaignFinishDate = cmpFinishDate;
       estimatedCost = estmCost;
       campaignOverheads = cmpOverheads;
   }
   public void createCampaign(String ttl, Date cmpStartDate, Date cmpFinishDate, int estmCost, double cmpOverheads){
       this.title = ttl;
       this.campaignStartDate = cmpStartDate;
       this.campaignFinishDate = cmpFinishDate;
       this.estimatedCost = estmCost;
       this.campaignOverheads = cmpOverheads;
   }
   public Campaign getCampaignDetails(){
       return this;
   }
   public void checkCampaignBudget(){
       
   }
   public double getOverheads(){
       return campaignOverheads;
   }
   
   public ArrayList<StaffMember> assignStaffToCampaign(StaffMember staff){
       this.staffMembers.add(staff);
       return this.staffMembers;
   }
}