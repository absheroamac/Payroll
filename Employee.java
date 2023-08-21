public class Employee {

    public String employeeId;
    public String name;
    public int salary;
    public EmployeeType employeeType;

    public Employee(String employeeId, String name, int salary){

        setEmployeeId(employeeId);
        setName(name);
        setSalary(salary);
        this.employeeType = EmployeeType.FULL_TIME;

    }

    public Employee(String employeeId, String name, int rate, int hours){
        setEmployeeId(employeeId);
        setName(name);
        setSalary(rate,hours);
        this.employeeType = EmployeeType.PART_TIME;
    }

    public String getName(){
        return this.name;
    }

    public String getEmployeeId(){
        return this.employeeId;
    }

    public EmployeeType gEmployeeType(){
        return this.employeeType;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setSalary(int rate, int hours){
        this.salary = rate*hours;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public void printDetails(){
        System.out.println(this.employeeId+" - "+this.name+" has salary of "+this.salary+"Rs");
    }



    
}
