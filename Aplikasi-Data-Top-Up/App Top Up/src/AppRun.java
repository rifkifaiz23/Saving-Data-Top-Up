import javax.swing.*;
import java.io.FileNotFoundException;

public class AppRun {
    public static void main(String[] args) throws FileNotFoundException {
        JFrame jFrame = new JFrame("PUBGM Service");
        jFrame.setContentPane(new DataPembeli().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}