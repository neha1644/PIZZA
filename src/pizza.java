

public class pizza {
	String Name;
	int price;
	int quantity;
	String type;
	int rate;
	

	public pizza(String Name, int price, int quantity, String type) {
		
		this.Name=Name;
		this.price=price;
		this.quantity=quantity;
		this.type=type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getrate() {
		return rate;
	}
	public void setrate(int finalrate) {
		rate = rate;
	}
	
	public void displayDetails()
	{
		System.out.println("- - - - - Pizza Details - - - - -");
		System.out.println("Pizza Name : " +getName());
		System.out.println("Pizza Type : " +getType());
		System.out.println("Pizza Quantity :" +getQuantity());
	}
	
	public int generatePrice()
	{
		rate=this.getPrice()*this.getQuantity();
		
		return rate;
		
	}
	
	

}