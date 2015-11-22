/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Domain.Node.Node;
import Application.Controller.Simulation;
import Application.Controller.Time;
import Domain.Trips.Segment;
import Domain.Trips.Trip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author Élise
 */
public class VehiculeGenerator extends javax.swing.JFrame 
{
    private Simulation controller;
    private Domain.Generation.VehiculeGenerator generator;

    /**
     * Creates new form VehciuleGenerator
     */
    public VehiculeGenerator(Simulation _controller, Domain.Generation.VehiculeGenerator _generator) 
    {
        this.controller = _controller;
        this.generator = _generator;
        
        initComponents();
 
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }
    
    public VehiculeGenerator(Simulation _controller) 
    {
        this.controller = _controller;
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

        lblTitle = new javax.swing.JLabel();
        lblTrip = new javax.swing.JLabel();
        cmbTrip = new javax.swing.JComboBox();
        lblOriginStop = new javax.swing.JLabel();
        cmbOriginStop = new javax.swing.JComboBox();
        lblMinTime = new javax.swing.JLabel();
        lblMaxTime = new javax.swing.JLabel();
        lblModeTime = new javax.swing.JLabel();
        lblStartTime = new javax.swing.JLabel();
        lblEndTime = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtMinTime = new javax.swing.JTextField();
        txtMaxTime = new javax.swing.JTextField();
        txtModeTime = new javax.swing.JTextField();
        txtStartTime = new javax.swing.JTextField();
        txtEndTime = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Générer des véhicules");

        lblTrip.setText("Trajet: ");

        lblOriginStop.setText("Arrêt de départ: ");

        lblMinTime.setText("Temps minimal: ");

        lblMaxTime.setText("Temps maximal: ");

        lblModeTime.setText("Temps mode:");

        lblStartTime.setText("Heure début: ");

        lblEndTime.setText("Heure fin: ");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnDelete.setText("Supprimer");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        
        txtEndTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || c == ':')) {
                getToolkit().beep();
                e.consume();
              }
            }
          });
        txtStartTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || c == ':')) {
                getToolkit().beep();
                e.consume();
              }
            }
          });
        
        txtMaxTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
              }
            }
          });
        txtMinTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
              }
            }
          });
        txtModeTime.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
              }
            }
          });

        lblName.setText("Nom:");
        
        this.cmbTrip.removeAllItems();
        this.cmbOriginStop.removeAllItems();
        
        if(generator == null)
        {
            for(int i = 0; i < controller.getListTrip().size(); i++)
            {
                this.cmbTrip.addItem(controller.getListTrip().get(i).getName());
            }       

            for(int i = 0; i < controller.getListTrip().size(); i++)
            {
                if (cmbTrip.getSelectedItem().toString().equalsIgnoreCase(controller.getListTrip().get(i).getName()))
                {
                    for (int j = 0; j < controller.getListTrip().get(i).getAllSegments().size(); j++)
                    {
                        this.cmbOriginStop.addItem(controller.getListTrip().get(i).getAllSegments().get(j).getOriginNode().getName());
                    }
                }
            }
        }else{
            this.txtName.setText(generator.getName());
            for(int i = 0; i < controller.getListTrip().size(); i++)
            {
                this.cmbTrip.addItem(controller.getListTrip().get(i).getName());
            }
            this.cmbTrip.setSelectedItem(generator.getTrip().getName());       

            for(int i = 0; i < controller.getListTrip().size(); i++)
            {
                if (cmbTrip.getSelectedItem().toString().equalsIgnoreCase(controller.getListTrip().get(i).getName()))
                {
                    for (int j = 0; j < controller.getListTrip().get(i).getAllSegments().size(); j++)
                    {
                        this.cmbOriginStop.addItem(controller.getListTrip().get(i).getAllSegments().get(j).getOriginNode().getName());
                    }
                }
            }            
            this.cmbOriginStop.setSelectedItem(generator.getSpawnSegment().getOriginNode().getName());
        }
        if (generator != null)
        {
            this.txtMinTime.setText(String.valueOf(generator.getDistribution().getMinimum()));
            this.txtMaxTime.setText(String.valueOf(generator.getDistribution().getMaximum()));
            this.txtModeTime.setText(String.valueOf(generator.getDistribution().getMode()));
        }
        else
        {
            this.txtMinTime.setText(String.valueOf(15));
            this.txtMaxTime.setText(String.valueOf(15));
            this.txtModeTime.setText(String.valueOf(15)); 
        }
        
        if (generator != null)
            this.txtStartTime.setText(String.valueOf(generator.getTimeBeginGeneration().getTimeStringNoSecond()));

        if (generator != null)
            this.txtEndTime.setText(String.valueOf(generator.getTimeEndGeneration().getTimeStringNoSecond()));
        if(generator != null)
            this.txtName.setText(generator.getName());
        if(generator == null)
            this.btnDelete.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOk)
                        .addGap(56, 56, 56)
                        .addComponent(btnDelete)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMinTime)
                                    .addComponent(lblMaxTime)
                                    .addComponent(lblModeTime)
                                    .addComponent(lblStartTime)
                                    .addComponent(lblEndTime)
                                    .addComponent(lblName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaxTime, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtModeTime)
                                    .addComponent(txtStartTime)
                                    .addComponent(txtEndTime)
                                    .addComponent(txtName)
                                    .addComponent(txtMinTime)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOriginStop)
                                    .addComponent(lblTrip))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbOriginStop, 0, 137, Short.MAX_VALUE)
                                    .addComponent(cmbTrip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrip)
                    .addComponent(cmbTrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOriginStop)
                    .addComponent(cmbOriginStop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinTime)
                    .addComponent(txtMinTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModeTime)
                    .addComponent(txtModeTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStartTime)
                    .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndTime)
                    .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnDelete))
                .addGap(22, 22, 22))
        );

        pack();
    }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if(!(txtMaxTime.getText().isEmpty()|| txtMinTime.getText().isEmpty() || txtModeTime.getText().isEmpty()
                || txtEndTime.getText().isEmpty() || txtStartTime.getText().isEmpty() || txtName.getText().isEmpty()))
        {
            if (generator == null)
            {
                double max = Float.parseFloat(txtMaxTime.getText());
                double mode = Float.parseFloat(txtModeTime.getText());
                double min = Float.parseFloat(txtMinTime.getText());
                String strTimeStart = txtStartTime.getText();
                String strHourTimeStart = strTimeStart.substring(0, strTimeStart.indexOf(':'));
                String strMinuteTimeStart = strTimeStart.substring(strTimeStart.indexOf(':') + 1, strTimeStart.length());
                double hourTimeStart = Float.parseFloat(strHourTimeStart);
                double minuteTimeStart = Float.parseFloat(strMinuteTimeStart);
                Time timeStart = new Time(hourTimeStart, minuteTimeStart, 0);
                String strTimeEnd = txtEndTime.getText();
                String strHourTimeEnd = strTimeEnd.substring(0, strTimeEnd.indexOf(':'));
                String strMinuteTimeEnd = strTimeEnd.substring(strTimeEnd.indexOf(':') + 1, strTimeEnd.length());
                double hourTimeEnd = Float.parseFloat(strHourTimeEnd);
                double minuteTimeEnd = Float.parseFloat(strMinuteTimeEnd);
                Time timeEnd = new Time(hourTimeEnd, minuteTimeEnd, 0);
                String selectedTripName = cmbTrip.getSelectedItem().toString();
                Trip trip = null;
                for(int i=0; i < controller.getListTrip().size(); i++)
                {
                    if(controller.getListTrip().get(i).getName().equalsIgnoreCase(selectedTripName))
                    {
                        trip = controller.getListTrip().get(i);
                        break;
                    }
                }
                if(trip != null)
                {
                    String selectedNodeName = cmbOriginStop.getSelectedItem().toString();
                    Segment spawnSegment = null;
                    for(int i=0; i < trip.getAllSegments().size(); i++)
                    {
                        if(trip.getAllSegments().get(i).getOriginNode().getName().equalsIgnoreCase(selectedNodeName))
                        {
                            spawnSegment = trip.getAllSegments().get(i);
                            break;
                        }
                    }
                    

                    controller.addVehiculeGenerator(spawnSegment, trip, min , max, mode,timeStart,timeEnd, txtName.getText());
                }else{
                    JOptionPane.showMessageDialog(this, "Une erreur est survenu, désolé de l'inconvénient.");
                }
            }
            else
            {
                Trip trip = null;
                for (int i = 0; i < controller.getListTrip().size(); i++)
                {
                    if (controller.getListTrip().get(i).getName().equalsIgnoreCase(cmbTrip.getSelectedItem().toString()))
                    {
                        trip = controller.getListTrip().get(i);
                    }
                }
                if (trip != null)
                {
                    double max = Float.parseFloat(txtMaxTime.getText());
                    double mode = Float.parseFloat(txtModeTime.getText());
                    double min = Float.parseFloat(txtMinTime.getText());
                    String strTimeStart = txtStartTime.getText();
                    String strHourTimeStart = strTimeStart.substring(0, strTimeStart.indexOf(':'));
                    String strMinuteTimeStart = strTimeStart.substring(strTimeStart.indexOf(':') + 1, strTimeStart.length());
                    double hourTimeStart = Float.parseFloat(strHourTimeStart);
                    double minuteTimeStart = Float.parseFloat(strMinuteTimeStart);
                    Time timeStart = new Time(hourTimeStart, minuteTimeStart, 0);
                    String strTimeEnd = txtEndTime.getText();
                    String strHourTimeEnd = strTimeEnd.substring(0, strTimeEnd.indexOf(':'));
                    String strMinuteTimeEnd = strTimeEnd.substring(strTimeEnd.indexOf(':') + 1, strTimeEnd.length());
                    double hourTimeEnd = Float.parseFloat(strHourTimeEnd);
                    double minuteTimeEnd = Float.parseFloat(strMinuteTimeEnd);
                    Time timeEnd = new Time(hourTimeEnd, minuteTimeEnd, 0);
                    String selectedNodeName = cmbOriginStop.getSelectedItem().toString();
                    
                    Segment spawnSegment = null;
                    for(int i=0; i < trip.getAllSegments().size(); i++)
                    {
                        if(trip.getAllSegments().get(i).getOriginNode().getName().equalsIgnoreCase(selectedNodeName))
                        {
                            spawnSegment = trip.getAllSegments().get(i);
                            break;
                        }
                    }
                    
                    controller.changeVehiculeGeneratorInfo(generator, spawnSegment, trip, min , max, mode,timeStart,timeEnd, txtName.getText());               
                }else{
                    JOptionPane.showMessageDialog(this, "Une erreur est survenu, désolé de l'inconvénient.");
                }
            }
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Assurez-vous d'avoir rempli tous les champs avant \nla création ou la modification du générateur de véhicule.");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Êtes-vous certain de vouloir supprimer ce générateur de véhicule ?","Avertissement",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            controller.deleteVehiculeGenerator(generator);
            dispose();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
 
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
            java.util.logging.Logger.getLogger(VehiculeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehiculeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehiculeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehiculeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VehiculeGenerator().setVisible(true);
            }
        });
    }
	
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox cmbOriginStop;
    private javax.swing.JComboBox cmbTrip;
    private javax.swing.JLabel lblEndTime;
    private javax.swing.JLabel lblMaxTime;
    private javax.swing.JLabel lblMinTime;
    private javax.swing.JLabel lblModeTime;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOriginStop;
    private javax.swing.JLabel lblStartTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTrip;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtMaxTime;
    private javax.swing.JTextField txtMinTime;
    private javax.swing.JTextField txtModeTime;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStartTime;

}
