class ForestStarter{

public static void main(String[] satish){
	
Forest ref;
ref=new Forest("Reserved","Bannergatt");
System.out.println(ref.name);
System.out.println(ref.location);
System.out.println(ref.reserved);
System.out.println(ref.state);
ref.name="bannerugatt zoo";
ref.state=new State();
System.out.println(ref.state);
System.out.println(ref);
	
String loc=ref.location;
System.out.println(loc);
State state=ref.state;
String name=state.name;
int noOfDistricts=state.noOfDistricts;
String cmName=state.cmName;
CapitalCity city=state.city;

System.out.println(name);
System.out.println(noOfDistricts);
System.out.println(cmName);
System.out.println(city);
state.name="karnataka";
state.cmName="basavaraj bomai";

System.out.println(name);
System.out.println(cmName);


//state.city=new CapitalCity();
//System.out.println(state.capitalCity);
//System.out.println(state);


//CapitalCity city=state.city;
//String name=city.name;
String population=city.population;
String famousFor=city.famousFor;

System.out.println(name);
System.out.println(population);
System.out.println(famousFor);
city.name="bglr";
city.famousFor="IT";

System.out.println(name);
System.out.println(population);
System.out.println(famousFor);





	
	
	
}

}