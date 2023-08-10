public interface BnakAccountInterface {

    String fetchBalance(String password);

    String addMoney(double amount);

    String withdrawMoney(double amount , String password);

    String changePassword(String oldPassword , String newPassword);

    double calculateIntrest(int year);
}
