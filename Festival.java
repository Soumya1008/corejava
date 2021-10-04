class Festival{

String name;
String religion;
String godname;
int noofdays;
String sdate;
String edate;
String country;
String subname;

Festival()
{
System.out.println("default constructor");

}
Festival(String name,String religion,String godname,int noofdays,String sdate,String edate,String country,String subname)
{
System.out.println("parameterized constructor");

this.name=name;
this.religion=religion;
this.godname=godname;
this.noofdays=noofdays;
this.sdate=sdate;
this.edate=edate;
this.country=country;
this.subname=subname;


}

Festival(String name,String godname)
{
System.out.println("name and godname const");
this.name=name;
this.godname=godname;
}

Festival(String name,int noofdays)
{
	System.out.println("string and int const");
this.name=name;
this.noofdays=noofdays;
}
Festival(String religion,String sdate,String edate)
{
	System.out.println("religion const");
this.religion=religion;
this.sdate=sdate;
this.edate=edate;
}
Festival(String country)
{
	System.out.println("string is const");
this.country=country;
}
}
