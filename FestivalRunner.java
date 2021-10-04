class FestivalRunner{
public static void main(String[] args){

Festival ref=new Festival();
System.out.println(ref.name);
System.out.println(ref.religion);
System.out.println(ref.godname);
System.out.println(ref.noofdays);
System.out.println(ref.sdate);
System.out.println(ref.edate);
System.out.println(ref.country);
System.out.println(ref.subname);


String name="Mahaveer jayanti";
String religion="jain";
String godname="mahaveer";
int noofdays=1;
String sdate="april 25";
String edate="april 25";
String country="INDIA";
String subname="same";

Festival ref1=new Festival(name,religion,godname,noofdays,sdate,edate,country,subname);
System.out.println(ref1.name);
System.out.println(ref1.religion);
System.out.println(ref1.godname);
System.out.println(ref1.noofdays);
System.out.println(ref1.sdate);
System.out.println(ref1.edate);
System.out.println(ref1.country);
System.out.println(ref1.subname);

Festival ref2=new Festival("Mahaveer Jayanti","mahaveer");
System.out.println(ref2.name);
System.out.println(ref2.godname);

Festival ref3=new Festival("mahaveer Jayanti",1);
System.out.println(ref3.name);
System.out.println(ref3.noofdays);

Festival ref4=new Festival("jain","april 25","april 25");
System.out.println(ref4.religion);
System.out.println(ref4.edate);
System.out.println(ref4.sdate);

Festival ref5=new Festival("INDIA");
System.out.println(ref5.country);



}


}