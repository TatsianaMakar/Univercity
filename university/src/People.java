public abstract class People {
    private Adress adress;

    public People (Adress adress){
        this.adress=adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return this.adress;
    }
}
