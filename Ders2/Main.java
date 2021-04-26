package Ders2;

public class Main {
    public static void main(String[] args) {
        /*kodlama.io sitesinde üç adet özellik nesnesi olarak tanımlanmış kurslar
        vardır.*/
        //yeni kursun bilgileri oluşturuluyor
        Course course1 = new Course(1,"Engin Demiroğ","Ücretsiz C#");
        Course course2 = new Course(2,"Engin Demiroğ","Java-React");
        //Kursları class'a atıyoruz
        Course[] courses = {course1,course2};
        System.out.println(courses.length);

        for(Course kurs: courses ){
            System.out.println(kurs.detail);
        }

        Manager coursemanager =new Manager();
        coursemanager.joinProgram(course2);

        Manager Reg = new Manager();
        Reg.register(course1);

    }
}
