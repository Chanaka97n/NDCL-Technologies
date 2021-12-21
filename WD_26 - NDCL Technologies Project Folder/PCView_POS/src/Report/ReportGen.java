/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import DB.DBConnection;
import Interface.Home;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Nimesh
 */
public class ReportGen extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    int x,y;
    Connection con;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ReportGen() {
        initComponents();
        con = DBConnection.connect();
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnstocksreport = new javax.swing.JButton();
        btnsalesreport = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(86, 108, 156));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock Reports");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-minimize-window-24.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-close-window-24.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 720, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 26)); // NOI18N
        jLabel2.setText("---------------------------------------------PC View---------------------------------------------");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 22, -1, -1));

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Pilimathalawa");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 71, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Tel : +94 776222111 ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel5.setText("Stocks Report");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel7.setText("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 248, 825, -1));

        btnstocksreport.setBackground(new java.awt.Color(255, 255, 255));
        btnstocksreport.setFont(new java.awt.Font("THARU DC  Shakthi", 0, 20)); // NOI18N
        btnstocksreport.setText("Print Report");
        btnstocksreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstocksreportActionPerformed(evt);
            }
        });
        jPanel3.add(btnstocksreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 175, 56));

        btnsalesreport.setBackground(new java.awt.Color(255, 255, 255));
        btnsalesreport.setFont(new java.awt.Font("THARU DC  Shakthi", 0, 20)); // NOI18N
        btnsalesreport.setText("Print Report");
        btnsalesreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalesreportMouseClicked(evt);
            }
        });
        jPanel3.add(btnsalesreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 175, 56));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel8.setText("Sales Report");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("E-mail : pcview.inbox@gmail.com");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 148, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-cloud-print-100.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 346, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-stack-100.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-sale-96.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, -1, 90));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 908, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void btnstocksreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstocksreportActionPerformed
      
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("PC View Stocks Report.pdf"));
            document.open();

            Paragraph p = new Paragraph("PC View Computers ", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD));
            p.setAlignment(Paragraph.ALIGN_CENTER);

            document.add(p);

            document.add(new Paragraph("Stocks Report ", FontFactory.getFont(FontFactory.TIMES_BOLD, 12, Font.BOLD)));
            document.add(new Paragraph(new Date().toString()));

            document.add(new Paragraph("                                                            "));

            String sql = "SELECT `item_id`, `item_name`, `category`, `serial_no`, `sale_price`, `buy_price`, `no_of_items` FROM `stock`";
            pst = (PreparedStatement) con.prepareStatement(sql);
            rs = pst.executeQuery();
            PdfPTable tablesup = new PdfPTable(7);
            tablesup.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);

            tablesup.addCell("IID");
            tablesup.addCell("Item Name");
            tablesup.addCell("Category");
            tablesup.addCell("Serial No.");
            tablesup.addCell("Sale Price");
            tablesup.addCell("Buy Price");
            tablesup.addCell("No. of Items");
            tablesup.setHeaderRows(1);
            PdfPCell[] cells = tablesup.getRow(0).getCells();

            for (int j = 0; j < cells.length; j++) {
                cells[j].setBackgroundColor(Color.GREEN);
            }

            while (rs.next()) {

                String v1 = rs.getString("item_id");
                String v2 = rs.getString("item_name");
                String v3 = rs.getString("category");
                String v4 = rs.getString("serial_no");
                String v5 = rs.getString("sale_price");
                String v6 = rs.getString("buy_price");
                String v7= rs.getString("no_of_items");

                tablesup.addCell(v1);
                tablesup.addCell(v2);
                tablesup.addCell(v3);
                tablesup.addCell(v4);
                tablesup.addCell(v5);
                tablesup.addCell(v6);
                tablesup.addCell(v7);

            }

            document.add(tablesup);

            document.close();
            JOptionPane.showMessageDialog(null, "Stocks Report Generated.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnstocksreportActionPerformed

    private void btnsalesreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalesreportMouseClicked
        
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("PC View Sales Report.pdf"));
            document.open();

            Paragraph p = new Paragraph("PC View Computers ", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD));
            p.setAlignment(Paragraph.ALIGN_CENTER);

            document.add(p);

            document.add(new Paragraph("Sales Report ", FontFactory.getFont(FontFactory.TIMES_BOLD, 12, Font.BOLD)));
            document.add(new Paragraph(new Date().toString()));

            document.add(new Paragraph("                                                            "));

            String sql = "SELECT `sale_id`, `unit_price`, `no_of_items`, `total_price`, `discount`, `payable`, `cash`, `balance`, `date` FROM `sale` ";
            pst = (PreparedStatement) con.prepareStatement(sql);
            rs = pst.executeQuery();
            PdfPTable tablesup = new PdfPTable(9);
            tablesup.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);

            tablesup.addCell("SID");
            tablesup.addCell("Unit Price");
            tablesup.addCell("Quantity");
            tablesup.addCell("Total Price");
            tablesup.addCell("Discount");
            tablesup.addCell("Payment");
            tablesup.addCell("Cash");
            tablesup.addCell("Balance");
            tablesup.addCell("Date");
            tablesup.setHeaderRows(1);
            PdfPCell[] cells = tablesup.getRow(0).getCells();

            for (int j = 0; j < cells.length; j++) {
                cells[j].setBackgroundColor(Color.GREEN);
            }

            while (rs.next()) {

                String v1 = rs.getString("sale_id");
                String v2 = rs.getString("unit_price");
                String v3 = rs.getString("no_of_items");
                String v4 = rs.getString("total_price");
                String v5 = rs.getString("discount");
                String v6 = rs.getString("payable");
                String v7= rs.getString("cash");
                String v8 = rs.getString("balance");
                String v9 = rs.getString("date");

                tablesup.addCell(v1);
                tablesup.addCell(v2);
                tablesup.addCell(v3);
                tablesup.addCell(v4);
                tablesup.addCell(v5);
                tablesup.addCell(v6);
                tablesup.addCell(v7);
                tablesup.addCell(v8);
                tablesup.addCell(v9);

            }

            document.add(tablesup);

            document.close();
            JOptionPane.showMessageDialog(null, "Sales Report Generated.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnsalesreportMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        this.setExtendedState(ReportGen.ICONIFIED);

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        Home ho = new Home();
        ho.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel14MouseClicked

    
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalesreport;
    private javax.swing.JButton btnstocksreport;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    // End of variables declaration//GEN-END:variables
}
