import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class DataPembeli {
    private JTextField textID;
    private JTextField textNo;
    private JComboBox comboJumlah;
    private JTextField textEmail;
    private JTable tabelOutput;
    private JPanel rootPanel;
    private JComboBox comboPembayaran;
    private JButton submitButton;
    private JTextField textHarga;
    private AppSystem appSystem;
    private DefaultTableModel tableModel;

    public DataPembeli() {

        this.appSystem = new AppSystem();
        this.initComponents();

            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String id = textID.getText();
                    String no = textNo.getText();
                    String jumlah = (String) comboJumlah.getSelectedItem();
                    String harga = textHarga.getText();
                    String pembayaran = (String) comboPembayaran.getSelectedItem();
                    String email = textEmail.getText();

                    appSystem.setID(id);
                    appSystem.setNo(no);
                    appSystem.setJumlah(jumlah);
                    appSystem.setHarga(harga);
                    appSystem.setPembayaran(pembayaran);
                    appSystem.setEmail(email);

                    tableModel.addRow(new Object[]{id, no, jumlah, pembayaran, email});

                    String dataList = "\nID = " + id + "\nNo.Hp = " + no + "\nJumlah = " + jumlah + "\nHarga = " + harga +"\nPembayaran = " + pembayaran
                            + "\nEmail = " + email + "\n\n";

                    FileWriter fileWriter = null;

                    try{
                        fileWriter = new FileWriter("Data.txt", true);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    try {
                        fileWriter.write(dataList);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    try {
                        fileWriter.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }

        public void initComponents(){
            Object[] tableColumn = {"ID",
            "No Hp",
            "Jumlah",
            "Pembayaran",
            "Email"};

            Object[][] row = {};

            tableModel = new DefaultTableModel(row, tableColumn);
            tabelOutput.setModel(tableModel);
            tabelOutput.setAutoCreateRowSorter(true);
        }
    public JPanel getRootPanel () {
        return rootPanel;
    }
}
