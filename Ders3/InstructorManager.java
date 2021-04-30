package Ders3;

public class InstructorManager extends UserManager{
    @Override
    public void add(User user){
        System.out.println("Yeni eğitmen: " + user.getFirstName() + user.getLastName());
    }

    public void courseAdd(User user,Course course){
        System.out.println(user.getFirstName() + user.getLastName() + " Eğitmeni yeni bir kurs ekledi: " + course.getCourseName());
    }


}
