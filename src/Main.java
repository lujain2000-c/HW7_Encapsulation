// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Account a1 = new Account();
        Account another = new Account();
        a1.Account("5", "Lujain");
        another.Account("3","Amal", 1000000);

        System.out.println(a1.getID());
        System.out.println(a1.getName());
        System.out.println(a1.getBalance());
        if (a1.credit(1000) ==-1){
            System.out.println("the number more than what you have");
        }else {
            System.out.println(a1.credit(1000));
        }
        System.out.println(a1.debit(10000000));

        if (a1.credit(1000) ==-1){
            System.out.println("the number more than what you have");
        }else {
            System.out.println(a1.credit(1000));
        }

        System.out.println(a1.transferTo(another,10000));
        System.out.println(a1.toString());


        //Class Employee

        Employee e1 = new Employee("1", " Lujain", 50000);


        System.out.println(e1.getID());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getAnnualSalary());
        System.out.println(e1.raisedSalary(20));
        System.out.println(e1.toString());

    }
}