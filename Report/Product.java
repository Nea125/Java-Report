
package Report;
import java.text.DecimalFormat;
public class Product extends javax.swing.JFrame {
    double total,amount;
    ConnectionDB db = new ConnectionDB();
    DecimalFormat df = new DecimalFormat("0.00");
    public Product() {
        initComponents();
        
    }
    void Clear()
    {
        txtcode.setText("");
        txtname.setText("");
        txtprice.setText("");
        txtqty.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        btnpayment = new javax.swing.JButton();
        txtadd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(789, 354));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Product Add");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 10, 290, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Total : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 200, 70, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Code :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 90, 70, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 150, 70, 40);

        Price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Price.setText("Price :");
        getContentPane().add(Price);
        Price.setBounds(190, 200, 70, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Qty :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 90, 70, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Amount :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(500, 150, 100, 40);

        txttotal.setEditable(false);
        getContentPane().add(txttotal);
        txttotal.setBounds(590, 200, 170, 30);
        getContentPane().add(txtcode);
        txtcode.setBounds(270, 100, 170, 30);
        getContentPane().add(txtname);
        txtname.setBounds(270, 160, 170, 30);
        getContentPane().add(txtprice);
        txtprice.setBounds(270, 210, 170, 30);
        getContentPane().add(txtqty);
        txtqty.setBounds(590, 100, 170, 30);

        txtamount.setEditable(false);
        getContentPane().add(txtamount);
        txtamount.setBounds(590, 150, 170, 30);

        btnpayment.setBackground(new java.awt.Color(255, 204, 204));
        btnpayment.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        btnpayment.setText("Payment");
        btnpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaymentActionPerformed(evt);
            }
        });
        getContentPane().add(btnpayment);
        btnpayment.setBounds(590, 270, 120, 30);

        txtadd.setBackground(new java.awt.Color(0, 153, 153));
        txtadd.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        txtadd.setForeground(new java.awt.Color(102, 102, 102));
        txtadd.setText("Add");
        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });
        getContentPane().add(txtadd);
        txtadd.setBounds(290, 270, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\MyFile\\Picture\\Icon\\Java.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 170, 410);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(170, 0, 620, 360);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
     int code = Integer.parseInt(txtcode.getText());
     String name = txtname.getText();
     int qty = Integer.parseInt(txtqty.getText());
     double price = Double.parseDouble(txtprice.getText());
     amount=qty*price;
     total+=amount;
     txtamount.setText(String.valueOf(df.format(amount))+"$");
     txttotal.setText(String.valueOf(df.format(total))+"$");
     db.InsertData(code, name, qty, price, total, amount);
     Clear();
     
     
     
      
    }//GEN-LAST:event_txtaddActionPerformed

    private void btnpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaymentActionPerformed
      Payment.main(null);
      dispose();
    }//GEN-LAST:event_btnpaymentActionPerformed

   
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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Price;
    private javax.swing.JButton btnpayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton txtadd;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
