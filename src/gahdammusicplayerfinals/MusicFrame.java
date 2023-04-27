
package gahdammusicplayerfinals;

import java.awt.*;
import javax.swing.*;
//import net.miginfocom.swing.MigLayout;

public class MusicFrame extends javax.swing.JFrame {
    
    Cards cards;
    public MusicFrame() {
        initComponents();
        init();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        footerPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        asidePanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        mainScrollPane = new javax.swing.JPanel();
        navBarPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GahDamBro");
        setMinimumSize(new java.awt.Dimension(900, 520));

        backgroundPanel.setBackground(new java.awt.Color(204, 204, 204));
        backgroundPanel.setLayout(new java.awt.BorderLayout());

        footerPanel.setBackground(new java.awt.Color(31, 31, 31));
        footerPanel.setPreferredSize(new java.awt.Dimension(900, 60));

        jButton1.setText("Add Cards");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jButton1)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        backgroundPanel.add(footerPanel, java.awt.BorderLayout.SOUTH);

        asidePanel.setBackground(new java.awt.Color(37, 37, 38));
        asidePanel.setMaximumSize(new java.awt.Dimension(300, 460));
        asidePanel.setMinimumSize(new java.awt.Dimension(200, 460));
        asidePanel.setPreferredSize(new java.awt.Dimension(200, 460));

        javax.swing.GroupLayout asidePanelLayout = new javax.swing.GroupLayout(asidePanel);
        asidePanel.setLayout(asidePanelLayout);
        asidePanelLayout.setHorizontalGroup(
            asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        asidePanelLayout.setVerticalGroup(
            asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        backgroundPanel.add(asidePanel, java.awt.BorderLayout.WEST);

        mainPanel.setBackground(new java.awt.Color(31, 31, 31));
        mainPanel.setPreferredSize(new java.awt.Dimension(700, 460));
        mainPanel.setLayout(new java.awt.BorderLayout());

        scrollPanel.setBackground(new java.awt.Color(31, 31, 31));
        scrollPanel.setForeground(new java.awt.Color(31, 31, 31));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setToolTipText("");
        scrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPanel.setPreferredSize(new java.awt.Dimension(700, 410));

        mainScrollPane.setBackground(new java.awt.Color(0, 255, 102));
        mainScrollPane.setMinimumSize(new java.awt.Dimension(700, 410));
        mainScrollPane.setPreferredSize(new java.awt.Dimension(700, 410));
        scrollPanel.setViewportView(mainScrollPane);

        mainPanel.add(scrollPanel, java.awt.BorderLayout.CENTER);

        navBarPanel.setBackground(new java.awt.Color(31, 31, 31));
        navBarPanel.setPreferredSize(new java.awt.Dimension(700, 50));

        javax.swing.GroupLayout navBarPanelLayout = new javax.swing.GroupLayout(navBarPanel);
        navBarPanel.setLayout(navBarPanelLayout);
        navBarPanelLayout.setHorizontalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        navBarPanelLayout.setVerticalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        mainPanel.add(navBarPanel, java.awt.BorderLayout.NORTH);

        backgroundPanel.add(mainPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        mainScrollPane.add(new Cards());
        int x = 50;
        
        mainScrollPane.setPreferredSize(new Dimension(mainScrollPane.getPreferredSize().height + x, mainScrollPane.getPreferredSize().width));
        
        
        int y = mainScrollPane.getPreferredSize().height;
        System.out.println("Pref size: "+ y);
        
        
        scrollPanel.revalidate();
        scrollPanel.repaint();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(MusicFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asidePanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainScrollPane;
    private javax.swing.JPanel navBarPanel;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables

    private void init() {
        JViewport viewport = scrollPanel.getViewport();
        viewport.setBackground(new Color(0x1F1F1F));
//        scrollPanel.setViewportBorder(null);
        scrollPanel.setBorder(null);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(10);
        
//        mainScrollPane.setLayout(new MigLayout("fill, wrap"));
        
    }
    
    
}

