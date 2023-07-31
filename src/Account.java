public class Account {

    private String id ;
    private String name;
    private int balance = 0;

    public void Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public void Account(String id, String name ,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return  balance;
    }
    public int credit(int amount ){
        if (balance > amount) {
            balance -= amount;
            return balance;
        }
        return -1;
    }
    public int debit(int amount){
        balance += amount;
        return balance;
    }
    public int transferTo(Account another, int amount) {
        if (balance > amount) {
            balance -= amount;
            another.balance += amount;

            return another.balance ;
        }
        return -1;
    }

    public String toString(){
        return "ID: "+ id +" Name: "+ name + " Balance: " + balance;
    }
}
