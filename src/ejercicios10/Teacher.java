package ejercicios10;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Teacher extends Employee {

    private String departament;
    private String academicTitle;
    private String specialty;
    private HashMap<Integer, Course> courses;

    public Teacher(String departament, String academicTitle, String specialty, String yearIncorporation, short officeNumber, String dni, String name, String lastName, String civilStatus) {
        super(yearIncorporation, officeNumber, dni, name, lastName, civilStatus);
        this.departament = departament;
        this.academicTitle = academicTitle;
        this.specialty = specialty;
        courses = new HashMap<>();
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void addCourse(Course course) {
        if (!courses.containsKey(course.getIdCourse())) {
            courses.put(course.getIdCourse(), course);
        } else if (courses.containsKey(course.getIdCourse())) {
            JOptionPane.showMessageDialog(null, "El curso ya existe");
        }
    }

    public void removeCourse(Course course) {
        courses.remove(course.getIdCourse());
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }

    public HashMap<Integer, Course> getCourse() {
        return courses;
    }
}
