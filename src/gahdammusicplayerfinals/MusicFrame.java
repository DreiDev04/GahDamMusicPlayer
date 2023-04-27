package gahdammusicplayerfinals;

import java.awt.*;
import javax.swing.*;


public class MusicFrame extends javax.swing.JFrame {

    Cards cards;
    int cardCount = 0;

    public MusicFrame() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        footerPanel = new javax.swing.JPanel();
        asidePanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        logoContainer = new javax.swing.JPanel();
        gahDamMusicLaebl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        mainScrollPane = new javax.swing.JPanel();
        navBarPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GahDamBro");
        setMinimumSize(new java.awt.Dimension(900, 520));

        backgroundPanel.setBackground(new java.awt.Color(204, 204, 204));
        backgroundPanel.setLayout(new java.awt.BorderLayout());

        footerPanel.setBackground(new java.awt.Color(31, 31, 31));
        footerPanel.setPreferredSize(new java.awt.Dimension(900, 60));

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        backgroundPanel.add(footerPanel, java.awt.BorderLayout.SOUTH);

        asidePanel.setBackground(new java.awt.Color(37, 37, 38));
        asidePanel.setMaximumSize(new java.awt.Dimension(300, 460));
        asidePanel.setMinimumSize(new java.awt.Dimension(200, 460));
        asidePanel.setPreferredSize(new java.awt.Dimension(200, 460));

        searchField.setText("Search");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        logoContainer.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout logoContainerLayout = new javax.swing.GroupLayout(logoContainer);
        logoContainer.setLayout(logoContainerLayout);
        logoContainerLayout.setHorizontalGroup(
            logoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        logoContainerLayout.setVerticalGroup(
            logoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        gahDamMusicLaebl.setBackground(new java.awt.Color(204, 204, 204));
        gahDamMusicLaebl.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 16)); // NOI18N
        gahDamMusicLaebl.setForeground(new java.awt.Color(102, 255, 102));
        gahDamMusicLaebl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gahDamMusicLaebl.setText("GahDamMusic");

        jPanel1.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Welcome to GahDamMusic");

        jButton2.setBackground(new java.awt.Color(31, 31, 31));
        jButton2.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 255, 102));
        jButton2.setText("   Your Library");
        jButton2.setBorder(null);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout asidePanelLayout = new javax.swing.GroupLayout(asidePanel);
        asidePanel.setLayout(asidePanelLayout);
        asidePanelLayout.setHorizontalGroup(
            asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asidePanelLayout.createSequentialGroup()
                .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(asidePanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(asidePanelLayout.createSequentialGroup()
                                .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gahDamMusicLaebl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(asidePanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        asidePanelLayout.setVerticalGroup(
            asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asidePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(asidePanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(gahDamMusicLaebl)))
                .addGap(18, 18, 18)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        backgroundPanel.add(asidePanel, java.awt.BorderLayout.WEST);

        mainPanel.setBackground(new java.awt.Color(31, 31, 31));
        mainPanel.setPreferredSize(new java.awt.Dimension(700, 460));
        mainPanel.setLayout(new java.awt.BorderLayout());

        scrollPanel.setBackground(new java.awt.Color(31, 31, 31));
        scrollPanel.setForeground(new java.awt.Color(31, 31, 31));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setToolTipText("");
        scrollPanel.setPreferredSize(new java.awt.Dimension(700, 410));

        mainScrollPane.setBackground(new java.awt.Color(32, 32, 32));
        mainScrollPane.setMinimumSize(new java.awt.Dimension(700, 410));
        mainScrollPane.setPreferredSize(new java.awt.Dimension(700, 410));
        scrollPanel.setViewportView(mainScrollPane);

        mainPanel.add(scrollPanel, java.awt.BorderLayout.CENTER);

        navBarPanel.setBackground(new java.awt.Color(31, 31, 31));
        navBarPanel.setPreferredSize(new java.awt.Dimension(700, 50));

        jButton1.setText("Add Cards");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Your Library");

        javax.swing.GroupLayout navBarPanelLayout = new javax.swing.GroupLayout(navBarPanel);
        navBarPanel.setLayout(navBarPanelLayout);
        navBarPanelLayout.setHorizontalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navBarPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(117, 117, 117))
        );
        navBarPanelLayout.setVerticalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        cardCount++;
        System.out.println(cardCount);
        if (cardCount % 4 == 0) {
            System.out.println("add height");
            Dimension currentPreferredSize = mainScrollPane.getPreferredSize();
            mainScrollPane.setPreferredSize(new Dimension(currentPreferredSize.width, currentPreferredSize.height + 191));
            mainScrollPane.revalidate();
        }
        scrollPanel.revalidate();
        scrollPanel.repaint();
    }//GEN-LAST:event_jButton1MouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JLabel gahDamMusicLaebl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logoContainer;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainScrollPane;
    private javax.swing.JPanel navBarPanel;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables

    private void init() {
        JViewport viewport = scrollPanel.getViewport();
        viewport.setBackground(new Color(0x1F1F1F));
        scrollPanel.setBorder(null);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(10);
//        
//        yourLibraryButton.setFocusPainted(false);
//        yourLibraryButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        
    }

}
