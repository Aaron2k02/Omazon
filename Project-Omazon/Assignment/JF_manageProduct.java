/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Assignment;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author abrar
 */
public class JF_manageProduct extends javax.swing.JFrame {

    private String username;

    JF_manageProduct(String username) {
                initComponents();
               Display_Product_In_Table();
                this.username = username;
                
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Creates new form test
     */
    public JF_manageProduct() {
        initComponents();
         Display_Product_In_Table();
         this.username = username;
    }
        
    String ImagePath = null;
    int position = 0;

    // Resize Image 
    public ImageIcon ResizeImage(String imagePath,byte[]  pic){
        
        ImageIcon ProductImage = null;
        
        if(imagePath != null){
            
             ProductImage = new ImageIcon(imagePath);
        }else{
             ProductImage = new ImageIcon(pic);
        }
        
        Image image = ProductImage.getImage();
        Image image2 = image.getScaledInstance(DisplayImagefield.getWidth(), DisplayImagefield.getHeight(), Image.SCALE_SMOOTH );
        ImageIcon img = new ImageIcon(image2);
        return img;
        
    }
    
    //Check field for input
    
    public boolean checkInput(){
        
        if(namefield.getText()==null || descriptionfield.getText()==null||pricefield.getText()==null||stockfield.getText()==null||salesfield.getText()==null||rolefield.getSelectedItem().toString()==null ){
            return false;
        }else{
            try{
                Float.parseFloat(pricefield.getText());
                
                return true;
                
            }catch(Exception ex){
                return false;
            }
        }
    }
    // Display Product Information in Table
    // Fill ArrayList with The Data 
       

    // populate table with product information 
    
    
    
    public void Display_Product_In_Table(){
        ArrayList<ProductList> P_List = ProductDB.TableContent();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //clearing table content;
        model.setRowCount(0);
        Object[] row = new Object[7];
        for(int i=0;i<P_List.size();i++){
            
            
            row[0] = P_List.get(i).getProductName();
            
            row[1] = P_List.get(i).getDescription();
            
            row[2] = P_List.get(i).getPrice();
            
            row[3] = P_List.get(i).getStockcount();
            
            row[4] = P_List.get(i).getSalescount();
            
            row[5] = P_List.get(i).getProductCategory();
            
            row[6] = ResizeImage(null,P_List.get(i).getImage());
       
            model.addRow(row);
//            jTable1.setRowHeight(150);
//            jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    
        
    }
    // Execute SQL
   public void DisplayItem(int index){
      
       namefield.setText(ProductDB.TableContent().get(index).getProductName());
       descriptionfield.setText(ProductDB.TableContent().get(index).getDescription());
       pricefield.setText(Float.toString((float) ProductDB.TableContent().get(index).getPrice()));
       stockfield.setText(Integer.toString(ProductDB.TableContent().get(index).getStockcount()));
       salesfield.setText(Integer.toString(ProductDB.TableContent().get(index).getSalescount()));
       DisplayImagefield.setIcon(ResizeImage(null,ProductDB.TableContent().get(index).getImage()));
       // Display_image.setIcon(ResizeImage(null,ProductDB.TableGenerator().get(index).getImage());

   }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Btn_AddImage = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        AddProduct_Button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        namefield = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        descriptionfield = new javax.swing.JTextField();
        pricefield = new javax.swing.JTextField();
        rolefield = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        stockfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        salesfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        DisplayImagefield = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Product Price:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Product Stock:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Product Sales Count:");

        Btn_AddImage.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Btn_AddImage.setText("Choose Image");
        Btn_AddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddImageActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Product Category:");

        AddProduct_Button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AddProduct_Button.setText("Add Product");
        AddProduct_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProduct_ButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Delete Product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UpdateButton.setText("Update Product");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        descriptionfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionfieldActionPerformed(evt);
            }
        });

        rolefield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronic", "Sport and recreation", "Food&Beverage", "Apparel" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE PRODUCT");

        stockfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockfieldActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductName", "Description", "ProductPrice", "ProductStock", "SalesCount", "ProductCategory", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Product Name:");

        salesfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Description:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Product List");

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(descriptionfield, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rolefield, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(salesfield, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(stockfield, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddProduct_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DisplayImagefield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Btn_AddImage, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(397, 397, 397))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(descriptionfield, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pricefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(DisplayImagefield, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Btn_AddImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddProduct_Button)
                            .addComponent(jButton2)
                            .addComponent(UpdateButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(stockfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(salesfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rolefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AddImageActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image","jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result==  JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            DisplayImagefield.setIcon(ResizeImage(path,null));
            ImagePath = path;
            
        }else{
             System.out.println("Please select an Image ");
            
        }
    }//GEN-LAST:event_Btn_AddImageActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection conn=ProductDB.getConnection();
        if(!namefield.getText().equals("")){
           //
               

              ProductDB.delete(namefield.getText());
              Display_Product_In_Table();
              //JOptionPane.showMessageDialog(null,"Product Deleted Successfully");
            
        }else{
              JOptionPane.showMessageDialog(null,"Please select a Product");
        }

              
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefieldActionPerformed

    private void descriptionfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionfieldActionPerformed

    private void stockfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockfieldActionPerformed

    private void salesfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesfieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         dispose();
         JF_myProduct sc = new JF_myProduct();
         sc.setLocationRelativeTo(null);
         sc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddProduct_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProduct_ButtonActionPerformed
        // TODO add your handling code here:
              if(checkInput()&& ImagePath != null){
             Connection conn=ProductDB.getConnection(); 

                
                ProductDB.insert(namefield.getText(),descriptionfield.getText(),pricefield.getText(),stockfield.getText(), rolefield.getSelectedItem().toString(), ImagePath);
                Display_Product_In_Table();
                
            }else{
             JOptionPane.showMessageDialog(null,"Please Fill the required field");
          }
//        String name = namefield.getText();
//        String description = descriptionfield.getText();
//        int price = Integer.parseInt(pricefield.getText());
//        int stock = Integer.parseInt(stockfield.getText());
//        int sales = Integer.parseInt(salesfield.getText());
//        String sort = rolefield.getSelectedItem().toString();
//       
//         if(namefield.getText().isEmpty()||descriptionfield.getText().isEmpty()||pricefield.getText().isEmpty()||stockfield.getText().isEmpty()||salesfield.getText().isEmpty()){
//              JOptionPane.showMessageDialog(null, "Missing Information!");
//         }else{
//             
//         try{
//                 Class.forName("com.mysql.cj.jdbc.Driver");
//                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/omazon", "root", "PBB.v8*$z7bz#c5");
//                 Statement st = con.createStatement();
//                 ResultSet res = st.executeQuery("select * from product  ");
//                 
//                 if(res.next()){
//                     int executeUpdate = st.executeUpdate("INSERT INTO product(product_name, descriptions, price, stock_count, sales_count, product_category, username) "
//                             + "VALUES(' "+name+" ',' "+description+" ', "+price+", "+stock+", "+sales+", ' "+sort+" ', ' "+this.username+" '  ");
//                     JOptionPane.showMessageDialog(null, "Product has been added");
//                     jTable1.setModel(.resultSetToTableModel(res));
                    
//                 }
//        }catch (ClassNotFoundException e) {
//            System.out.println("Error 1");
//            System.out.println(e);
//            }
//        catch (SQLException e){
//            System.out.println("Error 2");
//            System.out.println(e);
//            }
//         }
        
    }//GEN-LAST:event_AddProduct_ButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
                if(checkInput() && pricefield.getText() != null){
            

            
            if(ImagePath == null){

                ProductDB.update(namefield.getText(), descriptionfield.getText(), pricefield.getText(), stockfield.getText(),  rolefield.getSelectedItem().toString(), null);
                Display_Product_In_Table();
            }else{

                  ProductDB.update(namefield.getText(), descriptionfield.getText(), pricefield.getText(), stockfield.getText(),  rolefield.getSelectedItem().toString(), ImagePath);
                  Display_Product_In_Table();
                

            }
            
        }else{
                 JOptionPane.showMessageDialog(null,"Please fill in the field correctly! ");
        }
//        String name = namefield.getText();
//        String description = descriptionfield.getText();
//        int price = Integer.parseInt(pricefield.getText());
//        int stock = Integer.parseInt(stockfield.getText());
//        int sales = Integer.parseInt(salesfield.getText());
//        String sort = rolefield.getSelectedItem().toString();
//       
//        if(namefield.getText().isEmpty()||descriptionfield.getText().isEmpty()||pricefield.getText().isEmpty()||stockfield.getText().isEmpty()||salesfield.getText().isEmpty()){
//              JOptionPane.showMessageDialog(null, "Missing Information!");
//         }else{
//         try{
//                 Class.forName("com.mysql.cj.jdbc.Driver");
//                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/omazon", "root", "PBB.v8*$z7bz#c5");
//                 String Query = "UPDATE product SET product_name = ' " +name+ " ' " +", descriptions = ' " +description+ " ' " + ", price = ' " +price+ " ' "+", stock_count = ' " +stock+ " ' "+", sales_count = ' " +sales+ " ' where product_name = ' " +name+ " ' ";
//                 Statement st = con.createStatement();
//                 st.executeUpdate(Query);
//                 ResultSet res = st.executeQuery("select * from product where product_name = ' " +name+ " ' ");
                 
//                 if(res.next()){
//                 int executeUpdate = st.executeUpdate("UPDATE product SET product_name = ' " +name+ " ' " +", descriptions = ' " +description+ " ' " + ", price = ' " +price+ " ' "+", stock_count = ' " +stock+ " ' "+", sales_count = ' " +sales+ " ' "+", product_category = ' " +sort+ " ' WHERE product_name = ' " +name+ " ' ");
//                 JOptionPane.showMessageDialog(null, "Product Updated");
//                 }
//        }catch (ClassNotFoundException e) {
//            System.out.println("Error 1");
//            System.out.println(e);
//            }
//        catch (SQLException e){
//            System.out.println("Error 2");
//            System.out.println(e);
//            }
            
//        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
               int index = jTable1.getSelectedRow();
               DisplayItem(index);
//        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
//        int Myindex = jTable1.getSelectedRow();
//        namefield.setText(model.getValueAt(Myindex, 0).toString());
//        descriptionfield.setText(model.getValueAt(Myindex, 1).toString());
//        pricefield.setText(model.getValueAt(Myindex, 2).toString());
//        stockfield.setText(model.getValueAt(Myindex, 3).toString());
//        salesfield.setText(model.getValueAt(Myindex, 4).toString());
//        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        namefield.setText(" ");
        descriptionfield.setText(" ");
        pricefield.setText(" ");
        stockfield.setText(" ");
        salesfield.setText(" ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel(new String[]{"ProductName","Description","ProductPrice","ProductStock","SalesCount","ProductCategory","Image"},0);      
        
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/omazon", "root", "PBB.v8*$z7bz#c5");
         Statement st = con.createStatement();
         ResultSet res = st.executeQuery("select * from product ");
         
         
         while(res.next()){
//             int a = res.getInt("Product_Id");
             String b = res.getString("product_name");
             String c = res.getString("descriptions");
             int d = res.getInt("price");
             int e = res.getInt("stock_count");
             int f = res.getInt("sales_count");
             String g = res.getString("product_category");
             String h = res.getString("product_image");
             
             
             model.addRow(new Object[]{b,c,d,e,f,g});
             jTable1.setModel(model);
             jTable1.setVisible(true);
         }
        }catch (ClassNotFoundException e) {
            System.out.println("Error 1");
            System.out.println(e);
            }
        catch (SQLException e){
            System.out.println("Error 2");
            System.out.println(e);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_manageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_manageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_manageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_manageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JF_manageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProduct_Button;
    private javax.swing.JButton Btn_AddImage;
    private javax.swing.JLabel DisplayImagefield;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField descriptionfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField pricefield;
    private javax.swing.JComboBox<String> rolefield;
    private javax.swing.JTextField salesfield;
    private javax.swing.JTextField stockfield;
    // End of variables declaration//GEN-END:variables
}
