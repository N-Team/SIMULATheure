

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raphael
 */
public class mainFrame extends javax.swing.JFrame {

    
    double scaleFactor = 1.0;
    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        btnAdd.setVisible(false);
        lstToolItems.setVisible(false);
        scrollPaneTool.setVisible(false);
        pnlBackground.addMouseMotionListener(new java.awt.event.MouseAdapter() {
        @Override //I override only one method for presentation
        public void mouseMoved(java.awt.event.MouseEvent e) {
                lblCoordinate.setText("Coordonnées: Latitude " + e.getX() + " Longitude " + e.getY());
            }
        });
        pnlBackground.addMouseWheelListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseWheelMoved(java.awt.event.MouseWheelEvent e){
                int rotation = e.getWheelRotation();

                scaleFactor = scaleFactor + rotation / 10.0;
                if (scaleFactor < 0.5) {
                    scaleFactor = 0.5;
                } else if (scaleFactor > 3.0) {
                    scaleFactor = 3.0;
                }
                System.out.println(rotation);
                System.out.println(scaleFactor);
            }
        });
        pnlBackground.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e){
                System.out.println(e.getX());
                System.out.println(e.getY());
                if ("Arrêt".equals(lblToolName.getText())){
                drawCircle(e.getX(), e.getY());
                }
            }
        
        });
    }
    
     public void drawCircle(int x, int y) {
        java.awt.Graphics g = this.getGraphics();
        java.awt.Graphics2D g2d = (java.awt.Graphics2D)g;
        g2d.setColor(java.awt.Color.BLACK);
        g2d.fillOval(x + pnlBackground.getX(), y + pnlBackground.getY() + 50, 8, 8);
    }
     



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tlbTools = new javax.swing.JToolBar();
        btnStop = new javax.swing.JButton();
        btnSegment = new javax.swing.JButton();
        btnTrip = new javax.swing.JButton();
        btnVehicule = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        btnClientGenerator = new javax.swing.JButton();
        btnVehiculeGenerator = new javax.swing.JButton();
        btnClientProfile = new javax.swing.JButton();
        lblCoordinate = new javax.swing.JLabel();
        tlbSpeed = new javax.swing.JToolBar();
        btnRestart = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnAccelerate = new javax.swing.JButton();
        btnStopSimu = new javax.swing.JButton();
        pnlBackground = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        pnlTool = new javax.swing.JPanel();
        lblToolName = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        scrollPaneTool = new javax.swing.JScrollPane();
        lstToolItems = new javax.swing.JList();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemNew = new javax.swing.JMenuItem();
        menuItemOpen = new javax.swing.JMenuItem();
        menuItemSave = new javax.swing.JMenuItem();
        menuItemSaveAs = new javax.swing.JMenuItem();
        menuItemQuit = new javax.swing.JMenuItem();
        menuItemImg = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuItemCancel = new javax.swing.JMenuItem();
        menuItemRedo = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuItemHelp = new javax.swing.JMenuItem();
        menuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SimulatHEURE");
        setFont(new java.awt.Font("Chaparral Pro", 0, 10)); // NOI18N
        setForeground(java.awt.Color.darkGray);

        tlbTools.setBackground(new java.awt.Color(102, 102, 255));
        tlbTools.setOrientation(javax.swing.SwingConstants.VERTICAL);
        tlbTools.setRollover(true);

        btnStop.setText("Arrêt");
        btnStop.setFocusable(false);
        btnStop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        tlbTools.add(btnStop);

        btnSegment.setText("Segment");
        btnSegment.setFocusable(false);
        btnSegment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSegment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSegment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegmentActionPerformed(evt);
            }
        });
        tlbTools.add(btnSegment);

        btnTrip.setText("Trajet");
        btnTrip.setFocusable(false);
        btnTrip.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrip.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripActionPerformed(evt);
            }
        });
        tlbTools.add(btnTrip);

        btnVehicule.setText("Véhicule");
        btnVehicule.setFocusable(false);
        btnVehicule.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVehicule.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculeActionPerformed(evt);
            }
        });
        tlbTools.add(btnVehicule);

        btnClient.setText("Client");
        btnClient.setFocusable(false);
        btnClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClient.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });
        tlbTools.add(btnClient);

        btnClientGenerator.setText("Générateur de clients");
        btnClientGenerator.setFocusable(false);
        btnClientGenerator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientGenerator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientGenerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientGeneratorActionPerformed(evt);
            }
        });
        tlbTools.add(btnClientGenerator);

        btnVehiculeGenerator.setText("Générateur de véhicules");
        btnVehiculeGenerator.setFocusable(false);
        btnVehiculeGenerator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVehiculeGenerator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVehiculeGenerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculeGeneratorActionPerformed(evt);
            }
        });
        tlbTools.add(btnVehiculeGenerator);

        btnClientProfile.setText("Profil client");
        btnClientProfile.setFocusable(false);
        btnClientProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientProfile.setPreferredSize(new java.awt.Dimension(59, 59));
        btnClientProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientProfileActionPerformed(evt);
            }
        });
        tlbTools.add(btnClientProfile);

        lblCoordinate.setText("Coordonnées: Latitdue X Longitude Y");

        tlbSpeed.setRollover(true);
        tlbSpeed.setPreferredSize(new java.awt.Dimension(100, 23));

        btnRestart.setText("Recommencer");
        btnRestart.setFocusable(false);
        btnRestart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbSpeed.add(btnRestart);

        btnStart.setText("Démarrer");
        btnStart.setFocusable(false);
        btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbSpeed.add(btnStart);

        btnPause.setText("Pause");
        btnPause.setFocusable(false);
        btnPause.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPause.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbSpeed.add(btnPause);

        btnAccelerate.setText("Avancer");
        btnAccelerate.setFocusable(false);
        btnAccelerate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccelerate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbSpeed.add(btnAccelerate);

        btnStopSimu.setText("Arrêter");
        btnStopSimu.setFocusable(false);
        btnStopSimu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStopSimu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbSpeed.add(btnStopSimu);

        pnlBackground.setLayout(null);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/image/IronMan.jpg"))); // NOI18N
        pnlBackground.add(lblImage);
        lblImage.setBounds(0, 0, 900, 600);

        pnlTool.setBackground(new java.awt.Color(102, 102, 102));
        pnlTool.setMaximumSize(new java.awt.Dimension(275, 150));
        pnlTool.setMinimumSize(new java.awt.Dimension(275, 150));
        pnlTool.setName(""); // NOI18N
        pnlTool.setPreferredSize(new java.awt.Dimension(275, 150));
        pnlTool.setRequestFocusEnabled(false);

        lblToolName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAdd.setText("Ajouter");

        scrollPaneTool.setViewportView(lstToolItems);

        javax.swing.GroupLayout pnlToolLayout = new javax.swing.GroupLayout(pnlTool);
        pnlTool.setLayout(pnlToolLayout);
        pnlToolLayout.setHorizontalGroup(
            pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToolLayout.createSequentialGroup()
                        .addComponent(lblToolName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToolLayout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(99, 99, 99))))
            .addComponent(scrollPaneTool, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlToolLayout.setVerticalGroup(
            pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblToolName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPaneTool, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuFile.setText("Fichier");
        menuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileActionPerformed(evt);
            }
        });

        menuItemNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItemNew.setText("Nouveau");
        menuFile.add(menuItemNew);

        menuItemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItemOpen.setText("Ouvrir");
        menuFile.add(menuItemOpen);

        menuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSave.setText("Sauvegarder");
        menuFile.add(menuItemSave);

        menuItemSaveAs.setText("Sauvegarder en tant que");
        menuFile.add(menuItemSaveAs);

        menuItemQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        menuItemQuit.setText("Quitter");
        menuItemQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQuitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemQuit);

        menuItemImg.setText("Importer une image");
        menuItemImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemImgActionPerformed(evt);
            }
        });
        menuFile.add(menuItemImg);

        menuBar.add(menuFile);

        menuEdit.setText("Édition");

        menuItemCancel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCancel.setText("Annuler");
        menuEdit.add(menuItemCancel);

        menuItemRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        menuItemRedo.setText("Refaire");
        menuItemRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRedoActionPerformed(evt);
            }
        });
        menuEdit.add(menuItemRedo);

        menuBar.add(menuEdit);

        menuHelp.setText("?");

        menuItemHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItemHelp.setText("Aide");
        menuItemHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHelpActionPerformed(evt);
            }
        });
        menuHelp.add(menuItemHelp);

        menuItemAbout.setText("À propos");
        menuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuItemAbout);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlbTools, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                        .addComponent(tlbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(537, 537, 537))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(lblCoordinate)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tlbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTool, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                        .addGap(60, 60, 60)))
                .addComponent(lblCoordinate))
            .addComponent(tlbTools, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        lblToolName.setText("Arrêt");
        lblToolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setVisible(true);
        lstToolItems.setVisible(true);
        scrollPaneTool.setVisible(true);
    }//GEN-LAST:event_btnStopActionPerformed

    private void menuItemRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRedoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemRedoActionPerformed

    private void menuItemQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuItemQuitActionPerformed

    private void menuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAboutActionPerformed
        About aboutFrame = new About();
        aboutFrame.setVisible(true);
    }//GEN-LAST:event_menuItemAboutActionPerformed

    private void menuItemHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHelpActionPerformed
        Help helpFrame = new Help();
        helpFrame.setVisible(true);
    }//GEN-LAST:event_menuItemHelpActionPerformed

    private void btnClientProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientProfileActionPerformed
        lblToolName.setText("Profil client");
        lblToolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setVisible(true);
        scrollPaneTool.setVisible(true);
    }//GEN-LAST:event_btnClientProfileActionPerformed

    private void btnSegmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegmentActionPerformed
        lblToolName.setText("Segment");
        lblToolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setVisible(true);
        lstToolItems.setVisible(true);
        scrollPaneTool.setVisible(true);
    }//GEN-LAST:event_btnSegmentActionPerformed

    private void btnTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripActionPerformed
        lblToolName.setText("Trajet");
        lblToolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setVisible(true);
        lstToolItems.setVisible(true);
        scrollPaneTool.setVisible(true);
    }//GEN-LAST:event_btnTripActionPerformed

    private void btnVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculeActionPerformed
        lblToolName.setText("Véhicule");
        lblToolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setVisible(true);
        lstToolItems.setVisible(true);
        scrollPaneTool.setVisible(true);
    }//GEN-LAST:event_btnVehiculeActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        lblToolName.setText("Client");
        lblToolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setVisible(true);
        lstToolItems.setVisible(true);
        scrollPaneTool.setVisible(true);
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnClientGeneratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientGeneratorActionPerformed
        lblToolName.setText("Générateur de clients");
        lblToolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setVisible(true);
        lstToolItems.setVisible(true);
        scrollPaneTool.setVisible(true);
    }//GEN-LAST:event_btnClientGeneratorActionPerformed

    private void btnVehiculeGeneratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculeGeneratorActionPerformed
        lblToolName.setText("Générateur de véhicules");
        lblToolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setVisible(true);
        lstToolItems.setVisible(true);
        scrollPaneTool.setVisible(true);
    }//GEN-LAST:event_btnVehiculeGeneratorActionPerformed

    private void menuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFileActionPerformed

    private void menuItemImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemImgActionPerformed
        // TODO add your handling code here:
        javax.swing.JFileChooser jfc;
        jfc = new javax.swing.JFileChooser();     
        //java.io.File f = new java.io.File(System.getProperty("user.dir"));
        //jfc.setCurrentDirectory(f);
        //jfc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        int result = jfc.showOpenDialog(this);
        //java.io.File selFile = jfc.getSelectedFile();
        if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
                java.io.File file = jfc.getSelectedFile();
                 try {
                lblImage.setIcon(new javax.swing.ImageIcon(javax.imageio.ImageIO.read(file)));
                 } catch (java.io.IOException e) {
                     e.printStackTrace();
                 }
                pnlBackground.revalidate();
                pnlBackground.repaint();
            }
    }//GEN-LAST:event_menuItemImgActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccelerate;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnClientGenerator;
    private javax.swing.JButton btnClientProfile;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnSegment;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnStopSimu;
    private javax.swing.JButton btnTrip;
    private javax.swing.JButton btnVehicule;
    private javax.swing.JButton btnVehiculeGenerator;
    private javax.swing.JLabel lblCoordinate;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblToolName;
    private javax.swing.JList lstToolItems;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuItemAbout;
    private javax.swing.JMenuItem menuItemCancel;
    private javax.swing.JMenuItem menuItemHelp;
    private javax.swing.JMenuItem menuItemImg;
    private javax.swing.JMenuItem menuItemNew;
    private javax.swing.JMenuItem menuItemOpen;
    private javax.swing.JMenuItem menuItemQuit;
    private javax.swing.JMenuItem menuItemRedo;
    private javax.swing.JMenuItem menuItemSave;
    private javax.swing.JMenuItem menuItemSaveAs;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlTool;
    private javax.swing.JScrollPane scrollPaneTool;
    private javax.swing.JToolBar tlbSpeed;
    private javax.swing.JToolBar tlbTools;
    // End of variables declaration//GEN-END:variables
}
