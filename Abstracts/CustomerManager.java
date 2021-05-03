package Abstracts;

public class CustomerManager {
    BaseDatabaseManager databaseManager;
    //Bu base sınıf stratejimiz sınıfını görüyor.Hangi database
    //sınıfını verirsek o çalışcak
    public void getCustomers(){
        /*OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();
        Burada koda katı bir şekilde bağlı olmuş oluyoruz.İstemediğimiz
        bir şey*/
        databaseManager.getData();
    }
}
