/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.DefaultListModel;
import Domain.Simulation.Simulation;
import Domain.Trips.Trip;
import javax.swing.JOptionPane;

/**
 *
 * @author Élise
 */
public class ModifyTrip extends javax.swing.JFrame {
    private Simulation controller;
    private Trip trip;
    /**
     * Creates new form ModifyTrip
     * @param _controller
     */
    public ModifyTrip(Simulation _controller) 
    {
        this.controller = _controller;
        trip = null;
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }
    public ModifyTrip(Simulation _controller, Trip _trip) 
    {
        this.controller = _controller;
        this.trip = _trip;
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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCircular = new javax.swing.JLabel();
        chbCircular = new javax.swing.JCheckBox();
        txtSegment = new javax.swing.JLabel();
        scrollPaneSegment = new javax.swing.JScrollPane();
        lstSegmentTrip = new javax.swing.JList();
        lblNbMaxVehicule = new javax.swing.JLabel();
        txtNbMaxVehicule = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        if(this.trip == null){
            btnDelete.setVisible(false);
        }
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAllSegment = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        btnAddSegmentToTrip = new javax.swing.JButton();
        btnRemoveSegmentFromTrip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Ajouter, modifier ou supprimer un trajet");

        lblName.setText("Nom: ");

        txtName.setText("Trajet1");

        txtCircular.setText("Circulaire: ");

        txtSegment.setText("Segments du trajet: ");

        lstSegmentTrip.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPaneSegment.setViewportView(lstSegmentTrip);

        lblNbMaxVehicule.setText("Nombre maximal de véhicules: ");

        btnOk.setText("Ok");

        btnDelete.setText("Supprimer");

        lstAllSegment.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstAllSegment);
        lstAllSegment.getAccessibleContext().setAccessibleParent(scrollPaneSegment);

        jLabel1.setText("Tous les segments:");

        btnAddSegmentToTrip.setText("<<");
        btnAddSegmentToTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSegmentToTripActionPerformed(evt);
            }
        });

        btnRemoveSegmentFromTrip.setText(">>");
        btnRemoveSegmentFromTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSegmentFromTripActionPerformed(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCircular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbCircular))
                            .addComponent(lblTitle))
                        .addGap(0, 162, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNbMaxVehicule)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNbMaxVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnOk))
                                    .addComponent(scrollPaneSegment, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSegment)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRemoveSegmentFromTrip)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAddSegmentToTrip)
                                    .addGap(117, 117, 117)
                                    .addComponent(jLabel1))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCircular)
                    .addComponent(chbCircular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSegment)
                    .addComponent(jLabel1)
                    .addComponent(btnAddSegmentToTrip)
                    .addComponent(btnRemoveSegmentFromTrip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scrollPaneSegment, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNbMaxVehicule)
                    .addComponent(txtNbMaxVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnDelete))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        
        listAllSegmentModel = new DefaultListModel();
        for(int i = 0; i < this.controller.getListSegment().size(); i++)
        {
            listAllSegmentModel.addElement(this.controller.getListSegment().get(i).getOriginNode().getName() + " | " + this.controller.getListSegment().get(i).getDestinationNode().getName());
        }
        lstAllSegment.setModel(listAllSegmentModel);
        if(this.trip != null)
        {
            listSegmentTripModel = new DefaultListModel();
            for(int i = 0; i < this.trip.getAllSegments().size(); i++)
            {
                listSegmentTripModel.addElement(this.trip.getAllSegments().get(i).getOriginNode().getName() + " | " + this.trip.getAllSegments().get(i).getDestinationNode().getName());
            }
            lstSegmentTrip.setModel(listSegmentTripModel);
        }
        pack();
    }
   
    private void btnAddSegmentToTripActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedValue = lstAllSegment.getSelectedValue().toString();
        String originName = selectedValue.substring(0, selectedValue.indexOf('|') - 1);
        boolean isValidTrip = false;
        
        if(lstSegmentTrip.getModel().getSize() > 0)
        {
            String lastSegmentFromTrip = lstSegmentTrip.getModel().getElementAt(lstSegmentTrip.getModel().getSize() -1).toString();
            String lastDestinationName = lastSegmentFromTrip.substring(lastSegmentFromTrip.indexOf('|') + 2, lastSegmentFromTrip.length());
                       
            if(lastDestinationName.equalsIgnoreCase(originName))
            {
                isValidTrip = true;
            }
        }else{
            isValidTrip = true;
        }
        if(isValidTrip)
        {
            listSegmentTripModel.addElement(selectedValue);
            lstSegmentTrip.setModel(listSegmentTripModel);
        }else
        {
            JOptionPane.showMessageDialog(this, "Assurez-vous d'ajouter un segment qui continue\n le circuit à partir du dernier arrêt courant.");
        }
        
        
    }
    private void btnRemoveSegmentFromTripActionPerformed(java.awt.event.ActionEvent evt) 
    {
        if(lstSegmentTrip.getModel().getSize() > 0)
        {
            listSegmentTripModel.remove(listSegmentTripModel.size() - 1);
            lstSegmentTrip.setModel(listSegmentTripModel);
        }
    }
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt)
    {
        
    }

    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox chbCircular;
    private javax.swing.JButton btnAddSegmentToTrip;
    private javax.swing.JButton btnRemoveSegmentFromTrip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList lstAllSegment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNbMaxVehicule;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList lstSegmentTrip;
    private javax.swing.JScrollPane scrollPaneSegment;
    private javax.swing.JLabel txtCircular;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNbMaxVehicule;
    private javax.swing.JLabel txtSegment;
    private DefaultListModel listAllSegmentModel = new DefaultListModel(); 
    private DefaultListModel listSegmentTripModel = new DefaultListModel(); 

    
}
