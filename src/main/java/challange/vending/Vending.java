package challange.vending;

import java.util.ArrayList;
import java.util.List;

public class Vending {
	
	private List<Coin> coins;
	private List<Coin> refundCoins;
	private List<Coin> invalidCoins;
	
	
	public List<Coin> getInvalidCoins() {
		return invalidCoins;
	}



	public boolean acceptCoins(List<Coin> coins){
		validate(coins);
		return this.coins.size() > 0; 
	}
	
	

	public String Vend(Product product) throws Exception{
		int totalValue = calculateCoins();
		
		if (totalValue < product.getPrice()){
			throw new Exception("Insuffient Fund!");
		} else if (totalValue > product.getPrice()){
			this.setRefundCoins(refundCoins(totalValue- product.getPrice()));
		} 
		return product.getName();

	}
	
	public List<Coin> refundAllCoins() {
		int totalValue = calculateCoins();
		return refundCoins(totalValue);

	}

	private List<Coin> refundCoins(int total) {
		List<Coin> returnCoins = new ArrayList<Coin>();
		for (Coin c : Coin.LARGETOSMALL)
		{
			int numCoins = total / c.getValue();
			for (int i = 0; i< numCoins; i++)
			{
				returnCoins.add(c);
			}
			total = total % c.getValue();
		}
		return returnCoins;
	}


	private int calculateCoins() {
		int sum = 0;
		if (this.coins == null || this.coins.size() == 0) return sum;
		for(Coin c: this.coins){
			sum += c.getValue();
		}
		return sum;
			
	}


	

	private void validate(List<Coin> coins){
		this.invalidCoins = new ArrayList<Coin>();
		this.coins = new ArrayList<Coin>(); 
		for (Coin coin: coins){
			if (coin.isValid()){
				this.coins.add(coin);
			} else {
				this.invalidCoins.add(coin);
			}
		}
	}
	

	public List<Coin> getCoins() {
		return this.coins;
	}



	public List<Coin> getRefundCoins() {
		return refundCoins;
	}



	public void setRefundCoins(List<Coin> refundCoins) {
		this.refundCoins = refundCoins;
	}


	
}
