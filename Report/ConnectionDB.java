
package Report;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;  // throw data into database
import java.sql.ResultSet;          // push data to database
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ConnectionDB {
    PreparedStatement ps;
    ResultSet r;
    DecimalFormat df = new DecimalFormat("0.00");
    String sql;
    String col[]={"Code","Name","Qty","Price","Amount"};
    ImageIcon icon = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\C.png");
    ImageIcon iconerr = new ImageIcon("D:\\MyFile\\Picture\\Icon\\Error.png");
    DefaultTableModel model = new DefaultTableModel(col, 0);
    DefaultTableModel getmModel()
    {
        return model;
    }
    double total=0;
    double getTotal()
    {
        return total;
    }
     Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_2_3pmp","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: "+e.getMessage());
        }
        return con;
  }
  void InsertData(int code,String name,int qty,double price,double total,double amount)
  {
      try {
          sql = "INSERT INTO addproduct(Code,Name,Qty,Price,Amount,Total) VALUES(?,?,?,?,?,?)";
         // sql = "INSERT INTO storeproduct(Code,Name,Qty,Price,Amount,Total) VALUES(?,?,?,?,?,?)";
          ps = connection().prepareStatement(sql);
          ps.setInt(1, code);
          ps.setString(2, name);
          ps.setInt(3, qty);
          ps.setDouble(4, price);
          ps.setDouble(5, amount);
          ps.setDouble(6, total);
          int index = ps.executeUpdate();
          if(index>0)
          {
             JOptionPane.showMessageDialog(null,"Data Saved","Save", index, icon);
          }
          
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
      }
  }
  void FetchData()
  {
      try {
          sql = "SELECT *FROM addproduct";
          ps = connection().prepareStatement(sql);
          r = ps.executeQuery();
           model.setRowCount(0);
          while(r.next())
          {
             
              Object row[]={
                  r.getInt("Code"),
                  r.getString("Name"),
                  r.getInt("Qty"),
                  df.format(r.getDouble("Price"))+"$",
                  df.format(r.getDouble("Amount"))+"$",
                  
              };
              model.addRow(row);
              total +=r.getDouble("Amount");
              ProductList.list.add(new ProductList(
                  r.getInt("Code"),
                  r.getString("Name"),
                  r.getInt("Qty"),
                  r.getDouble("Price"),
                  r.getDouble("Amount")
                 ));
          }
          
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  }
  void Reset()
  {
      try {
          sql = "DELETE FROM addproduct";
          ps = connection().prepareStatement(sql);
          int index = ps.executeUpdate();
          if(index>0)
          {
              JOptionPane.showMessageDialog(null,"Data Reseted......");
          }
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  }
   
    
    
    
}
