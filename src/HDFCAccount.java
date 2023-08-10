import java.util.UUID;

public class HDFCAccount implements BnakAccountInterface{

    private String name;

    private String accountno; //unique UUID

    private final String IFSCCode = "HDFC00987";

    private String password;

    private double balance;

    private final double rateofinterest = 7.1;

    public HDFCAccount() {
    }

    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountno = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password))
        {
            return "Your balance is : " + this.balance;
        }
        return "Incorrect Password";
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount;
        return "Amount added succesfully . New balance is : " + this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals(password))
        {
            if(this.balance >= amount)
            {
                this.balance -= amount;
                return "Amount deducted succesfully . New balance is : " + this.balance;
            }
            else {
                return "Insufficient balance";
            }
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Password change successfully";
        }
        return "Incorrect password";

    }

    @Override
    public double calculateIntrest(int year) {
        return (this.balance*year*rateofinterest)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountno='" + accountno + '\'' +
                ", IFSCCode='" + IFSCCode + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateofinterest=" + rateofinterest +
                '}';
    }
}
