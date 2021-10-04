class GuitarStarter{

public static void main(String[] pongal)
{

Guitar guitar=new Guitar(5000.0f);
guitar.brand="YAMAHA";
guitar.noOfStrings=6;
guitar.cost=7000.0f;

Guitar guitar1=new Guitar(3000.0f);
guitar1.brand="YAMAHA";
guitar1.noOfStrings=6;
guitar1.cost=7000.0f;

System.out.println(guitar.brand);
System.out.println(guitar.noOfStrings);
System.out.println(guitar.cost);
}

}