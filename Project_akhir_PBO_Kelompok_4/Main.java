package Kalkulator;

/**
 *
 * @author AKBAR
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Main extends JFrame {
    // Bidang input
    private JTextField[] bidangIP;
    private JTextField bidangPrefix;
    private JTextField bidangSubnetMask;
    private JTextField bidangAlamatJaringan;
    private JTextField bidangAlamatBroadcast;
    private JTextField bidangJumlahSubnet;
    private JTextField bidangHostPerSubnet;
    private JTextField bidangKelasIP;
    private JButton tombolHitung;
    private JButton tombolReset;

    public Main() {
        setTitle("Kalkulator Subnet");
        tempat();
        susunTataLetak();
        tambahkanPendengarEvent();
        akhiriFrame();
    }

    private void tempat() {
        // Inisialisasi bidang alamat IP
        bidangIP = new JTextField[4];
        for (int i = 0; i < 4; i++) {
            bidangIP[i] = new JTextField(3);
        }

        bidangPrefix = new JTextField(3);
        bidangKelasIP = new JTextField(3);
        bidangSubnetMask = new JTextField(20);
        bidangAlamatJaringan = new JTextField(20);
        bidangAlamatBroadcast = new JTextField(20);
        bidangJumlahSubnet = new JTextField(20);
        bidangHostPerSubnet = new JTextField(20);

        // Atur bidang hasil hanya baca
        bidangSubnetMask.setEditable(false);
        bidangAlamatJaringan.setEditable(false);
        bidangAlamatBroadcast.setEditable(false);
        bidangJumlahSubnet.setEditable(false);
        bidangHostPerSubnet.setEditable(false);
        bidangKelasIP.setEditable(false);

        // Inisialisasi tombol
        tombolHitung = new JButton("Hitung");
        tombolReset = new JButton("Reset");
    }

    private void susunTataLetak() {
        JPanel panelUtama = new JPanel(new GridBagLayout());
        panelUtama.setBorder(new EmptyBorder(30, 30, 30, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Baris Alamat IP
        gbc.gridx = 0; gbc.gridy = 0;
        panelUtama.add(buatLabelTerformat("Alamat IP"), gbc);

        JPanel panelIP = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 0));
        for (int i = 0; i < 4; i++) {
            panelIP.add(bidangIP[i]);
            if (i < 3) panelIP.add(new JLabel("."));
        }
        gbc.gridx = 1;
        panelUtama.add(panelIP, gbc);

        // Prefix
        gbc.gridx = 2;
        panelUtama.add(buatLabelTerformat("Prefix  /"), gbc);
        gbc.gridx = 3;
        panelUtama.add(bidangPrefix, gbc);

        // Subnet Mask
        gbc.gridx = 0; gbc.gridy = 1;
        panelUtama.add(buatLabelTerformat("Subnet Mask"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelUtama.add(bidangSubnetMask, gbc);

        // Kelas IP
        gbc.gridx = 2; gbc.gridwidth = 1;
        panelUtama.add(buatLabelTerformat("Kelas IP"), gbc);
        gbc.gridx = 3;
        panelUtama.add(bidangKelasIP, gbc);

        // Alamat Jaringan
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 1;
        panelUtama.add(buatLabelTerformat("ID Jaringan"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelUtama.add(bidangAlamatJaringan, gbc);

        // Alamat Broadcast
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 1;
        panelUtama.add(buatLabelTerformat("IP Broadcast"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelUtama.add(bidangAlamatBroadcast, gbc);

        // Jumlah Subnet
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 1;
        panelUtama.add(buatLabelTerformat("Jumlah Subnet"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelUtama.add(bidangJumlahSubnet, gbc);

        // Host Per Subnet
        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 1;
        panelUtama.add(buatLabelTerformat("Jumlah Host Per Subnet"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelUtama.add(bidangHostPerSubnet, gbc);

        // Tombol
        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        panelTombol.add(tombolHitung);
        panelTombol.add(tombolReset);
        gbc.gridx = 1; gbc.gridy = 6; gbc.gridwidth = 2;
        panelUtama.add(panelTombol, gbc);

        add(panelUtama);
    }

    private JLabel buatLabelTerformat(String teks) {
        JLabel label = new JLabel(teks);
        label.setForeground(new Color(0, 0, 139)); // Warna biru tua
        return label;
    }

    private void tambahkanPendengarEvent() {
        tombolHitung.addActionListener(e -> hitungSubnet());
        tombolReset.addActionListener(e -> resetBidang());
    }

    private void hitungSubnet() {
    try {
        // Validasi Prefix
        String prefixInput = bidangPrefix.getText().trim();
        if (!prefixInput.matches("\\d+")) {
            throw new NumberFormatException("Prefix harus berupa angka.");
        }

        int prefix = Integer.parseInt(prefixInput);
        if (prefix < 0 || prefix > 32) {
            throw new NumberFormatException("Prefix harus antara 0 dan 32.");
        }

        // Lakukan penghitungan subnet menggunakan kelas eksternal
        StringBuilder ip = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            ip.append(bidangIP[i].getText());
            if (i < 3) ip.append(".");
        }
        IPAddress ipAddress = new IPAddress(ip.toString());
        SubnetMask mask = new SubnetMask(prefix);
        Penghitungan kalkulator = new Penghitungan(ipAddress, mask);

        // Perbarui bidang hasil
        bidangSubnetMask.setText(mask.toString());
        bidangAlamatJaringan.setText(kalkulator.getNetworkAddress());
        bidangAlamatBroadcast.setText(kalkulator.getBroadcastAddress());
        bidangJumlahSubnet.setText(String.valueOf(kalkulator.getNumberOfSubnets()));
        bidangHostPerSubnet.setText(String.valueOf(kalkulator.getNumberOfHosts()));
        bidangKelasIP.setText(tentukanKelasIP(ipAddress));

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private String tentukanKelasIP(IPAddress ip) {
        int firstOctet = ip.getOctets()[0];
        if (firstOctet <= 127) return "A";
        if (firstOctet <= 191) return "B";
        if (firstOctet <= 223) return "C";
        if (firstOctet <= 239) return "D";
        return "E";
    }

    private void resetBidang() {
        for (JTextField field : bidangIP) {
            field.setText("");
        }
        bidangPrefix.setText("");
        bidangSubnetMask.setText("");
        bidangAlamatJaringan.setText("");
        bidangAlamatBroadcast.setText("");
        bidangJumlahSubnet.setText("");
        bidangHostPerSubnet.setText("");
        bidangKelasIP.setText("");
    }

    private void akhiriFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new Main().setVisible(true);
        });
    }
}
