/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.BorderLayout;
import java.awt.Color;
import Magic.Design.MyJLabel;
import Magic.Design.MyTableFormat;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 *
 * @author satwik
 */
public class StatisticsJPanel extends javax.swing.JPanel {

    EcoSystem system;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    /**
     * Creates new form StatisticsJPanel
     */
    public StatisticsJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.system = system;       
        
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
        imgPie = new javax.swing.JLabel();
        lblPieChart = new javax.swing.JLabel();
        imgBar = new javax.swing.JLabel();
        lblBarChart = new javax.swing.JLabel();
        imgLine = new javax.swing.JLabel();
        lblLineChart = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setMinimumSize(new java.awt.Dimension(1150, 720));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 86));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        imgPie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pieChartR.png"))); // NOI18N
        imgPie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgPie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPieMouseClicked(evt);
            }
        });
        jPanel1.add(imgPie);

        lblPieChart.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblPieChart.setForeground(new java.awt.Color(255, 255, 255));
        lblPieChart.setText("PIE CHART");
        lblPieChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPieChartMouseClicked(evt);
            }
        });
        jPanel1.add(lblPieChart);

        imgBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barGraphR.png"))); // NOI18N
        imgBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgBarMouseEntered(evt);
            }
        });
        jPanel1.add(imgBar);

        lblBarChart.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblBarChart.setForeground(new java.awt.Color(255, 255, 255));
        lblBarChart.setText("BAR CHART");
        lblBarChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBarChartMouseClicked(evt);
            }
        });
        jPanel1.add(lblBarChart);

        imgLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line-chart.png"))); // NOI18N
        imgLine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgLineMouseEntered(evt);
            }
        });
        jPanel1.add(imgLine);

        lblLineChart.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblLineChart.setForeground(new java.awt.Color(255, 255, 255));
        lblLineChart.setText("LINE CHART");
        lblLineChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLineChartMouseClicked(evt);
            }
        });
        jPanel1.add(lblLineChart);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1390, 80));

        jPanel4.setBackground(new java.awt.Color(31, 31, 31));
        jPanel4.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Statistics");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void imgPieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPieMouseClicked
        // TODO add your handling code here:
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        pieDataset.setValue("Liver Donor", system.getDonorDirectory().getDonorList().size());
        pieDataset.setValue("Cirrhosis Patient(Receiver)", system.getPatientDirectory().getPatientList().size());
        
        JFreeChart piechart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
        PiePlot piechrt = (PiePlot)piechart.getPlot();
        
        ChartFrame chrtframe = new ChartFrame("Pie Chart", piechart);
        chrtframe.setVisible(true);
        chrtframe.setSize(1200,850);
        chrtframe.setBackground(Color.WHITE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        chrtframe.setLocation(dim.width/2-this.getSize().width/2, dim.height/2- this.getSize().height/2);
    }//GEN-LAST:event_imgPieMouseClicked

    private void imgLineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLineMouseEntered
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_imgLineMouseEntered

    private void imgLineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLineMouseClicked
        // TODO add your handling code here:
        DefaultCategoryDataset linechartdata = new DefaultCategoryDataset();
//        linechartdata.setValue(10, "No. Of Work Request","Day1");
//        linechartdata.setValue(20, "No. Of Work Request","Day2");
//        linechartdata.setValue(7, "No. Of Work Request","Day3");
        linechartdata.setValue(system.getDonorDirectory().getDonorList().size(),"Patients/Donors","Liver Donor");
        linechartdata.setValue(system.getPatientDirectory().getPatientList().size(),"Patients/Donors","Cirrhosis Patient(Receiver)");
        
        JFreeChart linechart = ChartFactory.createLineChart3D("Requests", "Patients/Donors", "Patients/Donors", linechartdata, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot linechrt = linechart.getCategoryPlot();
        linechrt.setRangeGridlinePaint(Color.ORANGE);
        ChartFrame chrtframe = new ChartFrame("Contribution", linechart, true);
        chrtframe.setVisible(true);
        chrtframe.setSize(1200,850);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        chrtframe.setLocation(dim.width/2-this.getSize().width/2, dim.height/2- this.getSize().height/2);
        
        
    }//GEN-LAST:event_imgLineMouseClicked

    private void imgBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBarMouseClicked
        // TODO add your handling code here:
        DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();
//        barchartdata.setValue(10, "No. Of Work Request","Day1");
//        barchartdata.setValue(20, "No. Of Work Request","Day2");
//        barchartdata.setValue(7, "No. Of Work Request","Day3");
        barchartdata.setValue(system.getDonorDirectory().getDonorList().size(),"Patients/Donors","Liver Donor");
        barchartdata.setValue(system.getPatientDirectory().getPatientList().size(),"Patients/Donors","Cirrhosis Patient(Receiver)");
        JFreeChart barchart = ChartFactory.createBarChart3D("Requests", "Patients/Donors", "Patients/Donors", barchartdata, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barchart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartFrame chrtframe = new ChartFrame("Contribution", barchart, true);
        chrtframe.setVisible(true);
        chrtframe.setSize(1200,850);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        chrtframe.setLocation(dim.width/2-this.getSize().width/2, dim.height/2- this.getSize().height/2);
    }//GEN-LAST:event_imgBarMouseClicked

    private void imgBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_imgBarMouseEntered

    private void lblPieChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPieChartMouseClicked
        // TODO add your handling code here:
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        pieDataset.setValue("Liver Donor", system.getDonorDirectory().getDonorList().size());
        pieDataset.setValue("Cirrhosis Patient(Receiver)", system.getPatientDirectory().getPatientList().size());
       // pieDataset.setValue("Three", new Integer(30));
       // pieDataset.setValue("Four", new Integer(40));
        JFreeChart piechart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
        PiePlot piechrt = (PiePlot)piechart.getPlot();
        //piechrt.setForegroundAlpha(TOP_ALIGNMENT);
        ChartFrame chrtframe = new ChartFrame("Pie Chart", piechart);
        chrtframe.setVisible(true);
        chrtframe.setSize(1200,850);
        chrtframe.setBackground(Color.WHITE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        chrtframe.setLocation(dim.width/2-this.getSize().width/2, dim.height/2- this.getSize().height/2);
    }//GEN-LAST:event_lblPieChartMouseClicked

    private void lblBarChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarChartMouseClicked
        // TODO add your handling code here:
        DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();
//        barchartdata.setValue(10, "No. Of Work Request","Day1");
//        barchartdata.setValue(20, "No. Of Work Request","Day2");
//        barchartdata.setValue(7, "No. Of Work Request","Day3");
        barchartdata.setValue(system.getDonorDirectory().getDonorList().size(),"Patients/Donors","Liver Donor");
        barchartdata.setValue(system.getPatientDirectory().getPatientList().size(),"Patients/Donors","Cirrhosis Patient(Receiver)");
        JFreeChart barchart = ChartFactory.createBarChart3D("Requests", "Patients/Donors", "Patients/Donors", barchartdata, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barchart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartFrame chrtframe = new ChartFrame("Contribution", barchart, true);
        chrtframe.setVisible(true);
        chrtframe.setSize(1200,850);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        chrtframe.setLocation(dim.width/2-this.getSize().width/2, dim.height/2- this.getSize().height/2);
    }//GEN-LAST:event_lblBarChartMouseClicked

    private void lblLineChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLineChartMouseClicked
        // TODO add your handling code here:
        DefaultCategoryDataset linechartdata = new DefaultCategoryDataset();
//        linechartdata.setValue(10, "No. Of Work Request","Day1");
//        linechartdata.setValue(20, "No. Of Work Request","Day2");
//        linechartdata.setValue(7, "No. Of Work Request","Day3");
        linechartdata.setValue(system.getDonorDirectory().getDonorList().size(),"Patients/Donors","Liver Donor");
        linechartdata.setValue(system.getPatientDirectory().getPatientList().size(),"Patients/Donors","Cirrhosis Patient(Receiver)");
        
        JFreeChart linechart = ChartFactory.createLineChart3D("Requests", "Patients/Donors", "Patients/Donors", linechartdata, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot linechrt = linechart.getCategoryPlot();
        linechrt.setRangeGridlinePaint(Color.ORANGE);
        ChartFrame chrtframe = new ChartFrame("Contribution", linechart, true);
        chrtframe.setVisible(true);
        chrtframe.setSize(1200,850);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        chrtframe.setLocation(dim.width/2-this.getSize().width/2, dim.height/2- this.getSize().height/2);
    }//GEN-LAST:event_lblLineChartMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgBar;
    private javax.swing.JLabel imgLine;
    private javax.swing.JLabel imgPie;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBarChart;
    private javax.swing.JLabel lblLineChart;
    private javax.swing.JLabel lblPieChart;
    // End of variables declaration//GEN-END:variables
}
