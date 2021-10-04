class Hospital{
public static void main(String args[]){
covidward("Rahman",666,false);
}

static void covidward(String name,int reg_no,boolean f_report){

String p_Name=name;
int id=reg_no;
boolean report=f_report;

System.out.println("name of the patient>"+p_Name);
System.out.println("id of the patient>"+id);
System.out.println("covid report>"+f_report);
}

} 