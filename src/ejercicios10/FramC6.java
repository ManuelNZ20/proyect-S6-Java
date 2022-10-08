package ejercicios10;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FramC6 extends javax.swing.JFrame {

    HashMap<String, Student> hashMapStudent = new HashMap<>();
    HashMap<String, Teacher> hashMapTeacher = new HashMap<>();
    HashMap<String, ServiceStaff> hashMapService = new HashMap<>();
    TableColumn column;
    Object[] rowFirstStudent = {"DNI", "Name", "LastName", "Status", "Cycle", "Credits"};
    Object[] rowFirstTeacher = {"DNI", "Name", "LastName", "Status", "Departament", "A. Title", "Specialty", "Y. Incorporation", "Office"};
    Object[] rowFirstService = {"DNI", "Name", "LastName", "Status", "Section", "Y. Incorporation", "Office"};
    Student st;
    Teacher tc;
    ServiceStaff sff;

    public FramC6() {
        initComponents();
        designTableStudent();
        readCycle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlStudent = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDNIStudent = new javax.swing.JTextField();
        txtLastNameStudent = new javax.swing.JTextField();
        txtNameStudent = new javax.swing.JTextField();
        cboCivilStudent = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboCycle = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCredits = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudent = new javax.swing.JTable();
        btnAddStudent = new javax.swing.JButton();
        btnAssignCourse = new javax.swing.JButton();
        btnSearchStudent = new javax.swing.JButton();
        btnListStudent = new javax.swing.JButton();
        pnlTeacher = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDNITeacher = new javax.swing.JTextField();
        txtLastNameTeacher = new javax.swing.JTextField();
        txtNameTeacher = new javax.swing.JTextField();
        cboCivilTeacher = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtAcademic = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSpecialty = new javax.swing.JTextField();
        txtYearITeacher = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNOfficeTeacher = new javax.swing.JTextField();
        cboDepartament = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableTeacher = new javax.swing.JTable();
        btnAddTeacher = new javax.swing.JButton();
        btnAssignCourseTeacher = new javax.swing.JButton();
        btnSearchTeacher = new javax.swing.JButton();
        btnListTeacher = new javax.swing.JButton();
        btnUpdateTeacher = new javax.swing.JButton();
        pnlServiceStaff = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDNIService = new javax.swing.JTextField();
        txtLastNameService = new javax.swing.JTextField();
        txtNameService = new javax.swing.JTextField();
        cboCivilService = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtSection = new javax.swing.JTextField();
        txtYearIService = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtNOfficeService = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableService = new javax.swing.JTable();
        btnAddServiceStaff = new javax.swing.JButton();
        btnSearchService = new javax.swing.JButton();
        btnListService = new javax.swing.JButton();
        btnUpdateRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C6");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel1.setText("DNI");

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel3.setText("LastName");

        jLabel4.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel4.setText("CivilStatus");

        txtDNIStudent.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtDNIStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIStudentKeyTyped(evt);
            }
        });

        txtLastNameStudent.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        txtNameStudent.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        cboCivilStudent.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        cboCivilStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Casado", "Soltero" }));

        jLabel5.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel5.setText("Cycle");

        cboCycle.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        cboCycle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCycleItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel6.setText("Credits");

        txtCredits.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtCredits.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboCivilStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDNIStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboCycle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDNIStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboCycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboCivilStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Table Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        tableStudent.setFont(new java.awt.Font("Source Code Pro", 0, 10)); // NOI18N
        tableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Name", "Lastname", "C.Status", "Cycle", "Credits"
            }
        ));
        jScrollPane1.setViewportView(tableStudent);

        btnAddStudent.setBackground(new java.awt.Color(0, 204, 204));
        btnAddStudent.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudent.setText("+");
        btnAddStudent.setToolTipText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnAssignCourse.setBackground(new java.awt.Color(51, 51, 51));
        btnAssignCourse.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnAssignCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignCourse.setText("Assign/View course");
        btnAssignCourse.setEnabled(false);
        btnAssignCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignCourseActionPerformed(evt);
            }
        });

        btnSearchStudent.setBackground(new java.awt.Color(0, 153, 255));
        btnSearchStudent.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnSearchStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnSearchStudent.setToolTipText("Search student");
        btnSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStudentActionPerformed(evt);
            }
        });

        btnListStudent.setBackground(new java.awt.Color(0, 153, 255));
        btnListStudent.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnListStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnListStudent.setText("List");
        btnListStudent.setToolTipText("Search student");
        btnListStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                        .addComponent(btnAssignCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAssignCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAddStudent)
                    .addComponent(btnSearchStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlStudentLayout = new javax.swing.GroupLayout(pnlStudent);
        pnlStudent.setLayout(pnlStudentLayout);
        pnlStudentLayout.setHorizontalGroup(
            pnlStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentLayout.createSequentialGroup()
                .addGroup(pnlStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStudentLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStudentLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        pnlStudentLayout.setVerticalGroup(
            pnlStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStudentLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Register Student", pnlStudent);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel8.setText("DNI");

        jLabel10.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel10.setText("Name");

        jLabel11.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel11.setText("LastName");

        jLabel12.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel12.setText("CivilStatus");

        txtDNITeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtDNITeacher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNITeacherKeyTyped(evt);
            }
        });

        txtLastNameTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        txtNameTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        cboCivilTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        cboCivilTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Casado", "Soltero" }));

        jLabel13.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel13.setText("Departament");

        jLabel14.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel14.setText("Academic Title");

        txtAcademic.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel15.setText("Specialty");

        txtSpecialty.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        txtYearITeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel16.setText("Year Incorporation");

        jLabel17.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel17.setText("Office number");

        txtNOfficeTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        cboDepartament.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        cboDepartament.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Facultad de Ingeniería y Arquitectura", "Facultad de ciencias de las Salud", "Facultad de ciencias empresariales", "Facultad de derecho y humanidades" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDNITeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboCivilTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSpecialty, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addComponent(txtAcademic))
                            .addComponent(txtYearITeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(cboDepartament, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNOfficeTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtDNITeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNOfficeTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(cboDepartament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(txtAcademic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtLastNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(txtSpecialty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cboCivilTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtYearITeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Table Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        tableTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 10)); // NOI18N
        tableTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Name", "Lastname", "C.Status", "Departament", "A. Title", "Specialty", "Year incorporation", "Office number"
            }
        ));
        jScrollPane4.setViewportView(tableTeacher);

        btnAddTeacher.setBackground(new java.awt.Color(0, 204, 204));
        btnAddTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnAddTeacher.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTeacher.setText("+");
        btnAddTeacher.setToolTipText("Add Student");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        btnAssignCourseTeacher.setBackground(new java.awt.Color(51, 51, 51));
        btnAssignCourseTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnAssignCourseTeacher.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignCourseTeacher.setText("Assign/View course");
        btnAssignCourseTeacher.setEnabled(false);
        btnAssignCourseTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignCourseTeacherActionPerformed(evt);
            }
        });

        btnSearchTeacher.setBackground(new java.awt.Color(0, 153, 255));
        btnSearchTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnSearchTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnSearchTeacher.setToolTipText("Search student");
        btnSearchTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTeacherActionPerformed(evt);
            }
        });

        btnListTeacher.setBackground(new java.awt.Color(0, 153, 255));
        btnListTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnListTeacher.setForeground(new java.awt.Color(255, 255, 255));
        btnListTeacher.setText("List");
        btnListTeacher.setToolTipText("Search student");
        btnListTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListTeacherActionPerformed(evt);
            }
        });

        btnUpdateTeacher.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdateTeacher.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnUpdateTeacher.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateTeacher.setText("Update");
        btnUpdateTeacher.setToolTipText("Search student");
        btnUpdateTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTeacherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAssignCourseTeacher)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAssignCourseTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddTeacher)
                            .addComponent(btnSearchTeacher))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlTeacherLayout = new javax.swing.GroupLayout(pnlTeacher);
        pnlTeacher.setLayout(pnlTeacherLayout);
        pnlTeacherLayout.setHorizontalGroup(
            pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTeacherLayout.setVerticalGroup(
            pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeacherLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Register Teacher", pnlTeacher);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel9.setText("DNI");

        jLabel18.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel18.setText("Name");

        jLabel19.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel19.setText("LastName");

        jLabel20.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel20.setText("CivilStatus");

        txtDNIService.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtDNIService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIServiceKeyTyped(evt);
            }
        });

        txtLastNameService.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        txtNameService.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        cboCivilService.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        cboCivilService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Casado", "Soltero" }));

        jLabel21.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel21.setText("Section");

        txtSection.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        txtYearIService.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel24.setText("Year Incorporation");

        jLabel25.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel25.setText("Office number");

        txtNOfficeService.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jLabel24))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNameService, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLastNameService, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDNIService, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboCivilService, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel21))))
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtNOfficeService, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYearIService, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtDNIService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(txtNameService, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtYearIService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtLastNameService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cboCivilService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtNOfficeService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Table Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        tableService.setFont(new java.awt.Font("Source Code Pro", 0, 10)); // NOI18N
        tableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Name", "Lastname", "C.Status", "Section", "Year incorporation", "Office number"
            }
        ));
        jScrollPane5.setViewportView(tableService);

        btnAddServiceStaff.setBackground(new java.awt.Color(0, 204, 204));
        btnAddServiceStaff.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnAddServiceStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnAddServiceStaff.setText("+");
        btnAddServiceStaff.setToolTipText("Add Student");
        btnAddServiceStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceStaffActionPerformed(evt);
            }
        });

        btnSearchService.setBackground(new java.awt.Color(0, 153, 255));
        btnSearchService.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnSearchService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnSearchService.setToolTipText("Search student");
        btnSearchService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchServiceActionPerformed(evt);
            }
        });

        btnListService.setBackground(new java.awt.Color(0, 153, 255));
        btnListService.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnListService.setForeground(new java.awt.Color(255, 255, 255));
        btnListService.setText("List");
        btnListService.setToolTipText("Search student");
        btnListService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListServiceActionPerformed(evt);
            }
        });

        btnUpdateRegister.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdateRegister.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnUpdateRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateRegister.setText("Update");
        btnUpdateRegister.setToolTipText("Search student");
        btnUpdateRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnAddServiceStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchService, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListService, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnListService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddServiceStaff)
                            .addComponent(btnSearchService))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlServiceStaffLayout = new javax.swing.GroupLayout(pnlServiceStaff);
        pnlServiceStaff.setLayout(pnlServiceStaffLayout);
        pnlServiceStaffLayout.setHorizontalGroup(
            pnlServiceStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlServiceStaffLayout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(pnlServiceStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(160, 160, 160))
        );
        pnlServiceStaffLayout.setVerticalGroup(
            pnlServiceStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlServiceStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Service Staff", pnlServiceStaff);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        hashMapStudent.put(getDNIStudent(), new Student(new Cycle(getIdCycle(), getCredits()), getDNIStudent(), getNameStudent(), getLastNameStudent(),
                getCivilStudent()));
        completTableStudent();
        clearBoxes(new JTextField[]{
            txtDNIStudent,
            txtNameStudent,
            txtLastNameStudent,
            txtCredits
        },
                new JComboBox[]{
                    cboCivilStudent,
                    cboCycle});
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void cboCycleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCycleItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            txtCredits.setText(String.valueOf(((Cycle) evt.getItem()).getCredits()));
        }
    }//GEN-LAST:event_cboCycleItemStateChanged

    private void btnSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentActionPerformed
        String dni = JOptionPane.showInputDialog(this, "Enter the DNI", "Search Student", JOptionPane.INFORMATION_MESSAGE);
        if (hashMapStudent.containsKey(dni)) {
            st = hashMapStudent.get(dni);
            DefaultTableModel modelStudent = new DefaultTableModel(new Object[][]{}, rowFirstStudent);
            tableStudent.setModel(modelStudent);
            addRowStudent(modelStudent, st);
            btnAssignCourse.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "The student does not exist");
        }
    }//GEN-LAST:event_btnSearchStudentActionPerformed

    private void btnAssignCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignCourseActionPerformed
        FormTableCourse course = new FormTableCourse(st, null);
        course.setVisible(true);
        btnAssignCourse.setEnabled(false);
    }//GEN-LAST:event_btnAssignCourseActionPerformed

    private void btnListStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListStudentActionPerformed
        completTableStudent();
        clearBoxes(new JTextField[]{
            txtDNIStudent,
            txtNameStudent,
            txtLastNameStudent,
            txtCredits
        },
                new JComboBox[]{
                    cboCivilStudent,
                    cboCycle});
    }//GEN-LAST:event_btnListStudentActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        hashMapTeacher.put(getDniTeacher(),
                new Teacher(getDepartament(),
                        getAcademic(),
                        getSpecialty(),
                        getYearTeacher(),
                        getOfficeTeacher(),
                        getDniTeacher(),
                        getNameTeacher(),
                        getLastNameTeacher(),
                        getCivilStatusTeacher()));
        completTableTeacher();
        clearBoxes(new JTextField[]{
            txtDNITeacher,
            txtNameTeacher,
            txtLastNameTeacher,
            txtAcademic,
            txtSpecialty,
            txtYearITeacher,
            txtNOfficeTeacher
        },
                new JComboBox[]{
                    cboCivilTeacher,
                    cboDepartament
                });
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnAssignCourseTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignCourseTeacherActionPerformed
        FormTableCourse tableCourse = new FormTableCourse(null, tc);
        tableCourse.setVisible(true);
        btnAssignCourseTeacher.setEnabled(false);
    }//GEN-LAST:event_btnAssignCourseTeacherActionPerformed

    private void btnSearchTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTeacherActionPerformed
        String dni = JOptionPane.showInputDialog("Digite un número de DNI");
        if (hashMapTeacher.containsKey(dni)) {
            tc = hashMapTeacher.get(dni);
            DefaultTableModel modelTeacher = new DefaultTableModel(new Object[][]{}, rowFirstTeacher);
            tableTeacher.setModel(modelTeacher);
            addRowModelTeacher(modelTeacher, tc);
            btnAssignCourseTeacher.setEnabled(true);
            addBoxesTeacher(tc);
        } else {
            JOptionPane.showMessageDialog(null, "El usuario con dni: " + dni + " no esta registrado");
        }
    }//GEN-LAST:event_btnSearchTeacherActionPerformed

    private void btnListTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListTeacherActionPerformed
        completTableTeacher();
        clearBoxes(new JTextField[]{
            txtDNITeacher,
            txtNameTeacher,
            txtLastNameTeacher,
            txtAcademic,
            txtSpecialty,
            txtYearITeacher,
            txtNOfficeTeacher
        },
                new JComboBox[]{
                    cboCivilTeacher,
                    cboDepartament
                });
    }//GEN-LAST:event_btnListTeacherActionPerformed

    private void btnUpdateTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTeacherActionPerformed
        tc.setName(getNameTeacher());
        tc.setLastName(getLastNameTeacher());
        tc.setCivilStatus(getCivilStatusTeacher());
        tc.setDepartament(getDepartament());
        tc.setAcademicTitle(getAcademic());
        tc.setSpecialty(getSpecialty());
        tc.setOfficeNumber(getOfficeTeacher());
        completTableTeacher();
        clearBoxes(new JTextField[]{
            txtDNITeacher,
            txtNameTeacher,
            txtLastNameTeacher,
            txtAcademic,
            txtSpecialty,
            txtYearITeacher,
            txtNOfficeTeacher
        },
                new JComboBox[]{
                    cboCivilTeacher,
                    cboDepartament
                });
    }//GEN-LAST:event_btnUpdateTeacherActionPerformed

    private void btnAddServiceStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServiceStaffActionPerformed
        hashMapService.put(getDniService(),
                new ServiceStaff(getSection(), getYearService(), getOfficeService(), getDniService(),
                        getNameService(), getLastNameService(), getCivilStatusService()));
        completTableService();
        clearBoxes(new JTextField[]{
            txtDNIService,
            txtNameService,
            txtLastNameService,
            txtSection,
            txtYearIService,
            txtNOfficeService
        },
                new JComboBox[]{
                    cboCivilService
                });
    }//GEN-LAST:event_btnAddServiceStaffActionPerformed

    private void btnSearchServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchServiceActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese su DNI");
        if (hashMapService.containsKey(dni)) {
            sff = hashMapService.get(dni);
            DefaultTableModel modelService = new DefaultTableModel(new Object[][]{}, rowFirstService);
            tableService.setModel(modelService);
            addRowServiceStaff(modelService, sff);
            addBoxesServiceStaff(sff);
        } else {
            JOptionPane.showMessageDialog(null, "El usuario de DNI: " + dni + " no ha sido registrado");
        }
    }//GEN-LAST:event_btnSearchServiceActionPerformed

    private void btnListServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListServiceActionPerformed
        completTableService();
        clearBoxes(new JTextField[]{
            txtDNIService,
            txtNameService,
            txtLastNameService,
            txtSection,
            txtYearIService,
            txtNOfficeService
        },
                new JComboBox[]{
                    cboCivilService
                });
    }//GEN-LAST:event_btnListServiceActionPerformed

    private void btnUpdateRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRegisterActionPerformed
        sff.setName(getNameService());
        sff.setLastName(getLastNameService());
        sff.setCivilStatus(getCivilStatusService());
        sff.setSection(getSection());
        sff.setOfficeNumber(getOfficeService());
        completTableService();
        clearBoxes(new JTextField[]{
            txtDNIService,
            txtNameService,
            txtLastNameService,
            txtSection,
            txtYearIService,
            txtNOfficeService
        },
                new JComboBox[]{
                    cboCivilService
                });
    }//GEN-LAST:event_btnUpdateRegisterActionPerformed

    private void txtDNIStudentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIStudentKeyTyped
        permissionDni(evt, txtDNIStudent);
    }//GEN-LAST:event_txtDNIStudentKeyTyped

    private void txtDNITeacherKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNITeacherKeyTyped
        permissionDni(evt, txtDNITeacher);
    }//GEN-LAST:event_txtDNITeacherKeyTyped

    private void txtDNIServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIServiceKeyTyped
        permissionDni(evt, txtDNIService);
    }//GEN-LAST:event_txtDNIServiceKeyTyped

    //<editor-fold desc="complet text fields">
    private void addBoxesTeacher(Teacher tc) {
        this.txtDNITeacher.setText(tc.getDni());
        this.txtNameTeacher.setText(tc.getName());
        this.txtLastNameTeacher.setText(tc.getLastName());
        this.cboCivilTeacher.setSelectedItem(tc.getCivilStatus());
        this.cboDepartament.setSelectedItem(tc.getDepartament());
        this.txtAcademic.setText(tc.getAcademicTitle());
        this.txtNOfficeTeacher.setText(String.valueOf(tc.getOfficeNumber()));
        this.txtSpecialty.setText(tc.getSpecialty());
        this.txtYearITeacher.setText(Employee.formatt.format(tc.getYearIncorporation()));
    }

    private void addBoxesServiceStaff(ServiceStaff sff) {
        this.txtDNIService.setText(sff.getDni());
        this.txtNameService.setText(sff.getName());
        this.txtLastNameService.setText(sff.getLastName());
        this.cboCivilService.setSelectedItem(sff.getCivilStatus());
        this.txtSection.setText(sff.getSection());
        this.txtNOfficeService.setText(String.valueOf(sff.getOfficeNumber()));
        this.txtYearIService.setText(Employee.formatt.format(sff.getYearIncorporation()));
    }

    //</editor-fold>
    //<editor-fold desc="total - table">
    private void completTableStudent() {
        DefaultTableModel modelStudent = new DefaultTableModel(new Object[][]{}, rowFirstStudent);
        tableStudent.setModel(modelStudent);
        for (Map.Entry<String, Student> entry : hashMapStudent.entrySet()) {
            Student student = entry.getValue();
            addRowStudent(modelStudent, student);
        }
    }

    private void completTableTeacher() {
        DefaultTableModel modelTeacher = new DefaultTableModel(new Object[][]{}, rowFirstTeacher);
        tableTeacher.setModel(modelTeacher);
        for (Map.Entry<String, Teacher> entry : hashMapTeacher.entrySet()) {
            Teacher t = entry.getValue();
            addRowModelTeacher(modelTeacher, t);
        }
    }

    private void completTableService() {
        DefaultTableModel modelService = new DefaultTableModel(new Object[][]{}, rowFirstService);
        tableService.setModel(modelService);
        for (HashMap.Entry<String, ServiceStaff> entry : hashMapService.entrySet()) {
            ServiceStaff s = entry.getValue();
            addRowServiceStaff(modelService, s);
        }
    }

    //metodos de modelo
    //modelo Teacher
    private void addRowModelTeacher(DefaultTableModel modelTeacher, Teacher t) {
        modelTeacher.addRow(new Object[]{
            t.getDni(), t.getName(), t.getLastName(), t.getCivilStatus(),
            t.getDepartament(), t.getAcademicTitle(), t.getSpecialty(),
            t.getYearIncorporation(), t.getOfficeNumber()});
    }

    //model Student
    private void addRowStudent(DefaultTableModel modelStudent, Student s) {
        modelStudent.addRow(new Object[]{s.getDni(), s.getName(), s.getLastName(),
            s.getCivilStatus(), s.getIdCycle(), s.creditCycle()});
    }

    //model service staff
    private void addRowServiceStaff(DefaultTableModel modelService, ServiceStaff s) {
        modelService.addRow(new Object[]{s.getDni(), s.getName(), s.getLastName(),
            s.getCivilStatus(), s.getSection(), s.yearIncorporation(),
            s.getOfficeNumber()});
    }

    //</editor-fold>
    //<editor-fold desc="Date Student">
    private String getDNIStudent() {
        return txtDNIStudent.getText();
    }

    private String getNameStudent() {
        return txtNameStudent.getText();
    }

    private String getLastNameStudent() {
        return txtLastNameStudent.getText();
    }

    private String getIdCycle() {
        return cboCycle.getSelectedItem().toString();
    }

    private float getCredits() {
        return Float.valueOf(txtCredits.getText());
    }

    private String getCivilStudent() {
        return cboCivilStudent.getSelectedItem().toString();
    }

    private void readCycle() {
        cboCycle.setModel(CompletTable.readInputCycle());
    }

    //</editor-fold>
    //<editor-fold desc="Date Teacher">
    public String getDniTeacher() {
        return txtDNITeacher.getText();
    }

    public String getNameTeacher() {
        return txtNameTeacher.getText();
    }

    public String getLastNameTeacher() {
        return txtLastNameTeacher.getText();
    }

    public String getCivilStatusTeacher() {
        return cboCivilTeacher.getSelectedItem().toString();
    }

    public String getDepartament() {
        return cboDepartament.getSelectedItem().toString();
    }

    public String getAcademic() {
        return txtAcademic.getText();
    }

    public String getSpecialty() {
        return txtSpecialty.getText();
    }

    public String getYearTeacher() {
        return txtYearITeacher.getText();
    }

    public short getOfficeTeacher() {
        return Short.valueOf(txtNOfficeTeacher.getText());
    }

    //</editor-fold>
    //<editor-fold desc="Date Service Staff">
    public String getDniService() {
        return txtDNIService.getText();
    }

    public String getNameService() {
        return txtNameService.getText();
    }

    public String getLastNameService() {
        return txtLastNameService.getText();
    }

    public String getCivilStatusService() {
        return cboCivilService.getSelectedItem().toString();
    }

    public String getSection() {
        return txtSection.getText();
    }

    public String getYearService() {
        return txtYearIService.getText();
    }

    public short getOfficeService() {
        return Short.valueOf(txtNOfficeService.getText());
    }
    //</editor-fold>

    private void permissionDni(java.awt.event.KeyEvent evt, javax.swing.JTextField txt) {
        if (txt.getText().length() > 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    private void clearBoxes(javax.swing.JTextField text[], javax.swing.JComboBox comb[]) {
        for (JTextField text1 : text) {
            text1.setText("");
        }
        text[0].requestFocus();
        for (JComboBox comboBox : comb) {
            comboBox.setSelectedIndex(0);
        }

    }

    private void designTableStudent() {
        column = tableStudent.getColumnModel().getColumn(5);
        column.setPreferredWidth(25);
        tableStudent.getTableHeader().setResizingAllowed(false);
        tableStudent.getTableHeader().setReorderingAllowed(false);
    }

    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new FramC6().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddServiceStaff;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnAssignCourse;
    private javax.swing.JButton btnAssignCourseTeacher;
    private javax.swing.JButton btnListService;
    private javax.swing.JButton btnListStudent;
    private javax.swing.JButton btnListTeacher;
    private javax.swing.JButton btnSearchService;
    private javax.swing.JButton btnSearchStudent;
    private javax.swing.JButton btnSearchTeacher;
    private javax.swing.JButton btnUpdateRegister;
    private javax.swing.JButton btnUpdateTeacher;
    private javax.swing.JComboBox<String> cboCivilService;
    private javax.swing.JComboBox<String> cboCivilStudent;
    private javax.swing.JComboBox<String> cboCivilTeacher;
    private javax.swing.JComboBox<String> cboCycle;
    private javax.swing.JComboBox<String> cboDepartament;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlServiceStaff;
    private javax.swing.JPanel pnlStudent;
    private javax.swing.JPanel pnlTeacher;
    private javax.swing.JTable tableService;
    private javax.swing.JTable tableStudent;
    private javax.swing.JTable tableTeacher;
    private javax.swing.JTextField txtAcademic;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDNIService;
    private javax.swing.JTextField txtDNIStudent;
    private javax.swing.JTextField txtDNITeacher;
    private javax.swing.JTextField txtLastNameService;
    private javax.swing.JTextField txtLastNameStudent;
    private javax.swing.JTextField txtLastNameTeacher;
    private javax.swing.JTextField txtNOfficeService;
    private javax.swing.JTextField txtNOfficeTeacher;
    private javax.swing.JTextField txtNameService;
    private javax.swing.JTextField txtNameStudent;
    private javax.swing.JTextField txtNameTeacher;
    private javax.swing.JTextField txtSection;
    private javax.swing.JTextField txtSpecialty;
    private javax.swing.JTextField txtYearIService;
    private javax.swing.JTextField txtYearITeacher;
    // End of variables declaration//GEN-END:variables
}
