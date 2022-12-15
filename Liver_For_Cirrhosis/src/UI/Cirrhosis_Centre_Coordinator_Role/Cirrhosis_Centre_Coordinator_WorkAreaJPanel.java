/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Cirrhosis_Centre_Coordinator_Role;

import static java.time.Clock.system;
import javax.swing.JFrame;
import Magic.Design.MyJLabel;
import Magic.Design.*;
import static javax.swing.SwingUtilities.getWindowAncestor;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Cirrhosis_Centre_Organization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.People.PatientDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;


/**
 *
 * @author satwik
 */
public class Cirrhosis_Centre_Coordinator_WorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Cirrhosis_Centre_Coordinator_WorkAreaJPanel
     * 
     */
    boolean a = true;
    private UserAccount userAccount;
    Cirrhosis_Centre_Organization cirrhosisCentreOrganization;
    Enterprise enterprise;
    EcoSystem system;
    PatientDirectory patientDirectory;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Network network;
    
    
    public Cirrhosis_Centre_Coordinator_WorkAreaJPanel(UserAccount account,Cirrhosis_Centre_Organization cirrhosisCentreOrganization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.cirrhosisCentreOrganization = cirrhosisCentreOrganization;
        this.enterprise = enterprise;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProfile = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnManageRequests = new javax.swing.JLabel();
        btnReceiveRequests = new javax.swing.JLabel();
        btnPatientStatus = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(102, 102, 102));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        btnProfile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProfile.setText("Edit Profile");
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Header.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btnManageRequests.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnManageRequests.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnManageRequests.setText("Add Patient");
        btnManageRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageRequestsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnManageRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnManageRequests, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Header.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 160, 50));

        btnReceiveRequests.setBackground(new java.awt.Color(31, 31, 31));
        btnReceiveRequests.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReceiveRequests.setForeground(new java.awt.Color(255, 255, 255));
        btnReceiveRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReceiveRequests.setText("Receiver Request");
        btnReceiveRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReceiveRequestsMouseClicked(evt);
            }
        });
        Header.add(btnReceiveRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 50));

        btnPatientStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPatientStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnPatientStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPatientStatus.setText("Check Patient Status");
        btnPatientStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPatientStatusMouseClicked(evt);
            }
        });
        Header.add(btnPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 170, 45));

        add(Header, java.awt.BorderLayout.PAGE_START);

        userProcessContainer.setBackground(new java.awt.Color(204, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseClicked
        // TODO add your handling code here:
        ManageLiverCentreCoordinatorProfile manageCirrhosisCoordinatorWorkAreaJPanel = new ManageLiverCentreCoordinatorProfile(userAccount,cirrhosisCentreOrganization,enterprise);
        userProcessContainer.add("ManageCirrhosisCentreCoordinatorProfile",manageCirrhosisCoordinatorWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnProfileMouseClicked

    private void btnManageRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageRequestsMouseClicked
        // TODO add your handling code here:
        
        CreatePatientJPanel panel = new CreatePatientJPanel(system, userAccount, network);
        userProcessContainer.add("AddPatientJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRequestsMouseClicked

    private void btnPatientStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPatientStatusMouseClicked
        // TODO add your handling code here:
        PatientStatusJPanel panel = new PatientStatusJPanel(system);
        userProcessContainer.add("PatientStatusJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnPatientStatusMouseClicked

    private void btnReceiveRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceiveRequestsMouseClicked
        // TODO add your handling code here:
        
        VolunteerReceiverRequestJPanel panel = new VolunteerReceiverRequestJPanel(system, userAccount, network);
        userProcessContainer.add("VolunteerReceiverRequestJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReceiveRequestsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel btnManageRequests;
    private javax.swing.JLabel btnPatientStatus;
    private javax.swing.JLabel btnProfile;
    private javax.swing.JLabel btnReceiveRequests;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
