class GasCylinderRunner{

public static void main(String[] ganesh){

GasCompany company=GasCompany.HP;
float price=800f;
float weight=90f;
int cylinderNo=12;
GasSize size=GasSize.MEDIUM;

GasCylinder gas=new GasCylinder(company,price,weight,cylinderNo,size);
System.out.println(gas.company);
System.out.println(gas.price);
System.out.println(gas.weight);
System.out.println(gas.cylinderNo);
System.out.println(gas.size);




}

}