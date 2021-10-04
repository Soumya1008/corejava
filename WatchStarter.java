class WatchStarter{

public static void main(String[] kitkat)
{
//primitive=initialization
//non primitive=instantiation

Watch watch=new Watch(467,"Rolex");
System.out.println(watch.model);
System.out.println(watch.brand);
int model=watch.model;
String brand=watch.brand;
Light light=watch.light;
System.out.println(light.on);

}

}