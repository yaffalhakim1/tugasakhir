/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekpajak;

/**
 *
 * @author yafit
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();
        combokendaraan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        kotakharga = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jumlahkendaraan = new javax.swing.JComboBox<>();
        hasil = new javax.swing.JLabel();
        tempathasil = new javax.swing.JTextField();
        btncek = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informasi = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jColorChooser1.setBackground(new java.awt.Color(255, 255, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CEK PAJAK KENDARAAN");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 16));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 405, 36));

        jenis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jenis.setForeground(new java.awt.Color(255, 255, 255));
        jenis.setText("Kendaraan");
        getContentPane().add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 141, -1, -1));

        combokendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motor", "Mobil" }));
        combokendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combokendaraanActionPerformed(evt);
            }
        });
        getContentPane().add(combokendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 175, 145, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Harga Kendaraan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 211, -1, -1));
        getContentPane().add(kotakharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 251, 145, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kendaraan ke-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 293, 130, -1));

        jumlahkendaraan.setForeground(new java.awt.Color(51, 51, 51));
        jumlahkendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        getContentPane().add(jumlahkendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 328, 145, -1));

        hasil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hasil.setForeground(new java.awt.Color(255, 255, 255));
        hasil.setText("Pajak Anda");
        getContentPane().add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        tempathasil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tempathasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempathasilActionPerformed(evt);
            }
        });
        getContentPane().add(tempathasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 221, -1));

        btncek.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btncek.setText("cek");
        btncek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncekActionPerformed(evt);
            }
        });
        getContentPane().add(btncek, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("informasi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        informasi.setColumns(20);
        informasi.setRows(5);
        jScrollPane1.setViewportView(informasi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 488, 200));

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 471, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 368, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tanggal" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 397, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bulan" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 397, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tahun" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 397, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cekpajak/09c02cf90d47f15c74cc4c0ba5ec7db3.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncekActionPerformed
        int kendaraan = combokendaraan.getSelectedIndex();
        int jumlah = jumlahkendaraan.getSelectedIndex();
        Integer harga = Integer.parseInt(kotakharga.getText());
        double pajak = 0;
        double hasil;
        int swdkllj = 0;
        int administrasi = 0;
        int bbnkb = 0;
       
        switch(kendaraan)
        {
            
            //Sumbangan wajib dana kecelakaan lalu lintas jalan
            //Biaya Administrasi Tanda Nomor Kendaraan & Bea Balik Nama Kendaraan bermotor
            case 1 :
                swdkllj = 80000;
                bbnkb = harga * 10 / 100;
                administrasi = 50000;
                break;
            case 2 :
                swdkllj = 160000;
                bbnkb = harga * 10 / 100;
                administrasi = 150000;
                break;
        }
        //pajak progresif
        switch(jumlah)
        {
            case 0 :
                pajak = 1.5/100;
                break;
            case 1 :
                pajak = 2.0/100;
                break;
            case 2 :
                pajak = 2.5/100;
                break;
            case 3 :
                pajak = 4.0/100;
                break;
        }
        
        hasil = harga * pajak + swdkllj + administrasi + bbnkb;
        tempathasil.setText("Rp. "+hasil);
        
        //class
        informasipajak keterangan = new informasipajak();
        keterangan.setKeterangan("Halo, ini adalah program cek pajak kendaraan anda"
                + "\nPajak Anda Sebesar Rp. "+hasil);
        informasi.setText(""+keterangan.getKeterangan());
        
    }//GEN-LAST:event_btncekActionPerformed

    private void combokendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combokendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combokendaraanActionPerformed

    private void tempathasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempathasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempathasilActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        combokendaraan.setSelectedIndex(0);
        jumlahkendaraan.setSelectedIndex(0);
        kotakharga.setText("");
        tempathasil.setText("");
        informasi.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
            int m=1, y=1980, d=1;
            do
            {
                jComboBox1.addItem(String.valueOf(d));
                d++;
            } while(d<=31);
            do
            {
                jComboBox2.addItem(String.valueOf(m));
                m++;
            }while(m<=12);
            do
            {
                jComboBox3.addItem(String.valueOf(y));
                y++;
            }while(y<=2030);
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncek;
    private javax.swing.JComboBox<String> combokendaraan;
    private javax.swing.JLabel hasil;
    private javax.swing.JTextArea informasi;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenis;
    private javax.swing.JComboBox<String> jumlahkendaraan;
    private java.awt.TextField kotakharga;
    private javax.swing.JTextField tempathasil;
    // End of variables declaration//GEN-END:variables
}
