package ejercicios10;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Student extends Person {

    private Cycle cycle;
    private float totalCredit = 0;
    HashMap<Integer,Course> courses;

    public Student(Cycle cycle, String dni, String name, String lastName, String civilStatus) {
        super(dni, name, lastName, civilStatus);
        this.cycle = cycle;
        courses = new HashMap<>();
    }

    public Student() {
        this(null, null, null, null, null);
    }

    public int numberCourses() {
        return courses.size();
    }

    public void addCourse(Course course) {
        if (!courses.containsKey(course.getIdCourse())&&totalCredit + course.getCredits() <= cycle.getCredits()) {
            totalCredit += course.getCredits();
            courses.put(course.getIdCourse(), course);
        } else if(courses.containsKey(course.getIdCourse())){
            JOptionPane.showMessageDialog(null, "El curso ya existe");
        }else if(totalCredit + course.getCredits() <= cycle.getCredits()){
            JOptionPane.showMessageDialog(null, "No se permite registrar"
                    + "\nel total de creditos permitido es"+cycle.getCredits());
        }
    }

    public void removeCourse(Course course) {
        if (totalCredit > 0) {
            totalCredit -= course.getCredits();
            courses.remove(course);
        }
    }

    public HashMap<Integer,Course> getCourses() {
        return courses;
    }

    public float totalCredits() {
        return totalCredit;
    }

    public String getIdCycle() {
        return cycle.getIdCycle();
    }

    public float creditCycle() {
        return cycle.getCredits();
    }

}
