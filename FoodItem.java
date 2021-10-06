class FoodItem{

String name;
float price;
String hotelName;
int quantity;
ItemType itemType;
String rating;
OrderType orderType;
static float totalFoodItemsPrice;

FoodItem(String name,float price,String hotelName,int quantity,ItemType itemType,String rating,OrderType orderType)
{
this.name=name;
this.price=price;
this.hotelName=hotelName;
this.quantity=quantity;
this.itemType=itemType;
this.rating=rating;
this.orderType=orderType;
System.out.println("invoked 7 parameters const");		
}

FoodItem(String name,float price,String hotelName,int quantity)
{
this.name=name;
this.price=price;
this.hotelName=hotelName;
this.quantity=quantity;
System.out.println("invoked 4 parameters const");

}

void displayDetails()
{
System.out.println(this.name);
System.out.println(this.price);
System.out.println(this.hotelName);
System.out.println(this.quantity);
System.out.println(this.itemType);
System.out.println(this.rating);
System.out.println(this.orderType);

}

void printTotalPrice()
{
	float total=this.price*this.quantity;
    System.out.println("Total cost:"+total);
	totalFoodItemsPrice=totalFoodItemsPrice+total;
    System.out.println("totalFoodItemsPrice:"+totalFoodItemsPrice);
}
void hotelName()
{
	System.out.println("hotelName:"+hotelName);
	System.out.println("name and price:"+name+ "    " +price);
	
}
static void printTotalFoodItemsPrice()
{
	System.out.println("Total fooditem price:"+totalFoodItemsPrice);

}
}