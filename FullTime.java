package Payroll;
public class FullTime extends Employee {

    private int salary;

    public FullTime(String employeeId, String name, int salary){
        super(employeeId, name);
        setEmployeeType(EmployeeType.FULL_TIME);
        this.salary = salary;
        calculateSalary();
    }

    protected void calculateSalary(){
        setSalary(this.salary);

    }
    
}
