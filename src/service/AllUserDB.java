package service;


import beans.Files;
import beans.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Goshgar
 */
public class AllUserDB {

    public static Connection connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/filemanagment";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public static List<User> getAll() {
        List<User> result = new ArrayList<>();
        try (Connection conn = connect()) {

            PreparedStatement stmt = conn.prepareStatement("select * from user");
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                Integer age = rs.getInt("age");
                String username = rs.getString("username");
                String password = rs.getString("password");
                Boolean isAdmin = rs.getBoolean("isAdmin");
                result.add(new User(id, name, surname, age, username, password, isAdmin));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

        return result;
    }

    public static List<User> getAll(String uname) {
        if (uname == null) {
            return getAll();
        }
        List<User> result = new ArrayList<>();
        try (Connection conn = connect()) {

            PreparedStatement stmt = conn.prepareStatement(
                    "select * from studs where name like ? and");
            stmt.setString(1, "%" + uname + "%");

            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                Integer age = rs.getInt("age");
                String username = rs.getString("username");
                String password = rs.getString("password");
                Boolean isAdmin = rs.getBoolean("isAdmin");
                result.add(new User(name, surname, age, username, password, isAdmin));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

        return result;
    }

    public static int add(User s) {
        try (Connection conn = connect()) {

            PreparedStatement stmt = conn.prepareStatement("insert extendeduser(name,surname,username,password,isAdmin,age) values(?,?,?,?,?,?)");
            stmt.setString(1, s.getName());
            stmt.setString(2, s.getSurname());
            stmt.setString(3, s.getUsername());
            stmt.setString(4, s.getPassword());
            stmt.setBoolean(5, s.isIsAdmin());
            stmt.setInt(6, s.getAge());
            return stmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public static int addFromExtendedUser(Integer id) {
        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO user (name, surname, age, username,password,isAdmin)"
                    + "SELECT name, surname, age, username,password,isAdmin"
                    + "  FROM `extendeduser`"
                    + " WHERE `id` = '" + id + "'");

            return stmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public static int addFile(Files f) {
        try (Connection conn = connect()) {

            PreparedStatement stmt = conn.prepareStatement("insert unreacablefolder(name) values(?)");
            stmt.setString(1, f.getName());

            return stmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }

    }

    public static List<User> getAllFromExtendedUser() {
        List<User> result = new ArrayList<>();
        try (Connection conn = connect()) {
            //chay
            PreparedStatement stmt = conn.prepareStatement("select * from extendeduser");
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                Integer age = rs.getInt("age");
                String username = rs.getString("username");
                String password = rs.getString("password");
                Boolean isAdmin = rs.getBoolean("isAdmin");
                result.add(new User(id, name, surname, age, username, password, isAdmin));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

        return result;
    }

    public static int deleteExtendedUser(int id) {
        try (Connection conn = connect()) {
            //chay
            PreparedStatement stmt = conn.prepareStatement("delete from extendeduser where id=?");//lotka
            stmt.setInt(1, id);
            return stmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    /**
     *
     * @return
     */
    public static List<Files> getAllFiles() {
        List<Files> result = new ArrayList<>();
        try (Connection conn = connect()) {

            PreparedStatement stmt = conn.prepareStatement("select * from unreacablefolder");
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                result.add(new Files(id, name));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

        return result;
    }
}
