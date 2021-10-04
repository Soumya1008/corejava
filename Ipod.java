class Ipod{

String modelname;
String types;
String color;
IpodSize size; 

void playmusic()
{
	System.out.println("invoked playMusic");
}
void watchvideo()
{
	System.out.println("invoked playMusic");
}
void ipod(){
System.out.println("ipod details");
System.out.println(modelname);
System.out.println(types);
System.out.println(color);
System.out.println(size);
}
public static void main(String[] args){
	
	Ipod ipod=new Ipod();
	ipod.modelname="ipodtouch";
	ipod.types="mini";
	ipod.color="black";
	ipod.size=IpodSize.TGB;
	
	Ipod ipod1=new Ipod();
	ipod1.modelname="ipodclassic";
	ipod1.types="mini";
	ipod1.color="white";
	ipod1.size=IpodSize.MINIGB;
	
	Ipod ipod2=new Ipod();
	ipod2.modelname="ipodshupp";
	ipod2.types="nano";
	ipod2.color="silver";
	ipod2.size=IpodSize.SHUFFLEGB;
	
	ipod.ipod();
	ipod1.ipod();
	ipod2.ipod();
}
}