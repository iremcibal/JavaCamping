package Ders4_1;

import Ders4_1.Abstracts.BaseCustomerManager;
import Ders4_1.Adapters.MernisServiceAdapters;
import Ders4_1.Concrete.NeroCustomerManager;
import Ders4_1.Concrete.StarbucksCustomerManager;
import Ders4_1.Entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer1 = new Customer(2,"İrem","Balcı",1999 ,"42898908570");

        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
        baseCustomerManager.save(customer1);
        System.out.println();


    }
}