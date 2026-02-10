enum AccountType{

    DEBIT,
    CREDIT,
    SAVINGS



}


public class BA {
    
    static String bankname = "kaspi";

    static final double INTEREST_RATE = 0.05;

    static int nextID = 1000;

    final int accountNumber;

    private String owner;
    private double balance;
    private AccountType type;

    {

        accountNumber = nextID++;

    }

    public BA(String owner , double balance, AccountType type){

        this.owner = owner;
        this.balance = balance;
        this.type = type;
        


    }

    public void deposit(int amount){

        balance += amount;
    }


    public void deposit(double amount){

        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printInfo() {
        System.out.println(
                "Owner: " + this.owner +   // this #2
                ", Account: " + accountNumber +
                ", Type: " + type +
                ", Balance: " + balance +
                ", Bank: " + bankname
        );
    }


    public static void changeBank(String newName){

        bankname = newName; 
    }



    public static void main(String[] args) {

        BA a1 = new BA("Ali", 1000, AccountType.DEBIT);
        BA a2 = new BA("Dana", 500, AccountType.SAVINGS);

        a1.deposit(200);
        a1.deposit(50.5);

        a1.printInfo();
        a2.printInfo();

        BA.changeBank("Halyk Bank");

        a1.printInfo();
    }





}
