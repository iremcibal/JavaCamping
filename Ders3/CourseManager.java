package Ders3;

public class CourseManager {

    public void instructorAdd(User user){
        System.out.println("Yeni eğitmen eklendi: " + user.getFirstName() + user.getLastName());
    }

    public void studentAdd(User user,Course course){
        System.out.println(course.getCourseName() + " Kursuna yeni öğrenci eklendi: " + user.getFirstName() + user.getLastName());
    }

    public void courseAdd(Course course){
        System.out.println("Yeni bir kurs eklendi: " + course.getCourseName());
    }
    //X kursunun öğrenci listesini dolanarak kursun öğrencilerini verir.
    public void courseList(Course course,User[] users){
        for(User user : users){
            System.out.println(course.getCourseName() + " Kursunun öğrenci Listesi: " + user.getFirstName() + user.getLastName());
        }
    }

}
