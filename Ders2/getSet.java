package Ders2;

public class getSet {
    public static void main(String[] args) {
        /*Encapsulation;herhangi bir nesnenin metotlarını,
        verilerini ve değiskenlerini diğer nesnelerden saklayarak ve bunlara erişimini
        sınırlandırarak yanlış kullanımlardan koruyan bir konsepttir.*/
        //public-herkese açık
        //private-özel(Tanımlandığı blokta geçerli)

        Product product = new Product();
        product.setName("Laptop");
        product.setId(2);

        System.out.println(product.getKod());

    }
}