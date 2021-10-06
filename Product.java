class Product{

String name;
String type;
float price;
int quantity;
String vender;
static float totalProductsPrice;
//no of parameters
//order/sequence
//change in datatype

Product(String name,String type,float price,int quantity,String vender)
{
this.name=name;
this.type=type;
this.price=price;
this.quantity=quantity;
this.vender=vender;
System.out.println("invoked 5 parameters const");	
}

Product(String name,float price,int quantity)
{
this.name=name;
this.price=price;
this.quantity=quantity;
System.out.println("invoked 3 parameters const");	
}

void displayDetails()
{
System.out.println(this.name);
System.out.println(this.type);
System.out.println(this.price);
System.out.println(this.quantity);
System.out.println(this.vender);

}

void printTotalCost()
{

float total=this.price*this.quantity;
System.out.println("Total cost:"+total);
totalProductsPrice=totalProductsPrice+total;
System.out.println("Total product price:"+totalProductsPrice);	
	
}

static void printTotalProductsPrice()
{
	System.out.println("Total products price:"+totalProductsPrice);
}

}