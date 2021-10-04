class DeveloperRunner{

public static void main(String[] args){

Developer ref=new Developer();

String lang=ref.lang;
String type=ref.type;
float salary=ref.salary;
System.out.println(ref.lang);
System.out.println(ref.type);
System.out.println(ref.salary);

ref.lang="Java";
ref.type="senior";
ref.salary=12.5f;
System.out.println(ref.lang);
System.out.println(ref.type);
System.out.println(ref.salary);


Developer ref1=new Developer();
System.out.println(ref1.lang);
System.out.println(ref1.type);
System.out.println(ref1.salary);

ref1.lang="JavaScript";
ref1.type="Junior";
ref1.salary=10.0f;
System.out.println(ref1.lang);
System.out.println(ref1.type);
System.out.println(ref1.salary);

Developer ref2=new Developer();
System.out.println(ref2.lang);
System.out.println(ref2.type);
System.out.println(ref2.salary);

ref2.lang="python";
ref2.type="senior";
ref2.salary=13.8f;
System.out.println(ref2.lang);
System.out.println(ref2.type);
System.out.println(ref2.salary);


Developer ref3=new Developer();
System.out.println(ref3.lang);
System.out.println(ref3.type);
System.out.println(ref3.salary);

ref3.lang="python";
ref3.type="senior";
ref3.salary=13.0f;
System.out.println(ref3.lang);
System.out.println(ref3.type);
System.out.println(ref3.salary);

Developer ref4=new Developer();
System.out.println(ref4.lang);
System.out.println(ref4.type);
System.out.println(ref4.salary);

ref4.lang="Testing";
ref4.type="Junior";
ref4.salary=11.5f;
System.out.println(ref4.lang);
System.out.println(ref4.type);
System.out.println(ref4.salary);



}

}