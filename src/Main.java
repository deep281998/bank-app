public class Main {
    public static void main(String args[]){


        HDFCAccount vivekacc = new HDFCAccount("Vivek" , "123" , 0.0);
        System.out.println(vivekacc);

        System.out.println(vivekacc.fetchBalance("123"));
        System.out.println(vivekacc.fetchBalance("1234"));

        System.out.println(vivekacc.addMoney(10000.0));
        System.out.println(vivekacc.changePassword("123" , "1234"));

        System.out.println(vivekacc.withdrawMoney(1000 , "1234"));
    }
}