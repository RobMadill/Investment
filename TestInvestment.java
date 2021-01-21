public class TestInvestment {
    public static void main(String[] args) {
        try {
            Investment inv1 = new Investment();
            System.out.println(inv1);
            inv1.setBalance(10000);
            inv1.setInterestRate(10.2);
            System.out.println(inv1);
        
            //uncomment this to test it (it should throw an exception):
            //Investment inv2a = new Investment(0, 3);
            //uncomment these lines to test them (last 3 lines should also  throw exceptions):
            Investment inv2b = new Investment();
            inv2b.setBalance(-3);
            inv2b.setInterestRate(-3);
            inv2b.setInterestRate(12.01);
            
            Investment inv3 = new Investment(2500, 7.9);
            System.out.println(inv3);
            double interest = inv3.totalInterest();
            double total = inv3.totalInvestment(10);
            System.out.printf("Total interest: $%4.2f%n", interest);
            System.out.printf("Total investment: $%4.2f%n", total);
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
	}
}
