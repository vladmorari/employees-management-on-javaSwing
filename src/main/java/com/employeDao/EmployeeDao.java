package com.employeDao;

import com.mycompany.employee.employe.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {

    Connection initConnection() {
        String url = "jdbc:postgresql://127.0.0.1:5432/employee2";
        String user = "postgres";
        String password = "vlad";
        try {
            System.out.println("\nConnecting...");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("ERROR! Can't connect to db. " + ex.getMessage());
            return null;
        }

    }

    public int checkId(String idnp) {
        int count = 0;
        String sql = "SELECT COUNT (idnp) as numar FROM empdate.employee where idnp='" + idnp + "'";
        Connection conn = initConnection();
        Statement st = null;
        try {
            if (conn != null) {
                st = conn.createStatement();
                ResultSet resultSet = st.executeQuery(sql);
                while (resultSet.next()) {
                    count = resultSet.getInt("numar");
                    System.out.print("sunt :  ");
                    System.out.print(count);
                }
            } else {
                System.out.println("Select failed");
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        } finally {
            try {
                conn.close();
                st.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return count;
    }

    public void insert(Employee emp) {
        int checkIdnp = checkId(emp.getIdnp());

        if (checkIdnp == 0) {

            String sql = "INSERT INTO empdate.employee(name,surename,gen,idnp) VALUES('" + emp.getName() + "','" + emp.getSurename() + "','"
                    + emp.getGenn() + "','" + emp.getIdnp() + "')";
            Connection conn = initConnection();
            Statement st = null;
            try {
                if (conn != null) {
                    st = conn.createStatement();
                    int rows = st.executeUpdate(sql);
                    System.out.print("inserat in baza"); //////rows intoarce nr de rinduri inserate
                } else {
                    System.out.println("Insert failed");
                }
            } catch (SQLException ex) {
                System.out.println("ERROR! Insert failed. " + ex.getMessage());
            } finally {
                try {
                    conn.close();
                    st.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } else {
            System.out.println("asa idnp este deja");
        }
    }

    public ArrayList<Employee> select(String sql) {
        ArrayList<Employee> emp = new ArrayList<>();
        // sql = "SELECT name,surename,idnp,gen FROM empdate.employee ORDER BY id DESC";///select sortat dupa nume
        //SELECT column1, column2, ...FROM table_name ORDER BY column1, column2, ... ASC
        Connection conn = initConnection();
        Statement st = null;
        try {
            if (conn != null) {
                st = conn.createStatement();
                ResultSet resultSet = st.executeQuery(sql);

                while (resultSet.next()) {
                    Employee selectEmp = new Employee(resultSet.getString("name"), resultSet.getString("surename"), resultSet.getString("idnp"), resultSet.getString("gen"));
                    emp.add(selectEmp);
                }
            } else {
                System.out.println("Select failed");
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        } finally {
            try {
                conn.close();
                st.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return emp;
    }////selectul , intoarce un array

    public void delete(String idnp) {
        String sql = "DELETE FROM empdate.employee WHERE idnp='" + idnp + "'";
        Connection conn = initConnection();
        Statement st = null;
        try {
            if (conn != null) {
                st = conn.createStatement();
                int rows = st.executeUpdate(sql);
                System.out.print("sterse din baza " + rows);
            } else {
                System.out.println("Insert failed");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR! Insert failed. " + ex.getMessage());
        } finally {
            try {
                conn.close();
                st.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void update(String idnp, String nume, String prenume) {

        String sql = "   UPDATE empdate.employee  SET name ='" + nume + "',surename = '" + prenume + "' WHERE idnp='" + idnp + "'";
        Connection conn = initConnection();
        Statement st = null;
        if (conn != null) {
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
                System.out.println("Record updated successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    conn.close();
                    st.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
