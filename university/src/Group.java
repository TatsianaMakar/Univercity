import java.util.Arrays;
import java.util.Scanner;

public class Group {
    Scanner sc = new Scanner(System.in);
    private String groupName;
    private int courseNumber;
    Student []stArray;
    private Teacher teacher1;

    Group(String groupName, int courseNumber, Student []stArray, Teacher teacher1) {
        this.groupName = groupName;
        this.courseNumber = courseNumber;
        this.stArray= stArray;
        this.teacher1 = teacher1;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setTeacher1(Teacher teacher1) {
        this.teacher1 = teacher1;
    }

    public Teacher getteacher1() {
        return this.teacher1;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return this.courseNumber;
    }

    public void addStudent (Student newStudent){
        Student []stArrayNew=new Student [stArray.length+1];
        for (int i=0; i<stArray.length;i++){
            stArrayNew[i]=stArray[i];
        }
        stArrayNew[stArrayNew.length-1]=newStudent;
        stArray=stArrayNew;
    }
    public void deleteStudent (Student deleteStudent){
        int count=0;
        Student []stArrayNew=new Student [stArray.length-1];
        for (int i=0; i<stArray.length;i++){
            if (stArray[i]==deleteStudent){
                count++;
            }
            if (stArray[i]!=deleteStudent){
                stArrayNew[i-count]=stArray[i];
            }
        }
        stArray=stArrayNew;
    }

    public void newTeacher() {
        System.out.println("Information about new teacher: ");
        System.out.println("Vvedite familiyu novogo ychitelya:");
        teacher1.setTeacherSurname(sc.nextLine());
        teacher1.setTeacherSurname(sc.nextLine());
        System.out.println("Vvedite imya novogo ychitelya:");
        teacher1.setTeacherName(sc.nextLine());
        System.out.println("Vvedite vozrast novogo ychitelya:");
        teacher1.setTeacherAge(sc.nextInt());
        System.out.println("Vvedite gorod novogo ychitelya:");
        teacher1.getAdress().setCity(sc.nextLine());
        teacher1.getAdress().setCity(sc.nextLine());
        System.out.println("Vvedite ylicy novogo ychitelya:");
        teacher1.getAdress().setStreet(sc.nextLine());
        System.out.println("Vvedite nomer doma novogo ychitelya:");
        teacher1.getAdress().setHomeNumber(sc.nextInt());
        System.out.println("Vvedite nomer kvartiry novogo ychitelya:");
        teacher1.getAdress().setFlatNumber(sc.nextInt());
        System.out.println("Vvedite dannie dlya rascheta zarplaty:");
        teacher1.salary();
        sc.close();
    }


    public String toString(){
        return "Information about group:\n"+"Nazvanie gruppi: " + groupName + "; nomer gruppi: " + courseNumber+ Arrays.toString(stArray)+teacher1.toString();
    }

}
