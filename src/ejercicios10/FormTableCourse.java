package ejercicios10;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Image;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public final class FormTableCourse extends javax.swing.JFrame {

    TableColumn column;
    Student st;
    Teacher tc;
    Object[] rowFirstAssign = {"Id", "Name", "Credits"};

    public FormTableCourse(Student st, Teacher tc) {
        initComponents();
        this.st = st;
        this.tc = tc;
        tableCourses.setModel(new CompletTable().getModelCourse());
        completTableAssign();
        designTableAssign();
        designTableCourses();
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

    public void completTableAssign() {
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, rowFirstAssign);
        tableAssign.setModel(model);
        HashMap<Integer, Course> courses;
        courses = (st != null) ? st.getCourses() : tc.getCourse();
        for (HashMap.Entry<Integer, Course> entry : courses.entrySet()) {
            Course c = entry.getValue();
            model.addRow(new Object[]{c.getIdCourse(), c.getNameCourse(), c.getCredits()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
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

        btnAssignCourse1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        btnAssignCourse1.setForeground(new java.awt.Color(51, 51, 51));
        btnAssignCourse1.setText("Register");
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAssign)
                        .addComponent(btnDelete)
                        .addComponent(btnAssignCourse1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblCredits))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCourseActionPerformed
        new FormCourse(this, true).setVisible(true);
        tableCourses.setModel(new CompletTable().getModelCourse());
        designTableCourses();
    }//GEN-LAST:event_btnRegisterCourseActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int row = tableCourses.getSelectedRow();
        if (row > 0) {
            int id = Integer.valueOf(tableCourses.getValueAt(row, 0).toString());
            String name = tableCourses.getValueAt(row, 1).toString();
            float credits = Float.valueOf(tableCourses.getValueAt(row, 2).toString());
            if (st != null) {
                st.addCourse(new Course(id, name, credits));
            } else {
                tc.addCourse(new Course(id, name, credits));
            }
            completTableAssign();
        } else {
            JOptionPane.showMessageDialog(this, "You must select row", "Student", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getToolkit().getImage("src/imagenes/advertencia.png").getScaledInstance(50, 50, Image.SCALE_SMOOTH
            )));
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnAssignCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignCourse1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnAssignCourse1ActionPerformed

    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new FormTableCourse(null, null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnAssignCourse1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegisterCourse;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JTable tableAssign;
    private javax.swing.JTable tableCourses;
    // End of variables declaration//GEN-END:variables
}
