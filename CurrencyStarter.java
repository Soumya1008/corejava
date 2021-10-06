class CurrencyStarter{

public static void main(String[] krishna){

Currency cur=new Currency();
cur.name="Rupee";
Country country=new Country();
cur.country=country;
cur.country=null;
cur.value="100p";
cur.displayDetails();

country.name="INDIA";
country.code="IND";
country.displayDetails();

Application app=new Application();
app.name="ABC";
app.version=19.0f;
Company company=new Company();
app.company=company;
app.company=null;
app.displayDetails();

company.name="Wipro";
company.country=cur.country;
company.ceo="sanjiv";
company.cfo="jatin";
company.displayDetails();
}

}