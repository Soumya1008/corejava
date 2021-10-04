class LaboratoryRunner{

public static  void main(String[] ganesh){
	
	String name="CS";
	String location="3rd floor";
	int noOfRooms=2;
	String[] operatornames={"bakale","bhagavati","raashree","anand","shweta"};
	LabType type=LabType.ELE;
	

Laboratory lab=new Laboratory(name,location,noOfRooms,operatornames,type);
System.out.println(lab.name);
System.out.println(lab.location);
System.out.println(lab.noOfRooms);
System.out.println(lab.operatornames[0]);
System.out.println(lab.operatornames[1]);
System.out.println(lab.operatornames[2]);
System.out.println(lab.operatornames[3]);
System.out.println(lab.operatornames[4]);
System.out.println(lab.type);
//lab.noOfRooms=4;
//System.out.println(lab.noOfRooms);



}
}