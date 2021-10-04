class car{
public static void main(String args[]){

String cars[]={"TATA","HONDA","SWIFT","BENZ"};
System.out.println("Car names:"+cars[3]);
Brand_name();
}

static void Brand_name(){
String B_name="CLS";
System.out.println("Brand name:"+B_name);
Color();
}

static void Color(){
String car_color="White";
System.out.println("car color:"+car_color);
Car_type();
}

static void Car_type(){
String c_type = "Petrol";
System.out.println("car type:"+c_type);
}

}