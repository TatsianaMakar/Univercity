package project;

public abstract class People {
    private Adress adress;
    private String gender;

    public People (){};

    public People (Adress adress, String gender){
        this.adress=adress;
        this.gender=gender;
    }

    public People (Adress adress){
        this.adress=adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return this.adress;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }
}
