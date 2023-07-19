package brosresumecom.example.BrosDetails;


public class Families {

    private String fathername;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    private String place;

    public Families(String fathername, String mothername, String brothername, String Place) {
        this.fathername = fathername;
        this.mothername = mothername;
       this.brothername = brothername;
       this.place= place;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getBrothername() {
        return brothername;
    }

    public void setBrothername(String brothername) {
        this.brothername = brothername;
    }

    private String mothername;
    private String brothername;


}
