package Ders3;

public class Main {
    public static void main(String[] args) {
        //Yeni öğrenci nesnesi
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("İrem ");
        student1.setLastName("Balcı");

        Student student2 =new Student();
        student2.setId(2);
        student2.setFirstName("Haşim ");
        student2.setLastName("Balcı");
        //Diziye atamak öğrencileri listelemize yardımcı olacak
        Student[] students = {student1,student2};

        //Yeni eğitimci nesnesi bilgileri
        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setFirstName("Engin ");
        instructor1.setLastName("Demiroğ");
        //Yeni kurs bilgileri
        Course course1 = new Course(1,1,"Yazılım Geliştirme Kampı (C# + Angular)","2 Ay","Ücretsiz");
        Course course2 = new Course(2,1,"Yazılım Geliştirme Kampı (Java + React)","2 Ay","Ücretsiz");
        Course course3 = new Course(3,1,"Programlamaya Giriş için Temel Kurs (Python)","Null","Ücretsiz");
        //Eğitici datası güncelleniyor
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.courseAdd(instructor1,course1);
        instructorManager.courseAdd(instructor1,course2);
        instructorManager.courseAdd(instructor1,course3);
        //Öğrenci datasına öğrenci ekleniyor
        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);

        //Öğrenci kursa katılıyor
        CourseManager courseManager = new CourseManager();
        courseManager.studentAdd(student1,course2);
        courseManager.studentAdd(student2,course2);
        courseManager.courseList(course2,students);






    }
}