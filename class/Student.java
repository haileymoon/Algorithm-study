public class Student {
    public int studentID;
    public String  studentName;
    public String studentAddress;

    public void printStudentInfo() {
        System.out.println(studentName + " , " + studentAddress);
    }

    public void getStudentName(){
        System.out.println(studentName);
    }
}
