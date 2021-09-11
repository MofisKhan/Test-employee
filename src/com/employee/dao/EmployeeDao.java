package com.employee.dao;
import java.sql.*;
import com.employee.pojo.*;
import com.employee.util.*;
public class EmployeeDao {

	public void registerEmployee(Employee emp) throws Exception {
       // String INSERT_USERS_SQL = "INSERT INTO employee" +
       //    "  (id, first_name, last_name, username, password, address, contact) VALUES " +
       //     " (?, ?, ?, ?, ?,?,?);";

      

        Connection con = null;

        try {
        	con = MySQLUtility.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement ps = con.prepareStatement("INSERT INTO employee (first_name, last_name, username, password, address, contact) values ( ?, ?, ?, ?,?,?)"); 
            ps.setString(1, emp.getFirstName());
            ps.setString(2, emp.getLastName());
            ps.setString(3, emp.getUsername());
            ps.setString(4, emp.getPassword());
            ps.setString(5, emp.getAddress());
            ps.setString(6, emp.getContact());

            System.out.println(ps);
            // Step 3: Execute the query or update query
            ps.execute();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
