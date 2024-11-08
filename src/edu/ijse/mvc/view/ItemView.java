/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.Controller.ItemController;
import edu.ijse.mvc.dto.Itemdto;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Clone
 */
public class ItemView extends javax.swing.JFrame {

    private final ItemController itemController;
     
     public ItemView() throws Exception {
        initComponents();
        itemController = new ItemController();
        loadTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblcode = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblPack = new javax.swing.JLabel();
        lblUnitPrice = new javax.swing.JLabel();
        lblQoh = new javax.swing.JLabel();
        textDesc = new javax.swing.JTextField();
        textCode = new javax.swing.JTextField();
        textPack = new javax.swing.JTextField();
        textUnitPrice = new javax.swing.JTextField();
        textQoh = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setBackground(new java.awt.Color(255, 153, 153));
        lblTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Item Form");
        lblTitle.setToolTipText("");

        lblcode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcode.setText("Code");

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescription.setText("Description");

        lblPack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPack.setText("Pack Size");

        lblUnitPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUnitPrice.setText("Unit Price");

        lblQoh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQoh.setText("QOH");

        btnSave.setBackground(new java.awt.Color(255, 0, 153));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.setName(""); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 0, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 255, 102));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item code", "Description", "Pack Size", "Unit Price", "QtyOnHand"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textUnitPrice))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcode, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCode, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(textDesc)
                                    .addComponent(textPack))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(lblQoh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textQoh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQoh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textQoh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveItem();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
       searchItem();
    }//GEN-LAST:event_tblItemMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteItem();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateItem();
    }//GEN-LAST:event_btnUpdateActionPerformed
    /**
     * @param args the command line arguments
     */
   //
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblPack;
    private javax.swing.JLabel lblQoh;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JLabel lblcode;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField textCode;
    private javax.swing.JTextField textDesc;
    private javax.swing.JTextField textPack;
    private javax.swing.JTextField textQoh;
    private javax.swing.JTextField textUnitPrice;
    // End of variables declaration//GEN-END:variables
 private void saveItem(){
        try{
Itemdto dto = new Itemdto(textCode.getText(), textDesc.getText(), textPack.getText(), Double.parseDouble(textUnitPrice.getText()), Integer.parseInt(textQoh.getText()));
        String resp = itemController.saveItem(dto);
          JOptionPane.showMessageDialog(this, resp);
            clearForm();
              loadTable();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(this, "Error at save data");
        }}
private void clearForm(){
      textCode.setText("");
        textDesc.setText("");
        textPack.setText("");
        textQoh.setText("");
        textUnitPrice.setText("");
}


 private void loadTable() {
        try {
            String columns[]  ={"Item Id", "Item Description", "Pack Size", "Unit Price", "QoH"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            tblItem.setModel(dtm);

            ArrayList<Itemdto> itemDtos = itemController.getAllItem();
            for(Itemdto dto : itemDtos){
                Object[] rowDate = {dto.getCode(), dto.getDescription(), dto.getPackSize(), dto.getUnitPrice(), dto.getQoh()};
                dtm.addRow(rowDate);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at Loading Data to Item Table");
        }
    }
 private void searchItem() {
        try {
            String itemId = tblItem.getValueAt(tblItem.getSelectedRow(), 0).toString();
            Itemdto dto = itemController.searchItem(itemId);

            if (dto != null) {
                textCode.setText(dto.getCode());
                textDesc.setText(dto.getDescription());
                textPack.setText(dto.getPackSize());
                textUnitPrice.setText(Double.toString(dto.getUnitPrice()));
                textQoh.setText(Integer.toString(dto.getQoh()));
            } else {
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at loading Item");
        }
    }
  private void deleteItem(){
        try {
            String itemCode = textCode.getText();
            String resp = itemController.deleteItem(itemCode);
            JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at Delete Item");
        }
    }

    private void updateItem() {
        try {
            Itemdto itemDto = new Itemdto(textCode.getText() ,textDesc.getText(), textPack.getText(), Double.parseDouble(textUnitPrice.getText()), Integer.parseInt(textQoh.getText()));
            String resp = itemController.updateItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at update Item");
        }
    }}
    

    

