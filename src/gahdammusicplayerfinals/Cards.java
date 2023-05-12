package gahdammusicplayerfinals;

public class Cards extends javax.swing.JPanel {

    static ExtractInfo extractInfo;
    static MusicFrame musicFrame;
    
    static public String currentMusic;
    public Cards() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        songName = new javax.swing.JLabel();
        artistName = new javax.swing.JLabel();
        musicArtwork = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 32, 32));
        setMinimumSize(new java.awt.Dimension(150, 200));
        setPreferredSize(new java.awt.Dimension(150, 200));

        songName.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        songName.setForeground(new java.awt.Color(255, 255, 255));
        songName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songName.setText("<Song Name Here>");

        artistName.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        artistName.setForeground(new java.awt.Color(204, 204, 204));
        artistName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        artistName.setText("<Artist Name>");

        musicArtwork.setBackground(new java.awt.Color(0, 0, 0));
        musicArtwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/music icon.jpg"))); // NOI18N
        musicArtwork.setToolTipText("");
        musicArtwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musicArtworkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(songName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(artistName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(musicArtwork)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(musicArtwork, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(artistName))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void musicArtworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicArtworkMouseClicked
        
    }//GEN-LAST:event_musicArtworkMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel artistName;
    public javax.swing.JLabel musicArtwork;
    public javax.swing.JLabel songName;
    // End of variables declaration//GEN-END:variables

}
