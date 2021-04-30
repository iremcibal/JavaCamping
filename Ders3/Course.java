package Ders3;

public class Course {
    private int courseId;
    private int instructorId;
    private String courseName;
    private String detail;
    private String price;

    public Course(){
    }
    public Course(int courseId, int instructorId, String courseName, String detail, String price) {
        this.courseId = courseId;
        this.instructorId = instructorId;
        this.courseName = courseName;
        this.detail = detail;
        this.price = price;
    }
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



}
