/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Application.Controller.Simulation;
import Application.Controller.Time;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Proprietaire
 */
public class StartSimulation extends javax.swing.JFrame {
    private Simulation controller;
    /**
     * Creates new form StartSimulation
     */
    public StartSimulation(Simulation _controller) {
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
        lblDays = new javax.swing.JLabel();
        lblStartTime = new javax.swing.JLabel();
        lblEndTime = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        txtEndTime = new javax.swing.JTextField();
        txtDays = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Nouvelle simulation");
        lblTitle.setName("lblTitle"); // NOI18N

        lblStartTime.setText("Temps de départ de la simulation:");
        lblStartTime.setName("lblStartTime"); // NOI18N

        lblEndTime.setText("Temps de fin de la simulation:");
        lblEndTime.setName("lblEndTime"); // NOI18N

        txtStartTime.setText("05:00");
        txtStartTime.setName("txtStartTime"); // NOI18N

        txtEndTime.setText("01:00");
        txtEndTime.setName("txtEndTime"); // NOI18N

        btnOk.setText("Confirmer");
        btnOk.setName("btnOk"); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnOkActionPerformed(evt);
            }
        });
        
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCancelActionPerformed(evt);
            }
        });
        
        btnCancel.setText("Annuler");
        btnCancel.setName("btnCancel"); // NOI18N
        
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

        lblDays.setText("Nombre de jours à simuler :");
        txtDays.addKeyListener(new KeyAdapter() {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartTime)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnOk))
                            .addComponent(lblDays)
                            .addComponent(lblEndTime))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDays, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEndTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                .addComponent(txtStartTime, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartTime)
                    .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDays)
                    .addComponent(txtDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }
    
    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) 
    {   
        if(txtEndTime.getText().isEmpty() || txtStartTime.getText().isEmpty() || txtDays.getText().isEmpty() || !validateTimeFormat())
        {
            JOptionPane.showMessageDialog(this, "Assurez-vous d'avoir rempli tous les champs dans le bon format \navant la création ou la modification du générateur de véhicule.");
        }else{
            String strTimeStart = txtStartTime.getText();
            String strHourTimeStart = strTimeStart.substring(0, strTimeStart.indexOf(':'));
            String strMinuteTimeStart = strTimeStart.substring(strTimeStart.indexOf(':') + 1, strTimeStart.length());
            double hourTimeStart = Float.parseFloat(strHourTimeStart);
            double minuteTimeStart = Float.parseFloat(strMinuteTimeStart);
            Time timeStart = new Time(0, hourTimeStart, minuteTimeStart, 0);
            Time currentTime = new Time(0, hourTimeStart, minuteTimeStart, 0);
            String strTimeEnd = txtEndTime.getText();
            String strHourTimeEnd = strTimeEnd.substring(0, strTimeEnd.indexOf(':'));
            String strMinuteTimeEnd = strTimeEnd.substring(strTimeEnd.indexOf(':') + 1, strTimeEnd.length());
            double hourTimeEnd = Float.parseFloat(strHourTimeEnd);
            double minuteTimeEnd = Float.parseFloat(strMinuteTimeEnd);
            Time timeEnd = null;
            double days = Float.parseFloat(txtDays.getText());
            if(days > 1){
                timeEnd = new Time(days, hourTimeEnd, minuteTimeEnd, 0);
            }else{
                if(hourTimeEnd <= hourTimeStart)
                {
                    timeEnd = new Time(1, hourTimeEnd, minuteTimeEnd, 0);
                }else{
                    timeEnd = new Time(0, hourTimeEnd, minuteTimeEnd, 0);
                }
            }
            controller.setStartTime(timeStart);
            controller.setCurrentTime(currentTime);
            controller.setEndTime(timeEnd);
            controller.setIsSimulationStarted(true);
            for(int i = 0; i < controller.getListVehicule().size(); i++)
            {
                if(controller.getListVehicule().get(i).getCurrentPosition().getTimeSegmentStart().getTime() == new Time().getTime())
                {
                    controller.getListVehicule().get(i).getCurrentPosition().setTimeStartSegment(new Time(0, timeStart.getHour(), timeStart.getMinute(), timeStart.getSecond()));
                }
            }
            dispose();
        }     
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) 
    {   
        dispose();
    }
    
    private boolean validateTimeFormat()
    { 
        String timePattern = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        Pattern pattern = Pattern.compile(timePattern);
        Matcher matcherStartTime = pattern.matcher(txtStartTime.getText());
        Matcher matcherEndTime = pattern.matcher(txtEndTime.getText());
        
        return matcherStartTime.matches() && matcherEndTime.matches();
    }
    
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblStartTime;
    private javax.swing.JLabel lblEndTime;
    private javax.swing.JTextField txtStartTime;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JLabel lblDays;
    private javax.swing.JTextField txtDays;
}
