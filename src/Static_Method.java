public class Static_Method {

    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Static_Method(int r , String n){
        rollno = r;
        name = n;
    }
    static void change (){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + "" + name + "" + college);
    }

    public static void main(String[] args) {
        Static_Method.change();

        Static_Method s1 = new Static_Method(1, " Tien ");
        Static_Method s2 = new Static_Method(2, " Giang ");
        Static_Method s3 = new Static_Method(3, " Hung ");

        s1.display();
        s2.display();
        s3.display();

    }
}
