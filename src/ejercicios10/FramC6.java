package ejercicios10;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FramC6 extends javax.swing.JFrame {

    HashMap<String, Student> hashMap = new HashMap<>();
    TableColumn column;
    Object[] rowFirstStudent = {"DNI", "Name", "LastName", "Status", "Cycle", "Credits"};
    Object[] rowFirstAssign = {"Id", "Name", "Credits"};
    Student st;

    public FramC6() {
        initComponents();
        tableCourses.setModel(new CompletTable().getModelCourse());
        designTableAssign();
        designTableCourses();
        designTableStudent();
        readCycle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cboCivil = new javax.swing.JComboBox<>();
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
        btnSearchStudent1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCourses = new javax.swing.JTable();
        btnRegisterCourse = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAssign = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        lblCredits = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnAssignCourse1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

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

        txtDNI.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N

        cboCivil.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        cboCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Casado", "Soltero" }));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboCycle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        btnAssignCourse.setText("Assign course");
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

        btnSearchStudent1.setBackground(new java.awt.Color(0, 153, 255));
        btnSearchStudent1.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnSearchStudent1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchStudent1.setText("Listar");
        btnSearchStudent1.setToolTipText("Search student");
        btnSearchStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStudent1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAssignCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAssignCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchStudent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAddStudent)
                    .addComponent(btnSearchStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "List courses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        tableCourses.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        tableCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Course", "Credits"
            }
        ));
        jScrollPane2.setViewportView(tableCourses);

        btnRegisterCourse.setBackground(new java.awt.Color(0, 204, 204));
        btnRegisterCourse.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnRegisterCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterCourse.setText("+");
        btnRegisterCourse.setToolTipText("Register course");
        btnRegisterCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegisterCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(btnRegisterCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assigned courses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Credit");

        tableAssign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Name", "Credits"
            }
        ));
        jScrollPane3.setViewportView(tableAssign);

        btnAssign.setBackground(new java.awt.Color(0, 153, 204));
        btnAssign.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("+");
        btnAssign.setToolTipText("Assign course");
        btnAssign.setEnabled(false);
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblCredits.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        lblCredits.setForeground(new java.awt.Color(255, 255, 255));
        lblCredits.setText("00.00");

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("-");
        btnDelete.setToolTipText("Delete course");
        btnDelete.setEnabled(false);

        btnAssignCourse1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        btnAssignCourse1.setForeground(new java.awt.Color(51, 51, 51));
        btnAssignCourse1.setText("Register");
        btnAssignCourse1.setEnabled(false);
        btnAssignCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignCourse1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DNI");

        lblDNI.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAssignCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(lblCredits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnDelete)
                    .addComponent(btnAssignCourse1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblCredits))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Register Student", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1145, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Register Employee", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCourseActionPerformed
        new FormCourse(this, true).setVisible(true);
        tableCourses.setModel(new CompletTable().getModelCourse());
        designTableCourses();
    }//GEN-LAST:event_btnRegisterCourseActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        hashMap.put(getDNI(), new Student(new Cycle(getIdCycle(), getCredits()), getDNI(), getNameS(), getLastName(), getCivil()));
        completTableStudent();
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void cboCycleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCycleItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            txtCredits.setText(String.valueOf(((Cycle) evt.getItem()).getCredits()));
        }
    }//GEN-LAST:event_cboCycleItemStateChanged

    private void btnSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentActionPerformed
        String dni = JOptionPane.showInputDialog(this, "Enter the DNI", "Search Student", JOptionPane.INFORMATION_MESSAGE);
        if (hashMap.containsKey(dni)) {
            st = hashMap.get(dni);
            DefaultTableModel model = new DefaultTableModel(new Object[][]{}, rowFirstStudent);
            model.addRow(new Object[]{dni, st.getName(), st.getLastName(), st.getCivilStatus(), st.getIdCycle(), st.creditCycle()});
            btnAssignCourse.setEnabled(true);
            completTableAssign(st);
        } else {
            JOptionPane.showMessageDialog(null, "The student does not exist");
        }
    }//GEN-LAST:event_btnSearchStudentActionPerformed

    private void btnAssignCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignCourseActionPerformed
        btnAssign.setEnabled(true);
        btnDelete.setEnabled(true);
        btnAssignCourse1.setEnabled(true);
        lblDNI.setText(String.valueOf(st.getDni()));
        lblCredits.setText(String.valueOf(st.totalCredits()));
    }//GEN-LAST:event_btnAssignCourseActionPerformed

    private void btnAssignCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignCourse1ActionPerformed
        btnAssignCourse.setEnabled(false);
        lblDNI.setText("");
        lblCredits.setText("");
    }//GEN-LAST:event_btnAssignCourse1ActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int row = tableCourses.getSelectedRow();
        if (row > 0) {
            int id = Integer.valueOf(tableCourses.getValueAt(row, 0).toString());
            String name = tableCourses.getValueAt(row, 1).toString();
            float credits = Float.valueOf(tableCourses.getValueAt(row, 2).toString());
            st.addCourse(new Course(ERROR, name, credits));
            completTableAssign(st);
        } else {
            JOptionPane.showMessageDialog(this, "You must select row", "Student", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getToolkit().getImage("src/imagenes/advertencia.png").getScaledInstance(50, 50, Image.SCALE_SMOOTH
            )));
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnSearchStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudent1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchStudent1ActionPerformed
    private void completTableStudent() {
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, rowFirstStudent);
        tableStudent.setModel(model);
        for (Map.Entry<String, Student> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Student student = entry.getValue();
            model.addRow(new Object[]{key, student.getName(), student.getLastName(), student.getCivilStatus(), student.getIdCycle(), student.creditCycle()});
        }
    }

    public void completTableAssign(Student student) {
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, rowFirstAssign);
        tableAssign.setModel(model);
        if (student != null) {
            for (HashMap.Entry<Integer,Course> course: student.getCourses().entrySet()) {
                int id = course.getKey();
                Course c = course.getValue();
                model.addRow(new Object[]{c.getIdCourse(), c.getNameCourse(), c.getCredits()});
            }
            lblCredits.setText(String.valueOf(student.totalCredits()));
        }
    }

    private String getDNI() {
        return txtDNI.getText();
    }

    private String getNameS() {
        return txtName.getText();
    }

    private String getLastName() {
        return txtLastName.getText();
    }

    private String getIdCycle() {
        return cboCycle.getSelectedItem().toString();
    }

    private float getCredits() {
        return Float.valueOf(txtCredits.getText());
    }

    private String getCivil() {
        return cboCivil.getSelectedItem().toString();
    }

    private void designTableStudent() {
        column = tableStudent.getColumnModel().getColumn(5);
        column.setPreferredWidth(25);
        tableStudent.getTableHeader().setResizingAllowed(false);
        tableStudent.getTableHeader().setReorderingAllowed(false);
    }

    private void readCycle() {
        cboCycle.setModel(CompletTable.readInputCycle());
    }

    private void designTableCourses() {
        column = tableCourses.getColumnModel().getColumn(1);
        column.setPreferredWidth(280);
        tableCourses.getTableHeader().setReorderingAllowed(false);
        tableCourses.getTableHeader().setResizingAllowed(false);
    }

    private void designTableAssign() {
        column = tableAssign.getColumnModel().getColumn(1);
        column.setPreferredWidth(250);
        tableAssign.getTableHeader().setReorderingAllowed(false);
        tableAssign.getTableHeader().setResizingAllowed(false);

    }

    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramC6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnAssignCourse;
    private javax.swing.JButton btnAssignCourse1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegisterCourse;
    private javax.swing.JButton btnSearchStudent;
    private javax.swing.JButton btnSearchStudent1;
    private javax.swing.JComboBox<String> cboCivil;
    private javax.swing.JComboBox<String> cboCycle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JTable tableAssign;
    private javax.swing.JTable tableCourses;
    private javax.swing.JTable tableStudent;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
