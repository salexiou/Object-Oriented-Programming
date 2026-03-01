package tuc.ece.cs102.lib;

public class Medicine {
	private String code ;
	private String name;
	private int price;
	private int quantity;
	
public Medicine( String name, int price, String code) {
	this.code = code ;
	this.name = name;
	this.price = price;
	this.quantity = 0;
}

public Medicine(String code, int quantity , int price) {
	this.code = code;
	this.quantity = quantity;
	this.price = price;
}

public void  getFullDetails() {
	System.out.println("-------Medicine Info ------" );
	System.out.print("Code -> " +  this.code); 
	System.out.print(" , Name -> " + this.name);
	System.out.println(" , Price -> " + this.price + " $");
	}

public void  getDetailsForPrescriptions() {
	System.out.println("######## Prescription's Medicine Info ########" );
	System.out.print("Code -> " +  this.code); 
	System.out.print(" , Price -> " + this.price + " $ (for one medicine)");
	System.out.println(" , Quantity -> "+ this.quantity);
	}

public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
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

	}

