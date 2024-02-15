
package Report;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
public class Payment extends javax.swing.JFrame {
    ConnectionDB db = new ConnectionDB();
     DecimalFormat df = new DecimalFormat("0.00");
     double payment,discount;
    public Payment() {
     initComponents();
   
     db.FetchData();
     tbtable.setModel(db.getmModel());
     txttotal.setText(String.valueOf(df.format(db.getTotal()))+"$");
     txtpayment.setText(String.valueOf(df.format(db.getTotal()))+"$");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        txtpayment = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        cbdiscount = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JButton();
        btncash = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1068, 354));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\MyFile\\Picture\\Icon\\Java.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 180, 360);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Payment");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 0, 190, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Total :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 70, 70, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Discound :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 130, 100, 40);

        Price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Price.setText("Payment :");
        getContentPane().add(Price);
        Price.setBounds(200, 190, 80, 40);
        getContentPane().add(txtpayment);
        txtpayment.setBounds(300, 200, 170, 30);
        getContentPane().add(txttotal);
        txttotal.setBounds(300, 80, 170, 30);

        cbdiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%" }));
        cbdiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdiscountActionPerformed(evt);
            }
        });
        getContentPane().add(cbdiscount);
        cbdiscount.setBounds(300, 140, 170, 30);

        btnback.setBackground(new java.awt.Color(255, 153, 153));
        btnback.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        btnback.setForeground(new java.awt.Color(102, 102, 102));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback);
        btnback.setBounds(540, 270, 120, 30);

        btncash.setBackground(new java.awt.Color(0, 102, 102));
        btncash.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        btncash.setText("Case");
        btncash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncashActionPerformed(evt);
            }
        });
        getContentPane().add(btncash);
        btncash.setBounds(910, 270, 120, 30);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Qty", "Price", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tbtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 30, 540, 230);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 0, 890, 360);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
      Product.main(null);
      dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void cbdiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdiscountActionPerformed
       String dis = cbdiscount.getSelectedItem().toString();
       dis = dis.replace("%","");
       discount = Double.parseDouble(dis);
       payment = db.getTotal()-(db.getTotal()*discount)/100;
       txtpayment.setText(String.valueOf(df.format(payment))+"$");
       
       
    }//GEN-LAST:event_cbdiscountActionPerformed
    Collection data()
    {
        ArrayList<ProductList> lr = new ArrayList<>();
        for(ProductList temp :ProductList.list)
        {
            int code = temp.getCode();
            String name = temp.getName();
            int qty = temp.getQty();
            double price = temp.getPrice();
            double amount = temp.getAmount();
            lr.add(new ProductList(code, name, qty, price, amount));                   
        }
        return lr;
    }
   
    private void btncashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncashActionPerformed
            try {
            JasperReport jp = JasperCompileManager.compileReport("Report/MyInvoice.jrxml");
            HashMap pr = new HashMap();
            pr.put("total",db.getTotal());
            pr.put("discount",discount/100);
            pr.put("payment",payment);
            
           JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(data());
           JasperPrint price = JasperFillManager.fillReport(jp, pr,jcd);
           JasperViewer.viewReport(price,false);
           
            //JasperPrintManager.printReport(price, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        db.Reset();
    }//GEN-LAST:event_btncashActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Price;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncash;
    private javax.swing.JComboBox<String> cbdiscount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextField txtpayment;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
