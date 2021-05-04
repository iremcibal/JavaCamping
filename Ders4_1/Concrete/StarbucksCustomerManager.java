package Ders4_1.Concrete;

import Ders4_1.Abstracts.BaseCustomerManager;
import Ders4_1.Abstracts.ICustomerCheckService;
import Ders4_1.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
        }else {
            throw new Exception("Not a valid person");
        }
    }

}
