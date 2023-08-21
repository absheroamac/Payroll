package Payroll;
public class PartTime extends Employee {

    public PartTime(String employeeId, String name, int rate, int hour){
        super(employeeId,name,rate*hour);
        setEmployeeType(EmployeeType.PART_TIME);
    }
    
}
