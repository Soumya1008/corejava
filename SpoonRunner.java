class SpoonRunner{

public static void main(String[] kitkat){

Spoon Ref=new Spoon();

String brand=Ref.brand;
float price=Ref.price;
float weight=Ref.weight;
System.out.println(brand);
System.out.println(price);
System.out.println(weight);


Ref.brand="VIP";
System.out.println(Ref.brand);
 Ref.price=20.0f;
System.out.println(Ref.price);
Ref.weight=40.0f;
System.out.println(Ref.weight);


Spoon Ref1=new Spoon();
System.out.println(Ref1.brand);
System.out.println(Ref1.price);
System.out.println(Ref1.weight);
System.out.println(Ref1.weight==Ref.weight);

/*float tempweight=50.0f;
tempweight=Ref1.weight;
System.out.println(Ref1.weight==Ref.weight);
*/

Ref1.brand="ABC";
System.out.println(Ref1.brand);
Ref1.price=30.0f;
System.out.println(Ref1.price);
Ref1.weight=40.0f;
System.out.println(Ref1.weight);


Spoon Ref2=new Spoon();
System.out.println(Ref2.brand);
System.out.println(Ref2.price);
System.out.println(Ref2.weight);
System.out.println(Ref2.weight==Ref1.weight);

Ref2.brand="XYZ";
System.out.println(Ref2.brand);
Ref2.price=35.0f;
System.out.println(Ref2.price);
Ref2.weight=70.0f;
System.out.println(Ref2.weight);


Spoon Ref3=new Spoon();
System.out.println(Ref3.brand);
System.out.println(Ref3.price);
System.out.println(Ref3.weight);
System.out.println(Ref3.weight==Ref2.weight);


Ref3.brand="ODC";
System.out.println(Ref3.brand);
Ref3.price=25.0f;
System.out.println(Ref3.price);
Ref3.weight=60.0f;
System.out.println(Ref3.weight);


Spoon Ref4=new Spoon();
System.out.println(Ref4.brand);
System.out.println(Ref4.price);
System.out.println(Ref4.weight);
System.out.println(Ref4.weight==Ref3.weight);




}


}