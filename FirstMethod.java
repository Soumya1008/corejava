class FirstMethod{
public static void main(String args[]){
	System.out.println("This is main method");
first();//callingmethod
second();
}
static void first(){
	int id=108;//as local variable
	String Name="soumya";
	char Lname='p';
	String gender="Female";
	/*boolean Female=(gender=="Female");
	boolean Male=(gender=="Male");*/
	String BldGrp="B+";
	
	
	
System.out.println("This is first details");
System.out.println("id:"+id);
System.out.println("Name:"+Name);
System.out.println("Lname:"+Lname);
System.out.println("gender:"+gender);
System.out.println("BldGrp:"+BldGrp+"\n");
}


static void second(){
	int id=1008;//as local variable
	String Name="satish";
	char Lname='p';
	String gender="Male";
	/*boolean Female=(gender=="Female");
	boolean Male=(gender=="Male");*/
	String BldGrp="O";
	
	System.out.println("This is second details");
System.out.println("id:"+id);
System.out.println("Name:"+Name);
System.out.println("Lname:"+Lname);
System.out.println("gender:"+gender);
System.out.println("BldGrp:"+BldGrp);
}

}