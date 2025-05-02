package org.example;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Connection bd = conectar();
        consultar(bd);
        modificar(bd);
        desconectar(bd);

    }

    public static Connection conectar(){
        Connection conexion;
        String host = "jdbc:mariadb://localhost:3307/";
        String user = "root";
        String pass = "";
        String bd = "instituto";

        try {
            conexion = DriverManager.getConnection(host+bd, user, pass);
            System.out.println("Conexión realizada con éxito.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return conexion;

    }

    public static void desconectar(Connection conexion){
        try {
            conexion.close();
            System.out.println("Conexión finalizada con éxito.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void consultar(Connection conexion){

        String query = "SELECT * FROM estudiante";

        Statement stmt;
        ResultSet resultado;

        try {
            stmt = conexion.createStatement();
            resultado = stmt.executeQuery(query);

            while (resultado.next()){
                int nia = resultado.getInt("nia");
                String nombre = resultado.getString("nombre");
                LocalDate date = resultado.getDate("fecha_nacimiento").toLocalDate();

                System.out.println("Nombre - " + nombre + ", nia " + nia + ". Fecha de Nacimiento - " + date);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static void insertar(Connection conexion){

        String query = "INSERT INTO estudiante (nia, nombre, fecha_nacimiento) VALUES ('10207853', 'Roberto', '2000-10-05')";

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query);
            System.out.println("--- FILA INSERTADA ---");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public  static void modificar(Connection conexion){
        String query = "UPDATE estudiante SET nombre = 'Pocholo' WHERE nia = '10805613'";

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query);
            System.out.println("--- FILA ACTUALIZADA ---");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void borrar(Connection conexion){

        String query = "DELETE FROM estudiantes WHERE nombre = 'Roberto'";

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query);
            System.out.println("--- FILA BORRADA ---");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

}