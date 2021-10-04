class WeatherStarter{

public static void main(String[] args)
{
Weather weather=new Weather(6);
weather.name="SUMMER";
weather.month="feb-may";
weather.duration=4;
weather.type=WeatherType.HOT;

Weather weather1=new Weather(6);
weather1.name="WINTER";
weather1.month="oct-jan";
weather1.duration=4;
weather1.type=WeatherType.COLD;

System.out.println(weather.name);
System.out.println(weather.month);
System.out.println(weather.duration);
System.out.println(weather.type);

System.out.println(weather1.name);
System.out.println(weather1.month);
System.out.println(weather1.duration);
System.out.println(weather1.type);


}
}