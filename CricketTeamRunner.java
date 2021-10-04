class CricketTeamRunner{
public static void main(String[] args){

CricketTeam ref=new CricketTeam();
System.out.println(ref.name);
System.out.println(ref.type);
System.out.println(ref.capname);
System.out.println(ref.noofplayers);
System.out.println(ref.coachname);
System.out.println(ref.ground);
System.out.println(ref.country);
System.out.println(ref.jcolor);
System.out.println(ref.year);

String name="Dhoni";
String type="IPL";
String capname="Dhoni";
int noofplayers=12;
String coachname="abc";
String ground="home ground";
String country="INDIA";
String jcolor="blue";
int year=2021;

CricketTeam ref1=new CricketTeam(name,type,capname,noofplayers,coachname,ground,country,jcolor,year);
System.out.println(ref1.name);
System.out.println(ref1.type);
System.out.println(ref1.capname);
System.out.println(ref1.noofplayers);
System.out.println(ref1.coachname);
System.out.println(ref1.ground);
System.out.println(ref1.country);
System.out.println(ref1.jcolor);
System.out.println(ref1.year);

CricketTeam ref2=new CricketTeam("Dhoni","20-20","Dhoni");
System.out.println(ref2.name);
System.out.println(ref2.type);
System.out.println(ref2.capname);

CricketTeam ref3=new CricketTeam("virat","blue");
System.out.println(ref3.name);
System.out.println(ref3.jcolor);

CricketTeam ref4=new CricketTeam("virat",2021);
System.out.println(ref4.name);
System.out.println(ref4.year);

CricketTeam ref5=new CricketTeam("INDIA");
System.out.println(ref5.country);



}


}