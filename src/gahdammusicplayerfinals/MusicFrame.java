package gahdammusicplayerfinals;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class MusicFrame extends javax.swing.JFrame {

    CardLayout cardLayout;
    Cards cards;
    int cardCount = 0;

    //mouse nav listener
    private int dragStartX;
    private int dragStartY;

    //resize listener
    private int previousWidth;
    private int previousHeight;
    private boolean isFullScreen;
    private Dimension windowSize;

    public MusicFrame() {

        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        northPanel = new javax.swing.JPanel();
        xButton = new javax.swing.JLabel();
        resizeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        asidePanel = new javax.swing.JPanel();
        logoContainer = new javax.swing.JPanel();
        gahDamMusicLaebl = new javax.swing.JLabel();
        logoCont = new javax.swing.JPanel();
        welcomeLogo = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        libraryLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        yourLibraryPanel = new javax.swing.JPanel();
        navBarPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        libraryscrollPanel = new javax.swing.JScrollPane();
        mainScrollPane = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        searchNav = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        libraryscrollPanel1 = new javax.swing.JScrollPane();
        mainScrollPane2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GahDamBro");
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 530));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        backgroundPanel.setBackground(new java.awt.Color(204, 204, 204));
        backgroundPanel.setLayout(new java.awt.BorderLayout());

        northPanel.setBackground(new java.awt.Color(12, 0, 3));
        northPanel.setPreferredSize(new java.awt.Dimension(900, 30));
        northPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                northPanelMouseDragged(evt);
            }
        });
        northPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                northPanelMousePressed(evt);
            }
        });

        xButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power.png"))); // NOI18N
        xButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xButtonMouseClicked(evt);
            }
        });

        resizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/resize.png"))); // NOI18N
        resizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resizeButtonMouseClicked(evt);
            }
        });

        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize.png"))); // NOI18N
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout northPanelLayout = new javax.swing.GroupLayout(northPanel);
        northPanel.setLayout(northPanelLayout);
        northPanelLayout.setHorizontalGroup(
            northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, northPanelLayout.createSequentialGroup()
                .addContainerGap(837, Short.MAX_VALUE)
                .addComponent(minimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xButton)
                .addContainerGap())
        );
        northPanelLayout.setVerticalGroup(
            northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimizeButton)
                    .addComponent(resizeButton)
                    .addComponent(xButton))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        backgroundPanel.add(northPanel, java.awt.BorderLayout.NORTH);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap(805, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        backgroundPanel.add(footerPanel, java.awt.BorderLayout.SOUTH);

        asidePanel.setBackground(new java.awt.Color(37, 37, 38));
        asidePanel.setMaximumSize(new java.awt.Dimension(300, 460));
        asidePanel.setMinimumSize(new java.awt.Dimension(200, 460));
        asidePanel.setPreferredSize(new java.awt.Dimension(200, 460));

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

        logoCont.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout logoContLayout = new javax.swing.GroupLayout(logoCont);
        logoCont.setLayout(logoContLayout);
        logoContLayout.setHorizontalGroup(
            logoContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        logoContLayout.setVerticalGroup(
            logoContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        welcomeLogo.setForeground(new java.awt.Color(102, 255, 102));
        welcomeLogo.setText("Welcome to GahDamMusic");

        searchLabel.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(204, 204, 204));
        searchLabel.setText("Search");
        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLabelMouseClicked(evt);
            }
        });

        libraryLabel.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        libraryLabel.setForeground(new java.awt.Color(204, 204, 204));
        libraryLabel.setText("Your Library");
        libraryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libraryLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout asidePanelLayout = new javax.swing.GroupLayout(asidePanel);
        asidePanel.setLayout(asidePanelLayout);
        asidePanelLayout.setHorizontalGroup(
            asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asidePanelLayout.createSequentialGroup()
                .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(asidePanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(logoCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeLogo))
                    .addGroup(asidePanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(asidePanelLayout.createSequentialGroup()
                                .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gahDamMusicLaebl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(libraryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        asidePanelLayout.setVerticalGroup(
            asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(asidePanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(gahDamMusicLaebl)))
                .addGap(18, 18, 18)
                .addComponent(libraryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        backgroundPanel.add(asidePanel, java.awt.BorderLayout.WEST);

        mainPanel.setPreferredSize(new java.awt.Dimension(700, 460));
        mainPanel.setLayout(new java.awt.CardLayout());

        yourLibraryPanel.setPreferredSize(new java.awt.Dimension(700, 460));
        yourLibraryPanel.setLayout(new java.awt.BorderLayout());

        navBarPanel.setBackground(new java.awt.Color(31, 31, 31));
        navBarPanel.setPreferredSize(new java.awt.Dimension(700, 60));
        navBarPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Your Library");
        navBarPanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 148, 25);

        yourLibraryPanel.add(navBarPanel, java.awt.BorderLayout.NORTH);

        libraryscrollPanel.setBackground(new java.awt.Color(31, 31, 31));
        libraryscrollPanel.setForeground(new java.awt.Color(31, 31, 31));
        libraryscrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        libraryscrollPanel.setToolTipText("");
        libraryscrollPanel.setPreferredSize(new java.awt.Dimension(700, 410));

        mainScrollPane.setBackground(new java.awt.Color(32, 32, 32));
        mainScrollPane.setMinimumSize(new java.awt.Dimension(700, 410));
        mainScrollPane.setPreferredSize(new java.awt.Dimension(700, 410));
        libraryscrollPanel.setViewportView(mainScrollPane);

        yourLibraryPanel.add(libraryscrollPanel, java.awt.BorderLayout.CENTER);

        mainPanel.add(yourLibraryPanel, "firstCard");

        searchPanel.setPreferredSize(new java.awt.Dimension(700, 460));
        searchPanel.setLayout(new java.awt.BorderLayout());

        searchNav.setBackground(new java.awt.Color(31, 31, 31));
        searchNav.setPreferredSize(new java.awt.Dimension(700, 60));
        searchNav.setLayout(null);

        searchTextField.setBackground(new java.awt.Color(181, 181, 181));
        searchTextField.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        searchTextField.setForeground(java.awt.Color.gray);
        searchTextField.setText("Search");
        searchTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 30));
        searchTextField.setOpaque(false);
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        searchNav.add(searchTextField);
        searchTextField.setBounds(20, 10, 279, 33);

        searchPanel.add(searchNav, java.awt.BorderLayout.NORTH);

        libraryscrollPanel1.setBackground(new java.awt.Color(31, 31, 31));
        libraryscrollPanel1.setForeground(new java.awt.Color(31, 31, 31));
        libraryscrollPanel1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        libraryscrollPanel1.setToolTipText("");
        libraryscrollPanel1.setPreferredSize(new java.awt.Dimension(700, 420));

        mainScrollPane2.setBackground(new java.awt.Color(32, 32, 32));
        mainScrollPane2.setMinimumSize(new java.awt.Dimension(700, 410));
        mainScrollPane2.setPreferredSize(new java.awt.Dimension(700, 400));
        libraryscrollPanel1.setViewportView(mainScrollPane2);

        searchPanel.add(libraryscrollPanel1, java.awt.BorderLayout.CENTER);

        mainPanel.add(searchPanel, "secondCard");

        backgroundPanel.add(mainPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
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
        libraryscrollPanel.revalidate();
        libraryscrollPanel.repaint();
    }//GEN-LAST:event_jButton1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void xButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void northPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_northPanelMouseDragged
        int x = getLocation().x + evt.getX() - dragStartX;
        int y = getLocation().y + evt.getY() - dragStartY;
        setLocation(x, y);
    }//GEN-LAST:event_northPanelMouseDragged

    private void northPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_northPanelMousePressed
        dragStartX = evt.getX();
        dragStartY = evt.getY();
    }//GEN-LAST:event_northPanelMousePressed

    private void resizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resizeButtonMouseClicked
        if (!isFullScreen) {
            // Save the previous size
            previousWidth = getWidth();
            previousHeight = getHeight();

            // Enter full screen
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice device = env.getDefaultScreenDevice();
            device.setFullScreenWindow(MusicFrame.this);
            isFullScreen = true;
            ImageIcon icon = new ImageIcon(getClass().getResource("/icons/collapse.png"));
            resizeButton.setIcon(icon);

        } else {
            // Exit full screen and restore previous size
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice device = env.getDefaultScreenDevice();
            device.setFullScreenWindow(null);
            setSize(previousWidth, previousHeight);
            setLocationRelativeTo(null);
            isFullScreen = false;
            ImageIcon icon = new ImageIcon(getClass().getResource("/icons/resize.png"));
            resizeButton.setIcon(icon);
        }

    }//GEN-LAST:event_resizeButtonMouseClicked

    private void libraryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libraryLabelMouseClicked
        mainPanel.removeAll();
        mainPanel.add(yourLibraryPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_libraryLabelMouseClicked

    private void searchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseClicked
        mainPanel.removeAll();
        mainPanel.add(searchPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_searchLabelMouseClicked

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        if (searchTextField.getText().equals("Search")) {
            searchTextField.setText("");
            searchTextField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        if (searchTextField.getText().isEmpty()) {
            searchTextField.setText("Search");
            searchTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_searchTextFieldFocusLost

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JScrollPane libraryscrollPanel;
    private javax.swing.JScrollPane libraryscrollPanel1;
    private javax.swing.JPanel logoCont;
    private javax.swing.JPanel logoContainer;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainScrollPane;
    private javax.swing.JPanel mainScrollPane2;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JPanel navBarPanel;
    private javax.swing.JPanel northPanel;
    private javax.swing.JLabel resizeButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JPanel searchNav;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel welcomeLogo;
    private javax.swing.JLabel xButton;
    private javax.swing.JPanel yourLibraryPanel;
    // End of variables declaration//GEN-END:variables

    private void init() {

        JViewport viewport = libraryscrollPanel.getViewport();
        viewport.setBackground(new Color(0x1F1F1F));
        libraryscrollPanel.setBorder(null);
        
        JViewport viewport1 = libraryscrollPanel1.getViewport();
        viewport.setBackground(new Color(0x1F1F1F));
        libraryscrollPanel1.setBorder(null);
        
        libraryscrollPanel.getVerticalScrollBar().setUnitIncrement(10);

    }
}
