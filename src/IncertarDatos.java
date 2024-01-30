import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncertarDatos {
    String nombre;
    String cedula;
    int calif1;
    int calif2;

    public IncertarDatos(String nombre, String cedula, int calif1, int calif2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.calif1 = calif1;
        this.calif2 = calif2;
    }

    public IncertarDatos(){}

    public void ingresoDatos(String nombre, String cedula, int calif1, int calif2){
       try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiantes", "root","root")){
           String query = "INSERT INTO calificaciones(nombre, cedula, calificacion1, calificacion2) VALUES(?,?,?,?)";
           try(PreparedStatement pst = connection.prepareStatement(query)){
               pst.setString(1,nombre);
               pst.setString(2, cedula);
               pst.setInt(3, calif1);
               pst.setInt(4,calif2);

               int filasAfectadas = pst.executeUpdate();
               if(filasAfectadas > 0){
                   System.out.println("SAludos");
               }else{
                   System.out.println("noSaludos");
               }
           }catch(SQLException e){e.printStackTrace();}

       }catch(SQLException e){
            e.printStackTrace();
       }
    }
}
