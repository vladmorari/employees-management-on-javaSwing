package com.mycompany.employee;

import json.packagee.Json;
import com.employeDao.EmployeeDao;
import com.mycompany.employee.employe.Employee;
import java.util.ArrayList;

public class AppEmployee {

    String sql = "SELECT name,surename,idnp,gen FROM empdate.employee ORDER BY name ASC";
    private Json js = new Json();
    private ArrayList<Employee> emp = new ArrayList<>();
    private EmployeeDao emDao = new EmployeeDao();

    public static void main(String[] args) {
        AppEmployee app = new AppEmployee();
        app.insert();
        app.select();
        app.delete();
        app.update();
        app.writeJson();
        app.readJson();

    }

    private void insert() {
        emp.add(new Employee( "ana", "abdul", "idnp13", "MALE"));
        //Employee em = new Employee("johnese", "abdulese", "idnp12", "FEMALE");
        emDao.insert(emp.get(0)/*em*/);
    }

    public void select() {
        int i = 0;
        for (Employee p : emDao.select(sql)) {
            System.out.println("Employee nr:[" + (i++) + "]\n Idnp: " + p.getIdnp() + "\n Nume " + p.getName() + "\n Prenume " + p.getSurename() + "\n Gen " + p.getGenn() + "\n***********************");
        }
    }

    private void delete() {
        emDao.delete("idnp2");
    }

    private void update() {
        if (emDao.checkId("aszxxx") == 1) {
            emDao.update("aszxxx", "ion", "tarita");
        } else {
            System.out.print("idnp negasit");
        }
    }

    private void writeJson() {
        js.writeToJsonFile(emDao.select(sql));
    }

    private void readJson() {
        js.convertFromJson();
    }
}
