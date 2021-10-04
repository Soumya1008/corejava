class NailCutter{

String toolname;
String brand;
String type;
String material;
CutterSize size;

void nailcutting()
{
System.out.println("invoked nailcutting");
System.out.println("NailCutter Details");
System.out.println(toolname);
System.out.println(brand);
System.out.println(type);
System.out.println(material);
System.out.println(size);
}
void nailcleaning()
{
System.out.println("invoked nailcleaning");
System.out.println("NailCutter Details");
System.out.println(toolname);
System.out.println(brand);
System.out.println(type);
System.out.println(material);
System.out.println(size);
}

public static void main(String[] args){

NailCutter nailcutter=new NailCutter();
nailcutter.toolname="Nail Scisser";
nailcutter.brand="vega";
nailcutter.type="finger nail";
nailcutter.material="metal";
nailcutter.size=CutterSize.SMALL;

NailCutter nailcutter1=new NailCutter();
nailcutter1.toolname="Nail nipper";
nailcutter1.brand="kai";
nailcutter1.type="toe and finger nail";
nailcutter1.material="metal";
nailcutter1.size=CutterSize.LARGE;

NailCutter nailcutter2=new NailCutter();
nailcutter2.toolname="Nail guillotine";
nailcutter2.brand="prosfia";
nailcutter2.type="toe nail";
nailcutter2.material="metal";
nailcutter2.size=CutterSize.SMALL;

nailcutter.nailcutting();
nailcutter1.nailcutting();
nailcutter2.nailcutting();

nailcutter.nailcleaning();
nailcutter1.nailcleaning();
nailcutter2.nailcleaning();
}
}