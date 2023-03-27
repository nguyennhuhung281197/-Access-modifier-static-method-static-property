package Xay_dung_lop_java;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println("Test :  " + student.toString());

        Student student1 = new Student();

        student1.setName("Hung");
        student1.setClasses("C0223G1");
        System.out.println("Access modifier :" + student1.toString());
    }
}
