class Mobile{
public static void main(String args[])
{
String Models[]={"Apple","Samsung","Redmi","Vivo"};

System.out.println("mobile names:"+Models[2]);

phone_num();
}

static void phone_num(){
long  pn= 7483161861l;
System.out.println("Redmi p_num:"+pn);
//System.out.println("\n");
operater();
}

static void operater(){
String name="jio";
System.out.println("operator name:"+name);
//System.out.println("\n");
plan();

}

static void plan(){
double p_price=599d;
System.out.println("plan:"+p_price);
//System.out.println("\n");
}

}