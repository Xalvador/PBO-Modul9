/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9;

/**
 *
 * @author Cordovix-ME
 */
public class form1 extends javax.swing.JFrame {

    /**
     * Creates new form form1
     */
    public form1() {
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

        jLabel1 = new javax.swing.JLabel();
        jconadokt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtnama = new javax.swing.JTextField();
        jtxtalamat = new javax.swing.JTextField();
        jtxtusia = new javax.swing.JTextField();
        jtxtjenis = new javax.swing.JTextField();
        jtxtgol = new javax.swing.JTextField();
        jtxtstatus = new javax.swing.JTextField();
        jtxtkewar = new javax.swing.JTextField();
        jtxtwaktu = new javax.swing.JTextField();
        jtxtspesial = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Pemilihan Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 110, 30);

        jconadokt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "DR. Farras Yassar", "DR. Anisa Putri ", "DR. Harun Fajar " }));
        jconadokt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadoktActionPerformed(evt);
            }
        });
        getContentPane().add(jconadokt);
        jconadokt.setBounds(160, 50, 120, 20);

        jLabel2.setText("Dokter Spesialis");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 350, 80, 30);

        jLabel3.setText("Pilih Dokter");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 40, 80, 30);

        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 120, 60, 20);

        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 150, 60, 20);

        jLabel7.setText("Usia");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 180, 50, 20);

        jLabel8.setText("Jenis Kelamin");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 210, 80, 20);

        jLabel9.setText("Golongan Darah");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 240, 90, 20);

        jLabel10.setText("Status");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 270, 50, 20);

        jLabel11.setText("Kewarganegaraan");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 300, 120, 20);

        jLabel12.setText("Waktu Praktek");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 330, 90, 20);

        jtxtnama.setEditable(false);
        getContentPane().add(jtxtnama);
        jtxtnama.setBounds(130, 120, 220, 30);

        jtxtalamat.setEditable(false);
        jtxtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtalamatActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtalamat);
        jtxtalamat.setBounds(130, 150, 220, 30);

        jtxtusia.setEditable(false);
        getContentPane().add(jtxtusia);
        jtxtusia.setBounds(130, 180, 220, 30);

        jtxtjenis.setEditable(false);
        getContentPane().add(jtxtjenis);
        jtxtjenis.setBounds(130, 210, 220, 30);

        jtxtgol.setEditable(false);
        getContentPane().add(jtxtgol);
        jtxtgol.setBounds(130, 240, 220, 30);

        jtxtstatus.setEditable(false);
        getContentPane().add(jtxtstatus);
        jtxtstatus.setBounds(130, 270, 220, 30);

        jtxtkewar.setEditable(false);
        getContentPane().add(jtxtkewar);
        jtxtkewar.setBounds(130, 300, 220, 30);

        jtxtwaktu.setEditable(false);
        getContentPane().add(jtxtwaktu);
        jtxtwaktu.setBounds(130, 330, 220, 30);

        jtxtspesial.setEditable(false);
        getContentPane().add(jtxtspesial);
        jtxtspesial.setBounds(130, 360, 220, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 90, 350, 320);

        setBounds(0, 0, 416, 467);
    }// </editor-fold>//GEN-END:initComponents

    private void jconadoktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadoktActionPerformed
        // TODO add your handling code here:
       if(jconadokt.getSelectedItem().equals("DR. Farras Yassar")){
           jtxtnama.setText("DR. Farras Yassar ");
           jtxtalamat.setText("Jl. Surabaya 16, Malang");
           jtxtusia.setText("20 Tahun");
           jtxtjenis.setText("Laki-Laki");
           jtxtgol.setText("A");
           jtxtstatus.setText("Belum Menikah ");
           jtxtkewar.setText("Indonesia");
           jtxtspesial.setText("Dokter Umum"); 
           jtxtwaktu.setText(" Pagi (07.00-15.00)"); 
       } 
       else if(jconadokt.getSelectedItem().equals("DR. Anisa Putri ")){
           jtxtnama.setText("DR. Anisa Putri");
           jtxtalamat.setText("Jl. Veteran 3, Malang");
           jtxtusia.setText("20 Tahun");
           jtxtjenis.setText("Perempuan");
           jtxtgol.setText("O");
           jtxtstatus.setText("Belum Menikah");
           jtxtkewar.setText("Indonesia");
           jtxtspesial.setText("Dokter Gigi");
           jtxtwaktu.setText(" Sore (16.00-22.00)");
       }
       else if(jconadokt.getSelectedItem().equals("DR. Harun Fajar ")){
           jtxtnama.setText("DR. Harun Fajar ");
           jtxtalamat.setText("Jl. Bandung 9, Malang");
           jtxtusia.setText("20 Tahun"); 
           jtxtjenis.setText("Laki-Laki"); 
           jtxtgol.setText("B"); 
           jtxtstatus.setText("Belum Menikah");
           jtxtkewar.setText("Indonesia");
           jtxtspesial.setText("Dokter Gizi"); 
           jtxtwaktu.setText(" Malam (22.00-06.00)");
           
           
       }
    }//GEN-LAST:event_jconadoktActionPerformed

    private void jtxtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtalamatActionPerformed

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
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jconadokt;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
