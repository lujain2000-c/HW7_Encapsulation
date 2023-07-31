public class Employee {

   private String id ;
    private String name;
    private int salary;



    public Employee (String id, String name , int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public double raisedSalary(int percent){
        double raised = salary * (percent/100.00);


        return salary + raised;
    }
    public String toString(){

        return "ID: "+ id +" Name: "+ name + " Balance: " + salary;

    }
}
