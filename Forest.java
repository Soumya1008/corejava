class Forest{

String name;
String location="bglr";
String reserved;
State state;

Forest(String reserved)
{
this.reserved=reserved;
}

Forest(String reserved,String location)
{
this(reserved);
this.location=location;


}


}