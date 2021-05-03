package Interfaces;
public class Main {
    public static void main(String[] args){
        /*ICustomerDal customerDal = new ICustomerDal() {
            @Override
            public void add() {

            }
        }interface'lerde abstractlar gibi newlenemezler.*/
        ICustomerDal customerDal =new OracleCustomerDal();
        //Manager'sız çalıştırmak
        /*interface; operasyonu implemente edilmesini istenen durumlarda kullanılır.*/

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }
}