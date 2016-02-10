package Les_2.Opdracht_2;

public class Client {

    private String clientName;
    private String clientCity;
    private int account;
    private double balance;
    private Client name;
    private Client city;


    /**
     * Create a bank account with a random account number and 0 balance.
     * @param constrName
     * @param constrCity
     */
    public Client(String constrName, String constrCity) {
        clientName = constrName;
        clientCity = constrCity;

        // Generate the random account number.
        int min = 0;
        int max = 1000000000;
        int range = (max - min) + 1;
        account = (int) (Math.random() * range) + min;
    }

    /**
     * Create a new bank with a custom account number account with 0 balance.
     * @param constrName
     * @param constrCity
     * @param constrAccount
     */
    public Client(String constrName, String constrCity, int constrAccount) {
        clientName = constrName;
        clientCity = constrCity;
        account = constrAccount;
    }

    /**
     * Display the client's bank account name.
     * @return clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Display the client's bank account city.
     * @return clientCity
     */
    public String getClientCity() {
        return clientCity;
    }

    /**
     * Display the bank account number.
     * @return account
     */
    public int getAccount() {
        return account;
    }

    /**
     * Display the balance of the bank account.
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Add money to the bank account.
     * @param amount
     */
    public void Deposit(double amount) {
        balance += amount;
    }

    /**
     * Subtract money from the bank account.
     * @param amount
     */
    public void Withdraw(double amount) {
        balance -= amount;
    }

}
