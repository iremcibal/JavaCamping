package Ders4_1.Concrete;

import Ders4_1.Abstracts.ICustomerCheckService;
import Ders4_1.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer){
        return true;
    }
}
