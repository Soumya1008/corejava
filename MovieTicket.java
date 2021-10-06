class MovieTicket{

String movieName;
String theater;
float price;
int noOfSeats;
TicketType ticketType;
static float totalPrice;

MovieTicket(String movieName,String theater,float price,int noOfSeats,TicketType ticketType)
{
this.movieName=movieName;
this.theater=theater;
this.price=price;
this.noOfSeats=noOfSeats;
this.ticketType=ticketType;
System.out.println("invoked 5 parameters const");

}

MovieTicket(String movieName,String theater,float price)
{
this.movieName=movieName;
this.theater=theater;
this.price=price;
System.out.println("invoked 3 parameters const");

}
void displayDetails()
{
System.out.println(this.movieName);
System.out.println(this.theater);
System.out.println(this.price);
System.out.println(this.noOfSeats);
System.out.println(this.ticketType);
	
}
void printTotalCost()
{
 float total=this.price*this.noOfSeats;
 System.out.println("Total cost:"+total);
 totalPrice=totalPrice+total;
 System.out.println("TotalPrice:"+totalPrice);
}
static void printTotalPrice()
{
System.out.println("printTotalPrice:"+totalPrice);
}
}