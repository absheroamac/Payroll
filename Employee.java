package Payroll;
public abstract class Employee {

    private String employeeId;
    private String name;
    private int salary;
    private EmployeeType employeeType;

    public Employee(String employeeId, String name){

        setEmployeeId(employeeId);
        setName(name);

    }


    public String getName(){
        return this.name;
    }

    public String getEmployeeId(){
        return this.employeeId;
    }

    public EmployeeType getEmployeeType(){
        return this.employeeType;
    }

    public int getSalary(){
        return this.salary;
    }

    protected abstract void calculateSalary();

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public void setEmployeeType(EmployeeType employeeType){

        this.employeeType = employeeType;

    }

    public void printDetails(){
        String employeeId = getEmployeeId();
        String name = getName();
        int salary = getSalary();
        System.out.println(employeeId+" - "+name+" has salary of "+salary+"Rs");
    }



    
}
