package agate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CreativeStaff extends StaffMember {

    private ArrayList<Campaign> campaigns = new ArrayList<Campaign>();
    private ArrayList<Client> clients = new ArrayList<Client>();

    private Client client = new Client();
    private Campaign campaign = new Campaign();
    private StaffGrade staffGrade = new StaffGrade();

    public StaffGrade getStaffGrade() {
        return staffGrade;
    }

    public void setStaffGrade(StaffGrade staffGrade) {
        this.staffGrade = staffGrade;
    }

    public ArrayList<Campaign> getCampaigns() {
        return this.campaigns;
    }

    public void setCampaigns(ArrayList<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public CreativeStaff getStaff() {
        return this;
    }

    public void assignStaffContact() {

    }

    public StaffMember getStaffDetails() {
        return this;
    }
        public CreativeStaff populate(){
        CreativeStaff copyCstaff=new CreativeStaff();
        copyCstaff.setStaffNo(this.getStaffNo());
        copyCstaff.setStaffName(this.getStaffName());
        copyCstaff.setStaffStartDate(this.getStaffStartDate());
        copyCstaff.setStaffEmail(this.getStaffEmail());
        return copyCstaff;
    }

   /* public Campaign createNewCampaign(int clientIndex, String ttl, String cmpStartDate, String cmpFinishDate, int estmCost, double cmpOverheads) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

        Date cStartDate = df.parse(cmpStartDate);
        Date cFinishDate = df.parse(cmpFinishDate);

        this.campaign = new Campaign(ttl, cStartDate, cFinishDate, estmCost, cmpOverheads);
        this.client = this.clients.get(clientIndex);
        this.client.addNewCampaign(campaign);
        return this.campaign;
    }
*/

    public Client createNewClient(String cmpName, String cmpAddress, String cmpEmail, String cntName, String cntEmail) {
        this.client = new Client(cmpName, cmpAddress, cmpEmail, cntName, cntEmail);
        this.clients.add(client);
        return this.client;

    }

    public void printClients() {
        for (int i = 0; i < this.clients.size(); i++) {
            System.out.println(this.clients.get(i).getContactName());
        }
    }
    
    public void printStaffGrade(){
        if(this.getStaffGrade().getGradeStartDate() != null) {                    
            for(int j=0;j<this.getStaffGrade().getGrade().getGradeRates().size();j++){
            System.out.println("GradeRates:" + " " + this.getStaffGrade().getGrade().getGradeRates().get(j).getRate());
        } 
        }


    }

}
