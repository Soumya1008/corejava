class FoodItemStarter{

public static void main(String[] satish){

FoodItem item=new FoodItem("bhaji",50,"shantisagar",1,ItemType.CRISPY,"1star",OrderType.OFFLINE);
item.displayDetails();
item.printTotalPrice();

FoodItem item1=new FoodItem("Noodles",150,"shantisagar",2,ItemType.SPICY,"5star",OrderType.ONLINE);
item1.displayDetails();
item1.printTotalPrice();

item.hotelName();
item.printTotalFoodItemsPrice();
}



}