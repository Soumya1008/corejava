class MovieTicketStarter{

public static void main(String[] satish){


MovieTicket ticket=new MovieTicket("Mimi","Suvarna",200,2,TicketType.ONLINE);
ticket.displayDetails();
ticket.printTotalCost();

MovieTicket ticket1=new MovieTicket("Raj","Suvarna",150,4,TicketType.OFFLINE);
ticket1.displayDetails();
ticket1.printTotalCost();

ticket.printTotalPrice();

}
}