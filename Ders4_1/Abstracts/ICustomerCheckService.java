package Ders4_1.Abstracts;

import Ders4_1.Entities.Customer;

public interface ICustomerCheckService {
    boolean CheckIfRealPerson(Customer customer) throws Exception;
}
