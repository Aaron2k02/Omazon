/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Product;

import static java.awt.SystemColor.text;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class JF_ProductInformation extends javax.swing.JFrame {

    /**
     * Creates new form JF_ProductInformation
     */
    public JF_ProductInformation() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
         DisplayComment();
    }
   
    public void DisplayComment(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/omazon", "root", "");
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select * from product_review");
            DefaultTableModel model =  (DefaultTableModel) CommentTable.getModel();
            model.setRowCount(0);
            
            Object[] row = new Object[3];
            while(rs.next()){
                row[0] = rs.getString("Comment");
                row[1] = rs.getInt("Rating");
                row[2] = rs.getString("SellerComment");
                
                model.addRow(row);
                
            }
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JF_ProductInformation.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Display_image = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Product_Quantity = new javax.swing.JTextField();
        AddToFavourite = new javax.swing.JButton();
        Product_Price = new javax.swing.JLabel();
        Product_Name = new javax.swing.JLabel();
        Product_salesCount = new javax.swing.JLabel();
        Product_Category = new javax.swing.JLabel();
        Product_Stock = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ProductDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentTable = new javax.swing.JTable();
        AddToCart = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Product Detail ");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Product Name: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Product Price: ");
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Product Stock: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Product Category: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Product Sales Count: ");

        Display_image.setOpaque(true);
        Display_image.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Display_imageAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Quantity: ");

        Product_Quantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Product_Quantity.setText(" ");
        Product_Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_QuantityActionPerformed(evt);
            }
        });

        AddToFavourite.setText("Favourite");
        AddToFavourite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToFavouriteActionPerformed(evt);
            }
        });

        Product_Price.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Product_Price.setOpaque(true);
        Product_Price.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Product_PriceAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Product_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Product_Name.setOpaque(true);
        Product_Name.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Product_NameAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Product_salesCount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Product_salesCount.setOpaque(true);
        Product_salesCount.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Product_salesCountAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Product_Category.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Product_Category.setOpaque(true);
        Product_Category.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Product_CategoryAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Product_Stock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Product_Stock.setOpaque(true);
        Product_Stock.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Product_StockAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Product Description: ");

        ProductDescription.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProductDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ProductDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProductDescription.setOpaque(true);
        ProductDescription.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        ProductDescription.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ProductDescriptionAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        CommentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Comment ", "Rating", "Seller Comment"
            }
        ));
        CommentTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CommentTable.getTableHeader().setResizingAllowed(false);
        CommentTable.getTableHeader().setReorderingAllowed(false);
        CommentTable.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(CommentTable);

        AddToCart.setText("Add To Cart ");
        AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Product_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Product_salesCount, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Product_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Product_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Product_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(AddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AddToFavourite, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Display_image, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Display_image, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Product_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddToFavourite, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Product_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Product_salesCount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(Product_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Product_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void Display_imageAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Display_imageAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Display_imageAncestorAdded

    private void Product_QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_QuantityActionPerformed
   
    JF_Cart cart = new  JF_Cart();
    static    int total = 0 ;
    private void AddToFavouriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToFavouriteActionPerformed
        cart.setVisible(true);
        cart.pack();
        
        DefaultTableModel model = (DefaultTableModel)cart.Cart_Table.getModel();
        model.setRowCount(0);
        // in main page put variable as static to sync static int total = 0;   static String tot = "";
     
        
        Object[] data = new Object[4]; 
        for(int i=0;i<ProductDB.TableContent().size();i++){
            data[0] = ProductDB.TableContent().get(i).getProductName();
            data[1] = ProductDB.TableContent().get(i).getProductCategory();
            data[2] =  ProductDB.TableContent().get(i).getPrice();
            data[3] = ProductDB.TableContent().get(i).getStockcount();
            
            model.addRow(data);
            cart.Cart_Table.setRowHeight(20);
            total += Integer.parseInt( cart.Cart_Table.getValueAt(i, 2)+"");
            
        }
        
        cart.Purchase_Amount.setText(String.valueOf(total));
        
    }//GEN-LAST:event_AddToFavouriteActionPerformed

    private void Product_PriceAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Product_PriceAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_PriceAncestorAdded

    private void Product_NameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Product_NameAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_NameAncestorAdded

    private void Product_salesCountAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Product_salesCountAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_salesCountAncestorAdded

    private void Product_CategoryAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Product_CategoryAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_CategoryAncestorAdded

    private void Product_StockAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Product_StockAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_StockAncestorAdded

    private void ProductDescriptionAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ProductDescriptionAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductDescriptionAncestorAdded
    public static ArrayList<ProductList> cartItem = new ArrayList();
    
    private void AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartActionPerformed
   
        if(Integer.parseInt(this.Product_Stock.getText())<Integer.parseInt(this.Product_Quantity.getText())){
             JOptionPane.showMessageDialog(null, "Not enough product in Stock!");
        }
        else{
            int quantity = Integer.parseInt(this.Product_Quantity.getText());
            ProductList p = new ProductList(this.Product_Name.getText(),this.ProductDescription.getText(),quantity*Double.parseDouble(this.Product_Price.getText()),Integer.parseInt(this.Product_Stock.getText()),quantity+Integer.parseInt(this.Product_salesCount.getText()),this.Product_Category.getText(),null);
            
             cartItem.add(p);
             
             JOptionPane.showMessageDialog(null, "Product added to cart!");
             
             int StockUpdate = Integer.parseInt(this.Product_Stock.getText())-Integer.parseInt(this.Product_Quantity.getText());
             
             ProductDB.updateStock(this.Product_Name.getText(),StockUpdate);
   
        }       
    }//GEN-LAST:event_AddToCartActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

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
            java.util.logging.Logger.getLogger(JF_ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_ProductInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCart;
    private javax.swing.JButton AddToFavourite;
    private javax.swing.JTable CommentTable;
    public javax.swing.JLabel Display_image;
    public javax.swing.JLabel ProductDescription;
    public javax.swing.JLabel Product_Category;
    public javax.swing.JLabel Product_Name;
    public javax.swing.JLabel Product_Price;
    private javax.swing.JTextField Product_Quantity;
    public javax.swing.JLabel Product_Stock;
    public javax.swing.JLabel Product_salesCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
