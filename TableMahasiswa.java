/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.JOptionPane;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Excited
 */
public class TableMahasiswa extends javax.swing.JFrame {

   private DefaultTableModel mod;
    Object[] dataMhs  = new Object[4];
    private int selectedRowIndex = -1;
    
    public TableMahasiswa() {
        initComponents();
        loadTable();
    }

    /**
     *BIMA ALAN BUANA SAPUTRA
     * 211011400042
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        textNim = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        textKelas = new javax.swing.JTextField();
        textProdi = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bima Alan Buana Saputra - FORM MAHASISWA");

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "KELAS", "PRODI"
            }
        ));
        tableMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMahasiswa);

        textProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdiActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel1.setText("NIM");

        jLabel2.setText("NAMA");

        jLabel3.setText("KELAS");

        jLabel4.setText("PRODI");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEdit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textNim)
                            .addComponent(textNama)
                            .addComponent(textKelas)
                            .addComponent(textProdi, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCari)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCari)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMahasiswaMouseClicked
        selectedRowIndex = tableMahasiswa.getSelectedRow();
        if (selectedRowIndex != -1) {
            textNim.setText(mod.getValueAt(selectedRowIndex, 0).toString());
            textNama.setText(mod.getValueAt(selectedRowIndex, 1).toString());
            textKelas.setText(mod.getValueAt(selectedRowIndex, 2).toString());
            textProdi.setText(mod.getValueAt(selectedRowIndex, 3).toString());
        }
    }//GEN-LAST:event_tableMahasiswaMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String nim = textNim.getText();
        String nama = textNama.getText();
        String kelas = textKelas.getText();
        String prodi= textProdi.getText();
        String sql;
        sql = "INSERT INTO dataMhs VALUES ('"+nim+"', '"+nama+"', '"+kelas+"', '"+prodi+"')";
        runSQL(sql);
        loadTable();
        kosong();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
   int konf = JOptionPane.showConfirmDialog(this, "Yakin mau dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if (selectedRowIndex != -1) {
            String nim = mod.getValueAt(selectedRowIndex, 0).toString();
            String sql = "DELETE FROM dataMhs WHERE nim='" + nim + "'";
            runSQL(sql);
            loadTable();
            kosong();
            selectedRowIndex = -1; 
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       if (selectedRowIndex != -1) {
            String nim = textNim.getText();
            String nama = textNama.getText();
            String kelas = textKelas.getText();
            String prodi = textProdi.getText();
            String sql = "UPDATE dataMhs SET nim='" + nim + "', nama='" + nama + "', kelas='" + kelas + "', prodi='" + prodi + "' WHERE nim='" + nim + "'";
            runSQL(sql);
            loadTable();
            kosong();
            selectedRowIndex = -1; 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
     String nim = textNim.getText();
          String nama = textNama.getText();
          String kelas = textKelas.getText();
          String prodi = textProdi.getText();
          
          String sql="";
          if(!nim.isEmpty())
              sql = "SELECT * FROM dataMhs where nim='"+nim+"' ";
          else if(!nama.isEmpty())
            //mencari sebagian gak perlu ngetik full    
               sql = "SELECT * FROM dataMhs where nama like '%"+nama+"%' ";
          else if(!kelas.isEmpty())
              sql = "SELECT * FROM dataMhs where kelas='"+kelas+"' ";
          else if(!prodi.isEmpty())
              sql = "SELECT * FROM dataMhs where prodi='"+prodi+"' ";
          
          mod = (DefaultTableModel) tableMahasiswa.getModel();
          mod.setRowCount(0);
         try {
            //String sql = "SELECT * FROM mhs where nim='"+nim+"', OR nama='"+nama+"' OR kelas='"+kelas+"' OR prodi='"+prodi+"'";
            java.sql.Connection conn = (Connection) configDB.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()) {
            mod.addRow(new Object[]{
                res.getString(1), res.getString(2), 
                res.getString(3), res.getString(4)
            });
        } 
            tableMahasiswa.setModel(mod);
        } catch (Exception e) {
            System.err.print("Gagal load sql!"+e.toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void textProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdiActionPerformed
private void loadTable(){
        mod = (DefaultTableModel) tableMahasiswa.getModel();
        mod.setRowCount(0);
         try {
            String sql = "SELECT * FROM dataMhs";
            java.sql.Connection conn = (Connection) configDB.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()) {
            mod.addRow(new Object[]{
                res.getString(1), res.getString(2), 
                res.getString(3), res.getString(4)
            });
        } 
            tableMahasiswa.setModel(mod);
        } catch (Exception e) {
            System.err.print("Gagal load sql!"+e.toString());
        }
    }
    private void kosong(){
        textNim.setText("");
        textNama.setText("");
        textKelas.setText("");
        textProdi.setText("");
    }

private void runSQL(String sql){
        try {
             java.sql.Connection conn = (Connection) configDB.koneksi();
             java.sql.PreparedStatement pst = conn.prepareStatement(sql);
             pst.execute();
        } catch (Exception e) {
        }
    }   

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JTextField textKelas;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNim;
    private javax.swing.JTextField textProdi;
    // End of variables declaration//GEN-END:variables


    
}
