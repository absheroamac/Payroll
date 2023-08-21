package Payroll;
public class FullTime extends Employee {

    public FullTime(String employeeId, String name, int salary){
        super(employeeId, name, salary);
        setEmployeeType(EmployeeType.FULL_TIME);
    }
    
}
