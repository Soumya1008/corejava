class Lighter{

public static void onButton(boolean pointArg){

System.out.println("invoked onButton");
boolean point=pointArg;
if(point)
{
System.out.println("button is on");
}
//System.out.println("after if...");
}

public static boolean offButton(String button){
if(button==null)
{
System.out.println("button is on");
return false;
}
System.out.println("button is off");
return true;
}

public static boolean light(int width){
	if(width>0)
	{
		return true;
	}
		return false;
	
}
}




