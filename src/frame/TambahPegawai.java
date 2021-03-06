/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import db.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Pegawai;

/**
 *
 * @author USER
 */
public class TambahPegawai extends javax.swing.JFrame {
    
    int status;
    
    private final int SEDANG_TAMBAH = 101;
    private final int SEDANG_UBAH = 102;

    /**
     * Creates new form PetugasTambahFrame
     */
    
    
    
    public TambahPegawai() {
        initComponents();
        status = SEDANG_TAMBAH;
        setLocationRelativeTo(null);
        eNip.requestFocus();
    }
    
    public TambahPegawai(Pegawai pegawai) {
        initComponents();
        status = SEDANG_UBAH;
        setLocationRelativeTo(null);
        eNo.setText(String.valueOf(pegawai.getNo()));
        eNip.setText(pegawai.getNip());
        eNamaPegawai.setText(pegawai.getNamaPegawai());
        cbPangkatGolongan.setSelectedItem(pegawai.getPangkatGolongan());
        rbJenisKelaminSetSelected(pegawai.getJenisKelamin());
        eAlamat.setText(pegawai.getAlamat());
        eAgama.setText(pegawai.getAgama());
        eGaji.setText(pegawai.getGaji());
        eNip.requestFocus();
    }
    
    public void rbJenisKelaminSetSelected(String jenisKelamin){
        if(jenisKelamin.equals("Laki-laki"))
            rbLaki.setSelected(true);
        else
            rbPerempuan.setSelected(true);
    }
    
    public String rbJenisKelaminGetSelected(){
        if(rbLaki.isSelected())
            return "Laki-laki";
        else if(rbPerempuan.isSelected())
            return "Perempuan";
        else
            return "";
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eNo = new javax.swing.JTextField();
        eNip = new javax.swing.JTextField();
        eNamaPegawai = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        bBatal = new javax.swing.JButton();
        cbPangkatGolongan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        eAlamat = new javax.swing.JTextField();
        eAgama = new javax.swing.JTextField();
        eGaji = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("No");

        jLabel2.setText("NIP");

        jLabel3.setText("Nama Pegawai");

        jLabel4.setText("Pangkat Golongan");

        eNo.setEditable(false);

        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bBatal.setText("Batal");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });

        cbPangkatGolongan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Pangkat Golongan -", "Golongan 1", "Golongan 2", "Golongan 3", "Golongan 4" }));
        cbPangkatGolongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPangkatGolonganActionPerformed(evt);
            }
        });

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Alamat");

        jLabel7.setText("Agama");

        jLabel8.setText("Gaji");

        rbLaki.setText("Laki-laki");

        rbPerempuan.setText("Perempuan");

        eGaji.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("TAMBAH PEGAWAI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eNip, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(eNamaPegawai)
                            .addComponent(eAlamat)
                            .addComponent(eAgama)
                            .addComponent(eGaji)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eNo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbLaki)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbPerempuan)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbPangkatGolongan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBatal)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eNamaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbPangkatGolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbLaki)
                    .addComponent(rbPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(eAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(eGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSimpan)
                    .addComponent(bBatal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatalActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bBatalActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
        try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.getConnection();
            PreparedStatement ps;
            if(status==SEDANG_TAMBAH){
                String executeQuery = "insert into pegawai "
                        + "(nip,nama_pegawai,pangkat_golongan,jenis_kelamin,alamat,agama,gaji)"
                        + "values (?,?,?,?,?,?,?)";
                ps = con.prepareStatement(executeQuery);
                ps.setString(1, eNip.getText());
                ps.setString(2, eNamaPegawai.getText());
                ps.setString(3, (String) cbPangkatGolongan.getSelectedItem());
                ps.setString(4, rbJenisKelaminGetSelected());
                ps.setString(5, eAlamat.getText());
                ps.setString(6, eAgama.getText());
                ps.setString(7, eGaji.getText());
            }else{
                String executeQuery = "update pegawai set "+ "nip=?, nama_pegawai=?, pangkat_golongan=?, jenis_kelamin=?, alamat=?, agama=?, gaji=? where no=?";
                ps = con.prepareStatement(executeQuery);
                ps.setString(1, eNip.getText());
                ps.setString(2, eNamaPegawai.getText());
                ps.setString(3, (String) cbPangkatGolongan.getSelectedItem());
                ps.setString(4, rbJenisKelaminGetSelected());
                ps.setString(5, eAlamat.getText());
                ps.setString(6, eAgama.getText());
                ps.setString(7, eGaji.getText());
                ps.setString(8, eNo.getText());
            }
            ps.executeUpdate();
        }catch(SQLException ex){
            System.err.println(ex);
        }
        dispose();
    }//GEN-LAST:event_bSimpanActionPerformed

    private void cbPangkatGolonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPangkatGolonganActionPerformed
        // TODO add your handling code here:
        switch (cbPangkatGolongan.getSelectedIndex()){
            case 0:
                break;
            case 1:
                eGaji.setText("1.000.000");
                break;
            case 2:
                eGaji.setText("2.000.000");
                break;
            case 3:
                eGaji.setText("3.000.000");
                break;
            default:
                eGaji.setText("4.000.000");
                break;
        }
    }//GEN-LAST:event_cbPangkatGolonganActionPerformed

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
            java.util.logging.Logger.getLogger(TambahPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbPangkatGolongan;
    private javax.swing.JTextField eAgama;
    private javax.swing.JTextField eAlamat;
    private javax.swing.JTextField eGaji;
    private javax.swing.JTextField eNamaPegawai;
    private javax.swing.JTextField eNip;
    private javax.swing.JTextField eNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    // End of variables declaration//GEN-END:variables
}
