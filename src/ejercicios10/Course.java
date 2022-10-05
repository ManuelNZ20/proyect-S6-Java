package ejercicios10;

public class Course {
    
    private int idCourse;
    private String nameCourse;
    private float credits;

    public Course(int idCourse, String nameCourse, float credits) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.credits = credits;
    }

    public Course() {
        this(0, null, 0);
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }
    
    @Override
    public String toString()
    {
        return idCourse+"/"+nameCourse+"/"+credits;
    }
    
}
