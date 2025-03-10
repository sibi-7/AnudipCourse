class bank {
    private double amount;
    public bank(double amount) {
        this.amount = amount;
    }
    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) 
                         ? "Withdrawal successful!" 
                         : "Insufficient balance!";        
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount; // Update balance after withdrawal
        }
        System.out.println(message);
    }
    public void deposit(double depositAmount) {
        amount +=  depositAmount;
        System.out.println("Deposit successful!");
    }
public void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }
    public static void main(String[] args) {
        bank myAccount = new bank(10000);   
        myAccount.withdraw(3000);  
        myAccount.deposit(5000);   
        myAccount.displayBalance();
    }
}
