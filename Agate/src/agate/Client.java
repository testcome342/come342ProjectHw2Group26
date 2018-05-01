package agate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Client {

    private String companyName;
    private String companyAddress;
    private String companyEmail;
    private String contactName;
    private String contactEmail;
    private ArrayList<Campaign> campaigns = new ArrayList<Campaign>();
    private Campaign campaign = new Campaign(); 

    public Client() {
        companyName = "";
        companyAddress = "";
        companyEmail = "";
        contactName = "";
        contactEmail = "";
    }

    public Client(String cmpName, String cmpAddress, String cmpEmail, String cntName, String cntEmail) {
        companyName = cmpName;
        companyAddress = cmpAddress;
        companyEmail = cmpEmail;
        contactName = cntName;
        contactEmail = cntEmail;
    }

    public ArrayList<Campaign> getClientCampaigns() {
        return campaigns;
    }

    ;
    public Campaign addNewCampaign(String title,String campaignStartDate,String campaignFinishDate,int estimatedCost,double campaignOverheads) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
                Date grStartDate = df.parse(campaignStartDate);
                Date grFinishDate = df.parse(campaignFinishDate);

        campaign.setCampaignFinishDate(grFinishDate);
        campaign.setCampaignOverheads(campaignOverheads);
        campaign.setEstimatedCost(estimatedCost);
        campaign.setTitle(title);
        campaign.setCampaignStartDate(grStartDate);
       
        this.campaigns.add(campaign);
        return campaign;
    }

    ;
    public Client getClient() {
        return this;
    }

    ;
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void printCampaigns() {
        for (int i = 0; i < this.campaigns.size(); i++) {
            System.out.println(this.campaigns.get(i).getTitle());
        }
    }

}
