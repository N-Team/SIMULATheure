/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Application.Controller.Simulation;
import Application.Controller.Time;

/**
 *
 * @author Pc
 */
public class ClientGenerator extends javax.swing.JFrame {

    public Simulation controller;
    public Domain.Generation.ClientGenerator generator;
    /**
     * Creates new form ModifyClientGenerator
     */
    public ClientGenerator(Simulation _controller, Domain.Generation.ClientGenerator _generator) {
        controller = _controller;
        generator = _generator;
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")             
    private void initComponents() {

        txtMaxTime = new javax.swing.JTextField();
        lblModeTime = new javax.swing.JLabel();
        txtModeTime = new javax.swing.JTextField();
        lblStartTime = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        lblEndTime = new javax.swing.JLabel();
        txtEndTime = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblProfile = new javax.swing.JLabel();
        cmbProfile = new javax.swing.JComboBox();
        lblMinTime = new javax.swing.JLabel();
        txtMinTime = new javax.swing.JTextField();
        lblMaxTime = new javax.swing.JLabel();
        lblModeTime1 = new javax.swing.JLabel();
        txtModeNb = new javax.swing.JTextField();
        lblMinTime1 = new javax.swing.JLabel();
        txtMinNb = new javax.swing.JTextField();
        lblMaxTime1 = new javax.swing.JLabel();
        txtMaxNb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMaxTime.setName("txtTimeMax"); // NOI18N
        
        lblModeTime.setText("Temps modal : ");
        lblModeTime.setName("lblTimeMode"); // NOI18N

        txtModeTime.setName("txtTimeMode"); // NOI18N
        
        lblStartTime.setText("Heure du début de la génération :");
        lblStartTime.setName("lblTimeBegin"); // NOI18N

        txtStartTime.setName("txtTimeBegin"); // NOI18N

        lblEndTime.setText("Heure de la fin de la génération : ");
        lblEndTime.setName("lblTimeEnd"); // NOI18N

        txtEndTime.setName("txtTimeEnd"); // NOI18N

        btnOk.setText("Confirmer");
        btnOk.setName("btnOk"); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnDelete.setText("Supprimer");
        btnDelete.setName("btnCancel"); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Générateur de client");
        jLabel1.setName("lblTitle"); // NOI18N

        lblName.setText("Nom : ");
        lblName.setName("lblName"); // NOI18N

        txtName.setName("txtName"); // NOI18N

        lblProfile.setText("Profil des clients : ");
        lblProfile.setName("lblProfile"); // NOI18N

        cmbProfile.setName("cmbProfile"); // NOI18N
        cmbProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProfileActionPerformed(evt);
            }
        });

        lblMinTime.setText("Temps minimal : ");
        lblMinTime.setName("lblTimeMin"); // NOI18N

        txtMinTime.setName("txtTimeMine"); // NOI18N
        
        lblMaxTime.setText("Temps maximal :");
        lblMaxTime.setName("lblTimeMax"); // NOI18N

        lblModeTime1.setText("Nombre modal :");
        lblModeTime1.setName("lblTimeMode"); // NOI18N

        txtModeNb.setName("txtTimeMode"); // NOI18N

        lblMinTime1.setText("Nombre minimal : ");
        lblMinTime1.setName("lblTimeMin"); // NOI18N

        txtMinNb.setName("txtTimeMine"); // NOI18N

        lblMaxTime1.setText("Nombre maximal :");
        lblMaxTime1.setName("lblTimeMax"); // NOI18N

        txtMaxNb.setName("txtTimeMax"); // NOI18N
        
        txtEndTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              checkTimePressed(e);
            }
        });
        
        txtStartTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              checkTimePressed(e);
            }
        });
        
        txtMaxTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) 
            {
              checkNumberPressed(e);
            }
        });
        
        txtMinTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) 
            {
              checkNumberPressed(e);
            }
        });
        
        txtModeTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) 
            {
              checkNumberPressed(e);
            }
        });
        
        cmbProfile.removeAllItems();
        for(int i = 0; i < controller.getListClientProfile().size(); i++)
        {
            cmbProfile.addItem(controller.getListClientProfile().get(i).getName());
        }
        
        if(generator == null)
        {
            btnDelete.setVisible(false);
            txtMinTime.setText("0");
            txtMaxTime.setText("5");
            txtModeTime.setText("1");
            txtMinNb.setText("1");
            txtMaxNb.setText("3");
            txtModeNb.setText("1");
        }
        else
        {
            txtName.setText(generator.getName());
            txtMinTime.setText(String.valueOf(generator.getGenerationTimeDistribution().getMinimum()));
            txtMaxTime.setText(String.valueOf(generator.getGenerationTimeDistribution().getMaximum()));
            txtModeTime.setText(String.valueOf(generator.getGenerationTimeDistribution().getMode()));
            txtMinNb.setText(String.valueOf(generator.getClientNumberDistribution().getMinimum()));
            txtMaxNb.setText(String.valueOf(generator.getClientNumberDistribution().getMaximum()));
            txtModeNb.setText(String.valueOf(generator.getClientNumberDistribution().getMode()));
            txtStartTime.setText(String.valueOf(generator.getTimeBeginGeneration().getTimeStringNoSecond()));
            txtEndTime.setText(String.valueOf(generator.getTimeEndGeneration().getTimeStringNoSecond()));
            
            
            cmbProfile.setSelectedItem(generator.getClientProfile().getName());
        }
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblProfile)
                            .addComponent(lblMinTime)
                            .addComponent(lblMaxTime)
                            .addComponent(lblModeTime)
                            .addComponent(lblMinTime1)
                            .addComponent(lblMaxTime1)
                            .addComponent(lblModeTime1)
                            .addComponent(lblStartTime)
                            .addComponent(lblEndTime)
                            .addComponent(btnOk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(cmbProfile, 0, 122, Short.MAX_VALUE)
                            .addComponent(txtMinTime)
                            .addComponent(txtMaxTime)
                            .addComponent(txtModeTime)
                            .addComponent(txtMinNb)
                            .addComponent(txtMaxNb)
                            .addComponent(txtModeNb)
                            .addComponent(txtStartTime)
                            .addComponent(txtEndTime)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfile)
                    .addComponent(cmbProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinTime)
                    .addComponent(txtMinTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxTime)
                    .addComponent(txtMaxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModeTime)
                    .addComponent(txtModeTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinTime1)
                    .addComponent(txtMinNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxTime1)
                    .addComponent(txtMaxNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModeTime1)
                    .addComponent(txtModeNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartTime)
                    .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndTime)
                    .addComponent(txtEndTime/*, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE*/))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if(!(txtMaxTime.getText().isEmpty()|| txtMinTime.getText().isEmpty() || txtModeTime.getText().isEmpty()
            || txtEndTime.getText().isEmpty() || txtStartTime.getText().isEmpty() || cmbProfile.getSelectedItem() == null)
        && validateTimeFormat())
        {
            if(generator != null)
            {
                double minTime = Float.parseFloat(txtMinTime.getText());
                double maxTime = Float.parseFloat(txtMaxTime.getText());
                double modeTime = Float.parseFloat(txtModeTime.getText());

                double minNb = 3;//Float.parseFloat(txtMinNb.getText());
                double maxNb = 3;//Float.parseFloat(txtMaxNb.getText());
                double modeNb = 3;//Float.parseFloat(txtModeNb.getText());

                String strTimeStart = txtStartTime.getText();
                String strHourTimeStart = strTimeStart.substring(0, strTimeStart.indexOf(':'));
                String strMinuteTimeStart = strTimeStart.substring(strTimeStart.indexOf(':') + 1, strTimeStart.length());
                double hourTimeStart = Float.parseFloat(strHourTimeStart);
                double minuteTimeStart = Float.parseFloat(strMinuteTimeStart);
                Time startTime = new Time(0, hourTimeStart, minuteTimeStart, 0);
                String strTimeEnd = txtEndTime.getText();
                String strHourTimeEnd = strTimeEnd.substring(0, strTimeEnd.indexOf(':'));
                String strMinuteTimeEnd = strTimeEnd.substring(strTimeEnd.indexOf(':') + 1, strTimeEnd.length());
                double hourTimeEnd = Float.parseFloat(strHourTimeEnd);
                double minuteTimeEnd = Float.parseFloat(strMinuteTimeEnd);
                Time endTime = null;
                if(hourTimeEnd < hourTimeStart)
                {
                    endTime = new Time(1, hourTimeEnd, minuteTimeEnd, 0);
                }
                else
                {
                    endTime = new Time(0, hourTimeEnd, minuteTimeEnd, 0);
                }

                controller.changeClientGeneratorInfo(generator, controller.getClientProfileByName(cmbProfile.getSelectedItem().toString()),
                    minTime, maxTime, modeTime,minNb, maxNb, modeNb, startTime, endTime, txtName.getText());
            }
            else
            {
                double minTime = Float.parseFloat(txtMinTime.getText());
                double maxTime = Float.parseFloat(txtMaxTime.getText());
                double modeTime = Float.parseFloat(txtModeTime.getText());

                double minNb = Float.parseFloat(txtMinNb.getText());
                double maxNb = Float.parseFloat(txtMaxNb.getText());
                double modeNb = Float.parseFloat(txtModeNb.getText());

                String strTimeStart = txtStartTime.getText();
                String strHourTimeStart = strTimeStart.substring(0, strTimeStart.indexOf(':'));
                String strMinuteTimeStart = strTimeStart.substring(strTimeStart.indexOf(':') + 1, strTimeStart.length());
                double hourTimeStart = Float.parseFloat(strHourTimeStart);
                double minuteTimeStart = Float.parseFloat(strMinuteTimeStart);
                Time startTime = new Time(0, hourTimeStart, minuteTimeStart, 0);
                String strTimeEnd = txtEndTime.getText();
                String strHourTimeEnd = strTimeEnd.substring(0, strTimeEnd.indexOf(':'));
                String strMinuteTimeEnd = strTimeEnd.substring(strTimeEnd.indexOf(':') + 1, strTimeEnd.length());
                double hourTimeEnd = Float.parseFloat(strHourTimeEnd);
                double minuteTimeEnd = Float.parseFloat(strMinuteTimeEnd);
                Time endTime = null;
                if(hourTimeEnd < hourTimeStart)
                {
                    endTime = new Time(1, hourTimeEnd, minuteTimeEnd, 0);
                }
                else
                {
                    endTime = new Time(0, hourTimeEnd, minuteTimeEnd, 0);
                }

                controller.addClientGenerator(controller.getClientProfileByName(cmbProfile.getSelectedItem().toString()),
                    minTime, maxTime, modeTime, minNb, maxNb, modeNb, startTime, endTime, txtName.getText());
            }
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Assurez-vous d'avoir rempli tous les champs dans le bon format \navant la création ou la modification du générateur de client.");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Êtes-vous certain de vouloir supprimer ce générateur de client ?","Avertissement",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            controller.deleteClientGenerator(generator);
            dispose();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProfileActionPerformed

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
            java.util.logging.Logger.getLogger(ClientGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ClientGenerator().setVisible(true);
            }
        });
    }

    private void checkNumberPressed(KeyEvent e)
    {
        char c = e.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
        {
          getToolkit().beep();
          e.consume();
        }
    }
    
    private void checkTimePressed(KeyEvent e)
    {
        char c = e.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || c == ':')) 
        {
          getToolkit().beep();
          e.consume();
        }
    }
    
    private boolean validateTimeFormat()
    { 
        String timePattern = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        Pattern pattern = Pattern.compile(timePattern);
        Matcher matcherStartTime = pattern.matcher(txtStartTime.getText());
        Matcher matcherEndTime = pattern.matcher(txtEndTime.getText());
        
        return matcherStartTime.matches() && matcherEndTime.matches();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox cmbProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEndTime;
    private javax.swing.JLabel lblMaxTime;
    private javax.swing.JLabel lblMaxTime1;
    private javax.swing.JLabel lblMinTime;
    private javax.swing.JLabel lblMinTime1;
    private javax.swing.JLabel lblModeTime;
    private javax.swing.JLabel lblModeTime1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblStartTime;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtMaxNb;
    private javax.swing.JTextField txtMaxTime;
    private javax.swing.JTextField txtMinNb;
    private javax.swing.JTextField txtMinTime;
    private javax.swing.JTextField txtModeNb;
    private javax.swing.JTextField txtModeTime;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStartTime;
    // End of variables declaration//GEN-END:variables
}
