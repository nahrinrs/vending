package challange.vending;

public class Coin {
	public final static String PENNY_COIN = "penny";
	public final static int PENNY_VALUE = 1;
	public final static String NICKEL_COIN = "nickel";
	public final static int NICKEL_VALUE = 5;
	public final static String DIME_COIN = "dime";
	public final static int DIME_VALUE = 10;
	public final static String QUARTER_COIN = "quarter";
	public final static int QUARTER_VALUE = 25;
	
	public final static Coin PENNY = new Coin(PENNY_COIN, 1);
	public final static Coin NICKEL = new Coin(NICKEL_COIN, 5);
	public final static Coin DIME = new Coin(DIME_COIN, 10);
	public final static Coin QUARTER = new Coin(QUARTER_COIN, 25);
	public final static Coin[] LARGETOSMALL = { QUARTER, DIME, NICKEL, PENNY };
	
	private String name;
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Coin(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean isValid(){
		return (this.equals(PENNY)) || (this.equals(NICKEL)) || 
				(this.equals(DIME)) || (this.equals(QUARTER));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coin other = (Coin) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
}
