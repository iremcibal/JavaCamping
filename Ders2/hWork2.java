package Ders2;

public class hWork2 {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj= sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
        //Variable Arguments
        int toplama = topla2(2,5,7,8,12);
        System.out.println(toplama);
    }
    /*Methodların türleri kullanıldıkları yer ile
    aynı olmalıdır.*/
    public static void ekle(){
        System.out.println("Eklendi");
        //void türünde methodlar sadece iş yapar.
    }
    public static String sehirVer(){
        return "Sinop";
    }

    public static int topla(int a,int b){
        return a+b;
    }
    public static int topla(int a,int b,int c){
        return a+b+c;
    }//Method overloading:Parametrelerinin imzasının farklı olmasından dolayı methodlar ikisi de aynı isimle kullanılır

    //Çoklu sayı göndermek ve toplamak
    public static int topla2(int... sayi){
        int toplam=0;
        for(int sayilar:sayi){
            toplam+=sayilar;
        }
        return toplam;
    }
}