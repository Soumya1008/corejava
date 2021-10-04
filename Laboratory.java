class Laboratory{

String name;
String location;
int noOfRooms;
String[] operatornames;
LabType type;

Laboratory(String name,String location,int noOfRooms,String[] operatornames,LabType type)
{
System.out.println("invoking const...string,string,int,string[],type");
this.name=name;
this.location=location;
this.noOfRooms=noOfRooms;	
this.type=type;

this.operatornames=operatornames;

}
Laboratory()
{
	
}
}