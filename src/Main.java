import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ingreso de calificaciones");
        frame.setContentPane(new MenuInsercion().menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420,300);
        frame.setLocationRelativeTo(null);

    }
}