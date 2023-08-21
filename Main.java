package Payroll;
public class Main{
    public static void main(String[] args) {

        Employee absher = new FullTime("ABC#123","Absher",33000);
        Employee oamac = new PartTime("ABC#321","Oamac",1000,140);
        absher.printDetails();
        oamac.printDetails();
        
    }
}