package Ders2;

public class Course { //java usulü veritabanı
    //Parametreli constructor
    public Course(int id,String name,String detail){
        this.id =id;
        this.name = name;
        this.detail=detail;
        //this-İçerisinde bulunduğum class'ın id'si
        //_id şeklinde kullanımın daha iyi olur
    }
    //Parametresiz constructor
    public Course(){

    }
    //Aynı adda constructorun oluşmasına overloading deniyor
    int id;
    String name;
    String detail;
}
