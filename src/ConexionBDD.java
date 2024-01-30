import java.sql.*;


public class ConexionBDD {
    String servidor;
    String usuario;
    String password;
    String mensaje;

    public ConexionBDD(String servidor, String usuario, String password) {
        this.servidor = servidor;
        this.usuario = usuario;
        this.password = password;
    }

    public ConexionBDD(){
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void conexionLocal(String servidor, String usuario, String password){
        try(Connection connection = DriverManager.getConnection(servidor, usuario, password)){
            if(connection!= null){
                mensaje = "conexion correcta";
                System.out.println(mensaje);
            }

        }catch(SQLException e){
            //mensaje = "conexion fallida";
            //System.out.println(mensaje);
            e.printStackTrace();

        }
    }
}
