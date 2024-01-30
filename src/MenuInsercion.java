import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInsercion {
    private JButton button1;
    protected JPanel menu;
    private JLabel mensajetxt;
    private JButton buttonInsertar;
    private JTextField textNombre;
    private JTextField textCedula;
    private JTextField textCal1;
    private JTextField textCal2;
    private JLabel labelNombre;
    private JLabel labelCedula;
    private JLabel labelCal1;
    private JLabel labelCal2;
    private JButton ButtonBorrar;

    public MenuInsercion() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConexionBDD miConexion = new ConexionBDD();
                miConexion.conexionLocal("jdbc:mysql://localhost:3306/estudiantes","root", "root");

                mensajetxt.setText(miConexion.getMensaje());
            }
        });
        ButtonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textCal1.setText("");
                textCedula.setText("");
                textNombre.setText("");
                textCal2.setText("");
            }
        });
        buttonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IncertarDatos insertarDatos = new IncertarDatos();
                //insertarDatos.ingresoDatos("Juan CArlos Vivero","1755929666", 10, 8);
                insertarDatos.ingresoDatos(textNombre.getText(), textCedula.getText(), Integer.parseInt(textCal1.getText()), Integer.parseInt(textCal2.getText()));
            }
        });
    }
}
