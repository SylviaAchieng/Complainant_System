/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package complaint_management_system;

import static complaint_management_system.HomePage.userr;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author collins
 */
public class CompHistory extends javax.swing.JPanel {

    /**
     * Creates new form FollowUp
     */
    public CompHistory() {
        initComponents();
        tbload();
    }
        public void tbload(){
        try{
              
            DefaultTableModel dt = (DefaultTableModel) histTable.getModel();
            
            dt.setRowCount(0);
            String regworknumber = userr.getText();
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM register_complaint WHERE RegWorkNumber='" + regworknumber + "'");
            
            
            while(rs.next()){
                Vector v = new Vector();
                
                //v.add(rs.getString(1));
                //v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));
            
                
                
                
                dt.addRow(v);
            }
            
        }catch (SQLException e){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        histTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        histTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "category", "title", "department", "status", "date", "time", "word_details", "statuss", "details"
            }
        ));
        jScrollPane1.setViewportView(histTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable histTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
