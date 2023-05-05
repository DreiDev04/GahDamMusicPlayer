
package gahdammusicplayerfinals;

public class Cards extends javax.swing.JPanel {

    public Cards() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageContainer = new javax.swing.JPanel();
        songName = new javax.swing.JLabel();
        artistName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 32, 32));
        setMinimumSize(new java.awt.Dimension(149, 191));
        setPreferredSize(new java.awt.Dimension(149, 191));

        imageContainer.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout imageContainerLayout = new javax.swing.GroupLayout(imageContainer);
        imageContainer.setLayout(imageContainerLayout);
        imageContainerLayout.setHorizontalGroup(
            imageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        imageContainerLayout.setVerticalGroup(
            imageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        add(imageContainer);

        songName.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        songName.setForeground(new java.awt.Color(255, 255, 255));
        songName.setText("<Song Name Here>");
        add(songName);

        artistName.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        artistName.setForeground(new java.awt.Color(204, 204, 204));
        artistName.setText("<Artist Name>");
        add(artistName);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artistName;
    private javax.swing.JPanel imageContainer;
    private javax.swing.JLabel songName;
    // End of variables declaration//GEN-END:variables
}
