package JavaFundations;
public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
    	double var1 =0.8, var3=3.6;
    	float seg=100;
    	int ter=121;
    	int quart=117;
    	float dailyAverage=(seg+ter+quart)/3;
    	double monthlyAverage= dailyAverage*30;
    	double monthlyProfit=monthlyAverage*0.18;
    	

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
        System.out.println(var1+var3);
     
    }
    
}
