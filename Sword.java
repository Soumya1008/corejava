class Sword{

String cut;
String handle;
String drop;
String throw;


void cut()
{
System.out.println("invoked cut");
System.out.println(cut);
this.hunt();
}


static void hunt()
{
System.out.println("invoked hunt");
inject();
}

static void inject()
{
System.out.println("invoked inject");
}

public static void main(String[] satish)
{
	Sword sword=new Sword();
	sword.cut();
	sword.hunt();
	sword.inject();
}
}