
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.Button;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class databasemahasiswa extends javax.swing.JFrame {

    public databasemahasiswa() {
        initComponents();
        tabel();
        koneksimysql koneksi = new koneksimysql();
        this.statuskoneksi.setText(koneksi.koneksimysql2());;
        this.setLocationRelativeTo(this);
        ButtonGroup bg = new ButtonGroup();
        bg.add(lakilaki);
        bg.add(perempuan);

    }

    void reset() {
        nim.setText("");
        nama.setText("");
        alamat.setText("");
        buttonGroup1.clearSelection();
        
        ;
    }

    void cari() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No.");
        tbl.addColumn("NIM");
        tbl.addColumn("NAMA");
        tbl.addColumn("GENDER");
        tbl.addColumn("ALAMAT");

        try {
            int no = 1;
            String data = "SELECT * FROM identitas WHERE nim like '%" + nim.getText() + "%'";

            Connection con = (Connection) koneksii.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(data);

            while (rs.next()) {
                tbl.addRow(new Object[]{
                    no++,
                    rs.getString("NIM"),
                    rs.getString("NAMA"),
                    rs.getString("GENDER"),
                    rs.getString("ALAMAT")
                });
                tabel.setModel(tbl);
            }

        } catch (Exception e) {
        }
    }

    public void tabel() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No.");
        tbl.addColumn("NIM");
        tbl.addColumn("NAMA");
        tbl.addColumn("GENDER");
        tbl.addColumn("ALAMAT");

        try {
            int no = 1;
            Statement st = (Statement) koneksii.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM datamahasiswa");

            while (rs.next()) {
                tbl.addRow(new Object[]{
                    no++,
                    rs.getString("NIM"),
                    rs.getString("NAMA"),
                    rs.getString("GENDER"),
                    rs.getString("ALAMAT")
                });
                tabel.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pilih = new javax.swing.JComboBox<>();
        statuskoneksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        lakilaki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        alamat = new javax.swing.JTextField();
        EXIT = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        KIRIM = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA MAHASISWA ILMU KOMPUTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 50, 275, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Prodi S1 Ilmu Komputer");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 73, 265, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Universitas Nahdlatul Ulama Blitar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 96, 265, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\kecil_removw-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 16, 109, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cari"));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pilih.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIM" }));
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });

        statuskoneksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statuskoneksiActionPerformed(evt);
            }
        });

        jLabel3.setText("Status");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pilih, 0, 158, Short.MAX_VALUE)
                    .addComponent(statuskoneksi))
                .addGap(115, 115, 115))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statuskoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 352, 390, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        tabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM ", "NAMA", "ALAMAT", "GENDER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 500, 300));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Data Mahasiswa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("NIM");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("NAMA");

        gender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        gender.setText("GENDER");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("ALAMAT");

        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        buttonGroup1.add(lakilaki);
        lakilaki.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lakilaki.setText("LAKI - LAKI ");
        lakilaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakilakiActionPerformed(evt);
            }
        });

        buttonGroup1.add(perempuan);
        perempuan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        perempuan.setText("PEREMPUAN");
        perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanActionPerformed(evt);
            }
        });

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lakilaki)
                        .addGap(18, 18, 18)
                        .addComponent(perempuan))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(lakilaki)
                    .addComponent(perempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 177, -1, 170));

        EXIT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 100, 33));

        delete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, 33));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 83, 33));

        KIRIM.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        KIRIM.setText("INSERT");
        KIRIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KIRIMActionPerformed(evt);
            }
        });
        getContentPane().add(KIRIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 100, 32));

        RESET.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        RESET.setText("RESET ");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        getContentPane().add(RESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 85, 33));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void lakilakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakilakiActionPerformed

    }//GEN-LAST:event_lakilakiActionPerformed

    private void perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int row = tabel.rowAtPoint(evt.getPoint());
        String nim1 = tabel.getValueAt(row, 1).toString();
        nim.setText(nim1);
        String nama1 = tabel.getValueAt(row, 2).toString();
        nama.setText(nama1);
        String gender = tabel.getValueAt(row, 3).toString();
        if (gender.equals("Laki-laki")) {
            lakilaki.setSelected(true);
        } else {
            perempuan.setSelected(true);
        }
        String alamat1 = tabel.getValueAt(row, 4).toString();
        alamat.setText(alamat1);

    }//GEN-LAST:event_tabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nim.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, " nim belum diisi");
        } else {
            cari();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed

    }//GEN-LAST:event_pilihActionPerformed

    private void statuskoneksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statuskoneksiActionPerformed

    }//GEN-LAST:event_statuskoneksiActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            String data = "DELETE FROM datamahasiswa WHERE nim ='" + nim.getText() + "'";
            Connection con = (Connection) koneksii.getConnection();
            PreparedStatement pst = con.prepareStatement(data);
            pst.execute();

            DefaultTableModel tblModel = (DefaultTableModel) tabel.getModel();

            if (tabel.getSelectedRowCount() == 1) {
                tblModel.removeRow(tabel.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            } else {
                if (tabel.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "Tabel kosong!!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Harap pilih satu data!!!");
                }
            }

            reset();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String gender = "";

        if (lakilaki.isSelected()) {
            gender = "L";
        } else if (perempuan.isSelected()) {
            gender = "P";
        }

        if (nama.getText().equals("") || nim.getText().equals("") || gender.equals("") || alamat.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Data tidak lengkap!!!");

        } else {

            try {
                String data = "UPDATE datamahasiswa SET nim ='" + nim.getText()
                + "',nama ='" + nama.getText()
                + "',gender ='" + gender
                + "',alamat ='" + alamat.getText()
                + "'WHERE nim ='" + nim.getText() + "'";
                Connection con = (Connection) koneksii.getConnection();
                PreparedStatement pst = con.prepareStatement(data);
                pst.execute();

                DefaultTableModel tblModel = (DefaultTableModel) tabel.getModel();
                if (tabel.getSelectedRowCount() == 1) {

                    tblModel.setValueAt(nim.getText(), tabel.getSelectedRow(), 1);
                    tblModel.setValueAt(nama.getText(), tabel.getSelectedRow(), 2);
                    tblModel.setValueAt(gender, tabel.getSelectedRow(), 3);
                    tblModel.setValueAt(alamat.getText(), tabel.getSelectedRow(), 4);

                    JOptionPane.showMessageDialog(this, "Data berhasil diubah!!!");
                } else {
                    if (tabel.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(this, "Tabel kosong!!!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Harap pilih satu data!!!");
                    }
                }

                reset();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        if (nim.getText().isEmpty()
            || nama.getText().isEmpty()
            || (lakilaki.isSelected() && perempuan.isSelected())
            || alamat.getText().isEmpty()) {

            // Tampilkan pesan peringatan jika input belum lengkap
            JOptionPane.showMessageDialog(this, "Harap lengkapi semua input sebelum mereset!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            // Panggil metode reset jika input sudah terisi
            reset();
        }
        
    }//GEN-LAST:event_RESETActionPerformed

    private void KIRIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KIRIMActionPerformed
        String gender = "";

        if (lakilaki.isSelected()) {
            gender = "L";
        } else if (perempuan.isSelected()) {
            gender = "P";
        }

        if (nama.getText().equals("") || nim.getText().equals("") || gender.equals("") || alamat.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Data tidak lengkap!!!");

        } else {
            try {
                String data = "INSERT INTO datamahasiswa VALUES ('" + nim.getText() + "','"
                + nama.getText() + "','"
                + gender + "','"
                + alamat.getText()
                + "')";
                Connection con = (Connection) koneksii.getConnection();
                PreparedStatement pst = con.prepareStatement(data);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Berhasil disimpan");

                reset();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal disimpan " + e.getMessage());
            }
        }
        tabel();
    }//GEN-LAST:event_KIRIMActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimActionPerformed

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
            java.util.logging.Logger.getLogger(databasemahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(databasemahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(databasemahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(databasemahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new databasemahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JButton KIRIM;
    private javax.swing.JButton RESET;
    private javax.swing.JTextField alamat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton lakilaki;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JComboBox<String> pilih;
    private javax.swing.JTextField statuskoneksi;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
