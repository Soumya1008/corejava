class ChocolateRunner{

public static void main(String[] chapati){


Chocolate ChocoRef=new Chocolate();

String brand=ChocoRef.brand;
System.out.println(brand);


float price=ChocoRef.price;
System.out.println(price);

float weight=ChocoRef.weight;
System.out.println(weight);


ChocoRef.brand="cadberry";

brand=ChocoRef.brand;
System.out.println(brand);
ChocoRef.price=40.0f;
System.out.println(ChocoRef.price);

Chocolate ChocoRef1=new Chocolate();
System.out.println(ChocoRef1.brand);
System.out.println(ChocoRef1.price);
System.out.println(ChocoRef1.weight);
System.out.println(ChocoRef1.weight==ChocoRef.weight);

float tempweight=100.0f;
ChocoRef1.weight=tempweight;
System.out.println(ChocoRef1.weight==ChocoRef.weight);





}




}