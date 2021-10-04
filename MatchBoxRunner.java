class MatchBoxRunner{

public static void main(String[] ganesh){

String brand="Anil";
int noOfSticks=40;
MatchSize size=MatchSize.SMALL; 
boolean empty=true;

MatchBox ref=new MatchBox(brand,noOfSticks,size,empty);
System.out.println(ref.brand);
System.out.println(ref.noOfSticks);
System.out.println(ref.size);
System.out.println(ref.empty);


}

}