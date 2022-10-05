package ejercicios10;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Tuition {

    public static String printTuition(Student student) {
        String course = "";
        for (HashMap.Entry<Integer, Course> en : student.getCourses().entrySet()) {
            int key = en.getKey();
            Course value = en.getValue();
            course += (key + "         " + value);
        }

        return "Date Personal\n"
                + "DNI: " + student.getDni() + "\n"
                + "Names: " + student.getName() + "\n"
                + "Last-Names: " + student.getLastName() + "\n"
                + "Civil status: " + student.getCivilStatus() + "\n"
                + "Cycle: " + student.getIdCycle() + "\n"
                + "--------------------------------------------\n"
                + "IdCourse         Name Course\n"
                + "--------------------------------------------\n"
                + course + "\n"
                + "--------------------------------------------\n"
                + "total Credits: " + student.totalCredits();
    }
}
