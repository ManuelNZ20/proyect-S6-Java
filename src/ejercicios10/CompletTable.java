package ejercicios10;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CompletTable {

    PrintStream print;
    InputStream fileIn;
    List<Course> courses = new LinkedList<>();
    private static final String routeCourse = "src/archivos/courses.txt";
    private static final String routeCycle = "src/archivos/cycle.txt";
    Object[] rowFirstCourse = {"Id","Name", "Credits"};

    public CompletTable() {
        try {
            File file = new File(routeCourse);
            if (file.exists()) {
                print = new PrintStream(new FileOutputStream(file, true));
            } else {
                JOptionPane.showMessageDialog(null, "El archivo no existe");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error de carga: " + e);
        }
    }
//            InputStream inFile = new FileInputStream("courses.txt");

    public void addCourses(Course course) {
        print.print(course.toString());
        print.write(13);
        JOptionPane.showMessageDialog(null, "Curso guardado con existo", "Assign Course",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon(new JFrame().getToolkit().getImage("src/imagenes/aprende.png").getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
    }

    public DefaultTableModel getModelCourse() {
        cargar();
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, rowFirstCourse);
        for (Iterator<Course> iterator = courses.iterator(); iterator.hasNext();) {
            Course c = iterator.next();
            model.addRow(new Object[]{c.getIdCourse(),c.getNameCourse(), c.getCredits()});
        }
        return model;
    }

    public void cargar() {
        try {
            try ( BufferedReader br = new BufferedReader(new FileReader(routeCourse))) {
                String r;
                while ((r = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(r, "/");
                    int id = Integer.valueOf(st.nextToken().trim());
                    String name = st.nextToken().trim();
                    float credit = Float.valueOf(st.nextToken().trim());
                    courses.add(new Course(id, name, credit));
                    System.out.println("a");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static DefaultComboBoxModel readInputCycle() {
        Vector<Cycle> vCycle = new Vector<>();
        try {
            vCycle.add(new Cycle("Seleccionar", 0));
            try ( BufferedReader br = new BufferedReader(new FileReader(routeCycle))) {
                String r;
                while ((r = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(r, "/");
                    String id = st.nextToken().trim();
                    float totalCredit = Float.valueOf(st.nextToken().trim());
                    vCycle.add(new Cycle(id, totalCredit));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        DefaultComboBoxModel<Cycle> cycle = new DefaultComboBoxModel<>(vCycle);
        return cycle;
    }
    /*
     try {
            byte[] datos = fileIn.readAllBytes();
            fileOut.write(datos);
            fileOut.write(13);
        }catch (IOException e) {
            throw new RuntimeException("Error de lectura: "+e.getMessage());
        }
     */
}
