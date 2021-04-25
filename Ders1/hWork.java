public class hWork{
    public static void main(String[] args){
        System.out.println("Hello Github");

        //Liste toplama ve maximum bulmak
        double[] myList = {1.2,3,6,8,10};
        double toTal=0;
        double max = myList[0];
        for(double number : myList){//important point
            if(max<number){
                max = number;
            }
            toTal = toTal +number;
            System.out.println(number);
        }
        System.out.println("Toplam:" + toTal);
        System.out.println("En büyük: " + max);
        //Stringler için bazı komutlar
        String mesaj= "Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.println("Eleman Sayısı:" + mesaj.length());
        System.out.println("5.Eleman:" + mesaj.charAt(4));

        //Asal Sayı Bulmak
        int number=13;
        boolean isPrime=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime==false){
            System.out.println("Sayi Asal Değildir.");
        }
        else{
            System.out.println("Sayimiz Asaldir.");
        }

        //Mükemmel Sayı
        int numberTwo=6;
        int total=0;
        for(int i=1;i<numberTwo;i++){
            if(numberTwo%i==0){
                total=total +i;
            }
        }
        if(total==numberTwo){
            System.out.println("Mükemmel Sayidir.");
        }else{
            System.out.println("Mükemmel Sayi Değildir.");
        }



    }
}
