
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

        adm_emp_Id.setText("jTextField1");

        adm_emp_Name.setText("jTextField1");

        adm_emp_Email.setText("jTextField1");

        adm_emp_Phone.setText("jTextField1");

        adm_emp_Address.setText("jTextField1");

        adm_emp_Password.setText("jTextField1");

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Email");

        jLabel4.setText("Phone");

        jLabel5.setText("Address");

        jLabel6.setText("Password");

        adm_emp_New.setText("New");

        adm_emp_Update.setText("Update");

        adm_emp_Remove.setText("Remove");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(adm_emp_New, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adm_emp_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(adm_emp_Name)
                                    .addComponent(adm_emp_Email))
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adm_emp_Phone)
                                    .addComponent(adm_emp_Address)
                                    .addComponent(adm_emp_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adm_emp_Update)
                                .addGap(45, 45, 45)
                                .addComponent(adm_emp_Remove)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adm_emp_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adm_emp_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adm_emp_New)
                    .addComponent(adm_emp_Update)
                    .addComponent(adm_emp_Remove))
                .addContainerGap(26, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
