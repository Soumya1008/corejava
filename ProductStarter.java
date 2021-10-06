class ProductStarter{

public static void main(String[] satish){

Product pro=new Product("Hair Dryer","EC",700,2,"Philips");
pro.displayDetails();
pro.printTotalCost();

Product pro1=new Product("Hair Straightner","EC",800,4,"Philips");
pro1.printTotalCost();

Product.printTotalProductsPrice();

}



}