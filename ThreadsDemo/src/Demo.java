
//import java.util.*
 class ToyDemo {

	public static void main(String[] args) {
		Toy one = new Toy("apple", "fruits", 80, 10);
		Toy two = new Toy("mango"," fruits", 60, 10);
		Toy three = new Toy("dog", "animal", 500, 20);
		Toy four = new Toy("cat", "animal", 350, 10);
		System.out.println("Least price toy name" + getLeastPriceToy(one, two, three, four, "animal"));
	}

	public static String getLeastPriceToy(Toy one,Toy two,Toy three,Toy four,String category)
	{
		Toy t1=one;
		if(two.getCategory().equals(category)&&
				(two.getPrice()*two.getDiscount())<(t1.getPrice()*t1.getDiscount())) {
			t1=two;
		}
		if(three.getCategory().equals(category)&&
				(three.getPrice()*three.getDiscount())<(t1.getPrice()*t1.getDiscount())) {
			t1=three;
		}
		if(four.getCategory().equals(category)&&
				(four.getPrice()*four.getDiscount())<(t1.getPrice()*t1.getDiscount())) {
			t1=four;
		}
	System.out.println("Rohini");	
		return t1.getName();
		
		
	}
}
	class Toy {
	private String name;
	private String category;
	private double price;
	private double discount;
	
	public Toy(String name, String category, double price, double discount) {
		this.name=name;
		this.category=category;
		this.price=price;
		this.discount=discount;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getDiscount() {
		return discount();
	}
	public void setDiscount(double discount) {
		this.discount=discount;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	


	public double discount() {
		return 0;
	}
}