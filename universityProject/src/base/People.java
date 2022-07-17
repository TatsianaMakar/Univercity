package base;

public abstract class People implements Comparable<People>{
       private String surname;
    private String name;
    private int age;
    private Adress adress;
    private String gender;

    public People (){};

    public People(String surname, String name, int age, Adress adress, String gender) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.gender = gender;
    }

    public Adress getAdress() {
        return adress;
    }

    public String getGender() {
        return gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compareTo(People o) {
        return this.surname.compareTo(o.surname);
    }
}
