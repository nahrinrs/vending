package challange.vending;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception{
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter Product Name: ");
    	String productName = in.next();
    	System.out.print("Enter Product value: ");
    	int productValue = in.nextInt();

        if (StringUtils.isEmpty(productName) || productValue <=0) {
       	System.out.println("invalid product --->");
       	return;
        }
        Product p = new Product(productName,productValue);
        
        List<Coin> coins = new ArrayList<Coin>();
        int sum = 0;
        while (true){
        	System.out.print("Enter Coin Name or type exit: ");
        	String coinName = in.next().toLowerCase();
        	if (coinName.equalsIgnoreCase("exit")){
        		break;
        	}
        	System.out.print("Enter Coin value: ");
        	int coinValue = in.nextInt();
        	coins.add(new Coin(coinName, coinValue));
        	
        }
        try{
        	
       
        Vending v = new Vending();
        v.acceptCoins(coins);
        List<Coin> invalids = v.getInvalidCoins();
        if (invalids.size() > 0){
        	System.out.println("invalid coins:--->");
        	for (Coin c: invalids)
        		System.out.println(c.getName());
        }
        System.out.println("Product:---------------->" + v.Vend(p));
        List<Coin> refunds = v.getRefundCoins();
        if (refunds.size() > 0){
        	System.out.println("refund Coins:--->");
        	for (Coin c: refunds)
        		System.out.println(c.getName());
        }
        } catch(Exception ex){
        	System.out.println(ex.getMessage());
        }
    }
}
