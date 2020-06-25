package com.gui.table.model;

import com.employeDao.EmployeeDao;
//import com.mycompany.employee.AppEmployee;
import com.mycompany.employee.employe.Employee;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EmployeTableModel extends AbstractTableModel {

    //AppEmployee app = new AppEmployee();
    String[] colums = new String[]{"name", "surename", "idnp", "gender"};//def coloanele
    List<Employee> emps = new ArrayList<>();
    private EmployeeDao emDao = new EmployeeDao();

    /* public void add(Employee emp) {
        this.emps.add(emp);//adaug obiectul primit la arraylistul meu
        emDao.insert(emp);
        this.fireTableDataChanged();//fac refresh la tabela
    }*/

 /* public void delete(Employee emp) {
       // this.emps.remove(emp);//adaug obiectul primit la arraylistul meu
        emDao.insert(emp);
        this.fireTableDataChanged();//fac refresh la tabela
    }*/
    public void addDB(String sql) {///butonul care face refresh la imformatie cu cea din db
        this.emps = (emDao.select(sql));
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return this.emps.size();
    }

    @Override
    public int getColumnCount() {
        return this.colums.length;
    }

    @Override
    public String getColumnName(int columnIndex) { //metoda care ne specifica numele coloanelor in tabelul grafic
       //
        String sql = "SELECT name,surename,idnp,gen FROM empdate.employee ORDER BY id ASC";
        this.emps = (emDao.select(sql)); //  fac ca tabelul sa se actualizeze imediat cum se incarca aplicatia
        this.fireTableDataChanged();
   ///
        return this.colums[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee emp = this.emps.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return emp.getName();
            case 1:
                return emp.getSurename();
            case 2:
                return emp.getIdnp();
            case 3:
                return emp.getGenn();
            default:
                throw new IllegalArgumentException("config gresita");
        }
    }

}
