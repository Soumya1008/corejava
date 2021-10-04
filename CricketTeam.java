class CricketTeam{

String name;
String type;
String capname;
int noofplayers;
String coachname;
String ground;
String country;
String jcolor;
int year;


CricketTeam()
{
System.out.println("default constructor");

}
CricketTeam(String name,String type,String capname,int noofplayers,String coachname,String ground,String country,String Jcolor,int year)
{
System.out.println("parameterized constructor");

this.name=name;
this.type=type;
this.capname=capname;
this.noofplayers=noofplayers;
this.coachname=coachname;
this.ground=ground;
this.country=country;
this.jcolor=jcolor;
this.year=year;

}

CricketTeam(String name,String type,String capname)
{
System.out.println("name and type const");
this.name=name;
this.type=type;
this.capname=capname;
}

CricketTeam(String name,String jcolor)
{
	System.out.println("string and string const");
this.name=name;
this.jcolor=jcolor;
}
CricketTeam(String name,int year)
{
	System.out.println("string and int const");
this.name=name;
this.year=year;
}
CricketTeam(String country)
{
	System.out.println("string is const");
this.country=country;
}
}
