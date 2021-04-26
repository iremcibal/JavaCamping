package Ders2;

public class Main {
    public static void main(String[] args) {
        /*kodlama.io sitesinde üç adet özellik nesnesi olarak tanımlanmış kurslar
        vardır.*/
        //yeni kursun bilgileri oluşturuluyor
        course course1 = new course(1,"Engin Demiroğ","Ücretsiz C#");
        course course2 = new course(2,"Engin Demiroğ","Java-React");
        //Kursları class'a atıyoruz
        course[] courses = {course1,course2};
        System.out.println(courses.length);

        for(course kurs: courses ){
            System.out.println(kurs.detail);
        }

        Manager coursemanager =new Manager();
        coursemanager.joinProgram(course2);

        Manager Reg = new Manager();
        coursemanager.register(course1);

    }
}
