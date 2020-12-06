
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class admEmployees extends javax.swing.JFrame {
    
    String empId;
    String empName;
    String empEmail;
    String empPhone;
    String empAddress;
    String empPassword;
 
    public admEmployees() {
        initComponents();
        fetchDataFromDb();
    }
    
    public void fetchDataFromDb()
    {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databasename=courier;integratedSecurity=true";
        try (Connection con = DriverManager.getConnection(connectionUrl); ) 
        {               
            PreparedStatement pst=con.prepareStatement("Select * from emp_tbl"); 
            ResultSet rs = pst.executeQuery();           
            while(rs.next())
            {
              empId=String.valueOf(rs.getInt("empId"));
              empName=rs.getString("empName");
              empEmail=rs.getString("empEmail");
              empPhone=rs.getString("empPhone");
              empAddress=rs.getString("empAddress");
              empPassword=rs.getString("empPassword");
              String tbData[]={empId,empName,empEmail,empPhone,empAddress,empPassword};
              DefaultTableModel tblModel=(DefaultTableModel)adm_Employee_Table.getModel();   
              tblModel.addRow(tbData);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        adm_Employee_Table = new javax.swing.JTable();
        adm_emp_Id = new javax.swing.JTextField();
        adm_emp_Name = new javax.swing.JTextField();
        adm_emp_Email = new javax.swing.JTextField();
        adm_emp_Phone = new javax.swing.JTextField();
        adm_emp_Address = new javax.swing.JTextField();
        adm_emp_Password = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adm_emp_New = new javax.swing.JButton();
        adm_emp_Update = new javax.swing.JButton();
        adm_emp_Remove = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adm_Employee_Table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adm_Employee_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "empId", "empName", "empEmail", "empPhone", "empAddress", "empPassword"
            }
        ));
        adm_Employee_Table.setPreferredSize(new java.awt.Dimension(1000, 655));
        adm_Employee_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adm_Employee_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adm_Employee_Table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Password");

        adm_emp_New.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adm_emp_New.setText("New");
        adm_emp_New.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adm_emp_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_emp_NewActionPerformed(evt);
            }
        });

        adm_emp_Update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adm_emp_Update.setText("Update");
        adm_emp_Update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adm_emp_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_emp_UpdateActionPerformed(evt);
            }
        });

        adm_emp_Remove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adm_emp_Remove.setText("Remove");
        adm_emp_Remove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adm_emp_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_emp_RemoveActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Employee Details");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backbtn.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adm_emp_Email)
                            .addComponent(adm_emp_Name)
                            .addComponent(adm_emp_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adm_emp_New, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(adm_emp_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(adm_emp_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adm_emp_Phone)
                                    .addComponent(adm_emp_Address)
                                    .addComponent(adm_emp_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adm_emp_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adm_emp_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adm_emp_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adm_emp_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adm_emp_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adm_emp_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adm_emp_New, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adm_emp_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adm_emp_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adm_Employee_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adm_Employee_TableMouseClicked
        int i=adm_Employee_Table.getSelectedRow();
        TableModel model=adm_Employee_Table.getModel();
        adm_emp_Id.setText(model.getValueAt(i, 0).toString());
        adm_emp_Name.setText(model.getValueAt(i, 1).toString());

        adm_emp_Email.setText(model.getValueAt(i, 2).toString());
        adm_emp_Phone.setText(model.getValueAt(i, 3).toString());
        adm_emp_Address.setText(model.getValueAt(i, 4).toString());
        adm_emp_Password.setText(model.getValueAt(i, 5).toString());

        //--------Assigning values to class Variables so that it can be used by any methods--------//
        empId=model.getValueAt(i, 0).toString();
        empName=model.getValueAt(i, 1).toString();
        empEmail=model.getValueAt(i, 2).toString();
        empPhone=model.getValueAt(i, 3).toString();
        empAddress=model.getValueAt(i, 4).toString();
        empPassword=model.getValueAt(i, 5).toString();
        
    }//GEN-LAST:event_adm_Employee_TableMouseClicked

    private void adm_emp_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_emp_NewActionPerformed
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databasename=courier;integratedSecurity=true";
        try(Connection con = DriverManager.getConnection(connectionUrl);)
        {
            if(!(adm_emp_Id.getText().equals("") ||adm_emp_Name.getText().equals("") ||adm_emp_Email.getText().equals("") ||adm_emp_Phone.getText().equals("") || adm_emp_Address.getText().equals("")||adm_emp_Password.getText().equals("")))
            {
                empId=adm_emp_Id.getText();
                empName=adm_emp_Name.getText();
                empEmail=adm_emp_Email.getText();
                empPhone=adm_emp_Phone.getText();
                empAddress=adm_emp_Address.getText();
                empPassword=adm_emp_Password.getText();
                PreparedStatement ps = con.prepareStatement("insert into emp_tbl values(?,?,?,?,?)");
                ps.setString(1,empName);
                ps.setString(2,empEmail);
                ps.setString(3,empPhone);
                ps.setString(4,empAddress);
                ps.setString(5,empPassword);
                ps.executeUpdate(); 
                JOptionPane.showMessageDialog(this,"Employess Inserted Successfully");
                new admEmployees().setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"All Fields are mandatory");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_adm_emp_NewActionPerformed

    private void adm_emp_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_emp_UpdateActionPerformed
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databasename=courier;integratedSecurity=true";
        try(Connection con = DriverManager.getConnection(connectionUrl);)
        {
            if(!(adm_emp_Id.getText().equals("") ||adm_emp_Name.getText().equals("") ||adm_emp_Email.getText().equals("") ||adm_emp_Phone.getText().equals("") || adm_emp_Address.getText().equals("")||adm_emp_Password.getText().equals("")))
            {
                empId=adm_emp_Id.getText();
                empName=adm_emp_Name.getText();
                empEmail=adm_emp_Email.getText();
                empPhone=adm_emp_Phone.getText();
                empAddress=adm_emp_Address.getText();
                empPassword=adm_emp_Password.getText();
                PreparedStatement ps = con.prepareStatement("UPDATE emp_tbl SET empName=?,empEmail=?,empPhone=?,empAddress=?,empPassword=? WHERE empId = ?");
                ps.setString(1,empName);
                ps.setString(2,empEmail);
                ps.setString(3,empPhone);
                ps.setString(4,empAddress);
                ps.setString(5,empPassword);
                ps.setString(6,empId);
                ps.executeUpdate(); 
                JOptionPane.showMessageDialog(this,"Employess Updated Successfully");
                new admEmployees().setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"All Fields are mandatory");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_adm_emp_UpdateActionPerformed

    private void adm_emp_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_emp_RemoveActionPerformed
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databasename=courier;integratedSecurity=true";
        try(Connection con = DriverManager.getConnection(connectionUrl);)
        {
            if(!(adm_emp_Id.getText().equals("") ))
            {
                empId=adm_emp_Id.getText();
                PreparedStatement ps = con.prepareStatement("DELETE from emp_tbl WHERE empId = ?");
                ps.setString(1,empId);
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Are sure you want to Remove Employee", "Delete Employee", dialogButton);
                if(dialogResult == 0) 
                {
                ps.executeUpdate(); 
                JOptionPane.showMessageDialog(this,"Employess Deleted Successfully");
                new admEmployees().setVisible(true);
                this.dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"All Fields are mandatory");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error"+e);
        }
    }//GEN-LAST:event_adm_emp_RemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(admEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adm_Employee_Table;
    private javax.swing.JTextField adm_emp_Address;
    private javax.swing.JTextField adm_emp_Email;
    private javax.swing.JTextField adm_emp_Id;
    private javax.swing.JTextField adm_emp_Name;
    private javax.swing.JButton adm_emp_New;
    private javax.swing.JTextField adm_emp_Password;
    private javax.swing.JTextField adm_emp_Phone;
    private javax.swing.JButton adm_emp_Remove;
    private javax.swing.JButton adm_emp_Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
