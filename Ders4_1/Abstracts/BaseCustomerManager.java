package Ders4_1.Abstracts;

import Ders4_1.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
    public void save(Customer customer) throws Exception {
        System.out.println("Db kaydedildi: " + customer.getFirstName());
    }
}
