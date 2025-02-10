// Method Overriding

public class Ques3b {
    public static class Bank{
        double getRateOfInterest() {
            return 5.0;
        }
    }
    public static class SBI extends Bank{
        @Override
        double getRateOfInterest() {
            return 3.0;
        }
    }
    public static class ICICI extends Bank{
        @Override
        double getRateOfInterest() {
            return 1.0;
        }
    }
    public static void main(String[] args){
        Bank sbi = new SBI();
        Bank icici = new ICICI();

        System.out.println("SBI Interest rate : " + sbi.getRateOfInterest());
        System.out.println("ICICI Interest rate : " + icici.getRateOfInterest());
    }
}
