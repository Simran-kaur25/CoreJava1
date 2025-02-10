// Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks.

public class Ques2 {
    // Parent class - Bank
    public static class Bank{
        void getDetails(){
            System.out.println("Bank details are not available");
        }
    }
    // child class - SBI
    public static class SBI extends Bank{
        @Override
        void getDetails(){
            System.out.println("Bank Name is SBI");
            System.out.println("Rate of Interest is 2.5%");
        }
    }
    // child class - BOI
    public static class BOI extends Bank{
        @Override
        void getDetails(){
            System.out.println("Bank Name is BOI");
            System.out.println("Rate of Interest is 5%");
        }
    }
    // child class - SBI
    public static class ICICI extends Bank{
        @Override
        void getDetails(){
            System.out.println("Bank Name is ICICI");
            System.out.println("Rate of Interest is 1.2%");
        }
    }

    public static void main(String[] args){
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}
