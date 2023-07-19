package brosresumecom.example.BrosDetails;

public class Bros {



    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    private int age;

    public Bros(String name, int age, String qualification, int id) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.id= id;
    }

    private String qualification;


}
