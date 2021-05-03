package Abstracts;

public class Main {
    public static void main(String[] args){
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager= new OracleDatabaseManager();//Bu satır çok önemli
        customerManager.getCustomers();
    }
}