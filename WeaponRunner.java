class WeaponRunner{
public static void main(String[] args){

Weapon ref=new Weapon();
System.out.println(ref.brand);
System.out.println(ref.type);
System.out.println(ref.price);
System.out.println(ref.noofbullets);
System.out.println(ref.height);
System.out.println(ref.weight);
System.out.println(ref.width);
System.out.println(ref.color);
System.out.println(ref.myear);

String brand="AK47";
String type="abc";
float price=2000;
int noofbullets=5;
float height=4.1f;
float weight=10.0f;
float width=10.0f;
String madeinctry="INDIA";
String color="black";
int myear=2021;

Weapon ref1=new Weapon(brand,type,price,noofbullets,height,weight,width,madeinctry,color,myear);
System.out.println(ref1.brand);
System.out.println(ref1.type);
System.out.println(ref1.price);
System.out.println(ref1.noofbullets);
System.out.println(ref1.height);
System.out.println(ref1.weight);
System.out.println(ref1.width);
System.out.println(ref1.color);
System.out.println(ref1.myear);

Weapon ref2=new Weapon("french75",3000);
System.out.println(ref2.brand);
System.out.println(ref2.price);

Weapon ref3=new Weapon("french75","blue");
System.out.println(ref3.brand);
System.out.println(ref3.color);

Weapon ref4=new Weapon("AK47",2021);
System.out.println(ref4.brand);
System.out.println(ref4.myear);

Weapon ref5=new Weapon("INDIA");
System.out.println(ref5.madeinctry);



}


}