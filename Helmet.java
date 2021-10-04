class Helmet{

String name;
String type;
String color;
float price;
HelmetSize size;

void accidentprotection()
{
System.out.println("invoked accident protection");
//System.out.println("Helmet details");
	
}
void airprotection()
{
System.out.println("invoked air protection");
System.out.println("Helmet details");
System.out.println(name);
System.out.println(type);	
System.out.println(color);
System.out.println(price);
System.out.println(size);
}
public static void main(String[] args){
	
Helmet helmet=new Helmet();
helmet.name="vega";
helmet.type="flipup";
helmet.color="black";
helmet.price=900.0f;
helmet.size=HelmetSize.SMALL;

Helmet helmet1=new Helmet();
helmet1.name="steelbird";
helmet1.type="Regular";
helmet1.color="brown";
helmet1.price=1900.0f;
helmet1.size=HelmetSize.MEDIUM;

Helmet helmet2=new Helmet();
helmet2.name="shork";
helmet2.type="sports";
helmet2.color="black";
helmet2.price=2900.0f;
helmet2.size=HelmetSize.LARGE;

helmet.accidentprotection();
helmet.airprotection();
helmet1.airprotection();
helmet2.airprotection();
}
}