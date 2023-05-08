package JavaFundations;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Camisetas";
        int quantidade=3;
        String message = custName+" quer comprar "+quantidade+" "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double preço= 15.99;
        double imposto= (preço*0.1)*quantidade*preço;
        
        
        
        // Declare and assign a calculated totalPrice
        
        
        // Modify message to include quantity 
        System.out.println(imposto);
        System.out.println(message);
        
        // Print another message with the total cost
        
    }    
}
