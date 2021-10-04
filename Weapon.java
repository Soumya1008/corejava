class Weapon{

String brand;
String type;
float price;
int noofbullets;
float height;
float weight;
float width;
String madeinctry;
String color;
int myear;

Weapon()
{
System.out.println("default constructor");

}
Weapon(String brand,String type,float price,int noofbullets,float height,float weight,float width,String madeinctry,String color,int myear)
{
System.out.println("parameterized constructor");

this.brand=brand;
this.type=type;
this.price=price;
this.noofbullets=noofbullets;
this.height=height;
this.weight=weight;
this.width=width;
this.madeinctry=madeinctry;
this.color=color;
this.myear=myear;

}

Weapon(String brand,float price)
{
System.out.println("string and float const");
this.brand=brand;
this.price=price;
}

Weapon(String brand,String color)
{
	System.out.println("string and string const");
this.brand=brand;
this.color=color;
}
Weapon(String brand,int myear)
{
	System.out.println("string and int const");
this.brand=brand;
this.myear=myear;
}
Weapon(String madeinctry)
{
	System.out.println("string is const");
this.madeinctry=madeinctry;
this.myear=myear;
}
}
