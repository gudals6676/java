
public class Product {

	private String name;
	private int unitprice;
	private int amount;
	
	public Product() {
		super();
	}
	public Product(String name, int unitprice, int amount) {
		super();
		this.name = name;
		this.unitprice = unitprice;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public int getUnitprice() {
		return unitprice;
	}
	public int getAmount() {
		return amount;
	}
	
}
