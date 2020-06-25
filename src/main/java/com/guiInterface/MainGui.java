package com.guiInterface;

import com.employeDao.EmployeeDao;
import com.gui.table.model.EmployeTableModel;
//import com.mycompany.employee.AppEmployee;

public class MainGui extends javax.swing.JFrame {

    EmployeTableModel model = new EmployeTableModel();
    private EmployeeDao emDao = new EmployeeDao();

    public MainGui() {
        initComponents();
        this.employeeTable.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        butonAdd = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        buttonOrderByName = new javax.swing.JButton();
        buttonOrderById = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        employeeTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                employeeTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        butonAdd.setText("Add");
        butonAdd.setActionCommand("");
        butonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAddActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        buttonOrderByName.setText("Order by Name");
        buttonOrderByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrderByNameActionPerformed(evt);
            }
        });

        buttonOrderById.setText("Order by Idnp");
        buttonOrderById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrderByIdActionPerformed(evt);
            }
        });

        jButton1.setText("Order by last add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchField.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                searchFieldComponentAdded(evt);
            }
        });
        searchField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchFieldCaretUpdate(evt);
            }
        });
        searchField.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                searchFieldHierarchyChanged(evt);
            }
        });
        searchField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                searchFieldAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                searchFieldAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        searchField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                searchFieldInputMethodTextChanged(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                searchFieldPropertyChange(evt);
            }
        });
        searchField.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                searchFieldVetoableChange(evt);
            }
        });

        jLabel1.setText("Search by Name");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonOrderById, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonOrderByName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butonAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(searchField))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonOrderByName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonOrderById)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void butonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAddActionPerformed
        //butonul Add ce deschide dialogul de adaugare
        ADD add = new ADD(this, true);//primul parametru e Fraimul, adica fereastra curenta din care il deschidem si al decide o blocheaza pe curenta sau nu
        add.setVisible(true);//pentru a afisa fereastra... or ce fereastra
        System.out.print(add.getResult().getName());

        if (add.getResult() != null) {//verific daca obiectul care se intoarce de pe fereastra Add nu e nus, campurile sunt completate
            String sql = "SELECT name,surename,idnp,gen FROM empdate.employee ORDER BY id ASC";
            emDao.insert(add.getResult());//trimit obiectul din fereastra la baza de date
            model.addDB(sql);//incarc tot din baza de date in arrayiul local din EmployeTableModel si apoi fac refresh la tabel
        }
    }//GEN-LAST:event_butonAddActionPerformed

    private void employeeTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_employeeTableComponentShown

    }//GEN-LAST:event_employeeTableComponentShown

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //delete button
        int selectedRow = this.employeeTable.getSelectedRow();
        String selectedRow2 = this.employeeTable.getValueAt(selectedRow, 2).toString();
        System.out.println("idul : " + selectedRow2);
        emDao.delete(selectedRow2);//trimit la baza de date idnp-ul si acoolo metoda delete il va sterge din baza
        String sql = "SELECT name,surename,idnp,gen FROM empdate.employee ORDER BY id ASC";
        model.addDB(sql);//din nou incarc tot din baza in arrray si apoi fac refresh

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void buttonOrderByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrderByNameActionPerformed
        // ordonam dupa nume
        String sql = "SELECT name,surename,idnp,gen FROM empdate.employee ORDER BY name ASC";
        model.addDB(sql);
    }//GEN-LAST:event_buttonOrderByNameActionPerformed

    private void buttonOrderByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrderByIdActionPerformed
        // ordonam dupa id
        String sql = "SELECT name,surename,idnp,gen FROM empdate.employee ORDER BY idnp ASC";
        model.addDB(sql);

    }//GEN-LAST:event_buttonOrderByIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT name,surename,idnp,gen FROM empdate.employee ORDER BY id DESC";
        model.addDB(sql);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_searchFieldAncestorAdded

    }//GEN-LAST:event_searchFieldAncestorAdded

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_searchFieldComponentAdded

    }//GEN-LAST:event_searchFieldComponentAdded

    private void searchFieldAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_searchFieldAncestorMoved
  
    }//GEN-LAST:event_searchFieldAncestorMoved

    private void searchFieldVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_searchFieldVetoableChange

    }//GEN-LAST:event_searchFieldVetoableChange

    private void searchFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_searchFieldInputMethodTextChanged


    }//GEN-LAST:event_searchFieldInputMethodTextChanged

    private void searchFieldHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_searchFieldHierarchyChanged

    }//GEN-LAST:event_searchFieldHierarchyChanged

    private void searchFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_searchFieldPropertyChange

    }//GEN-LAST:event_searchFieldPropertyChange

    private void searchFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchFieldCaretUpdate
        //Face update la tabel la fiecare litera inserata in text field
                  String sql = "SELECT name,surename,idnp,gen FROM empdate.employee WHERE name LIKE'"+this.searchField.getText()+"%'";
        model.addDB(sql);

    }//GEN-LAST:event_searchFieldCaretUpdate

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonAdd;
    private javax.swing.JButton buttonOrderById;
    private javax.swing.JButton buttonOrderByName;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
