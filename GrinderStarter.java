class GrinderStarter{

public static void main(String[] kitkat)
{

Grinder grinder=new Grinder(100,"preeti");
System.out.println(grinder.capacity);
System.out.println(grinder.company);

int capacity=grinder.capacity;
String company=grinder.company;
Motar motar=grinder.motar;

System.out.println(motar.model);
System.out.println(motar.rpm);
}
}