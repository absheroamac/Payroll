package Payroll;
public class PartTime extends Employee {

    private int rate;
    private int hour;

    public PartTime(String employeeId, String name, int rate, int hour){
        super(employeeId,name);
        setEmployeeType(EmployeeType.PART_TIME);
        this.rate = rate;
        this.hour = hour;
        calculateSalary();
    }

    @Override
    protected void calculateSalary(){
        setSalary(this.hour*this.rate);
    }
    
}
