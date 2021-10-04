class Saloon{

 String name;
 String location;
 float openTime;
 float closeTime;
 SaloonBranch branch;
 
 
 void haircut(){
 System.out.println("invoked haircut");
 System.out.println("Saloon details");
 System.out.println(name);
 System.out.println(location);
 System.out.println(openTime);
 System.out.println(closeTime);
 System.out.println(branch);
 }

public static void main(String[] ganesh)
{
Saloon saloon=new Saloon();
saloon.name="Green Trends";
saloon.location="BTM";
saloon.openTime=9.0f;
saloon.closeTime=9.0f;
saloon.branch=SaloonBranch.BTM;

Saloon saloon1=new Saloon();
saloon1.name="YLG";
saloon1.location="JAYANAGAR";
saloon1.openTime=9.0f;
saloon1.closeTime=8.0f;
saloon1.branch=SaloonBranch.JAYANAGAR;

saloon.haircut();
saloon1.haircut();



}

}