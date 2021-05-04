package Ders4_1.Adapters;

import Ders4_1.Abstracts.ICustomerCheckService;
import Ders4_1.Entities.Customer;
import Ders4_1.Service.IMKKPSPublicSoap;

public class MernisServiceAdapters implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception{
        IMKKPSPublicSoap client = new IMKKPSPublicSoap();
        return client.TCKimlikNoDogrula(
                Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getBirthday()
        );
    }
}
