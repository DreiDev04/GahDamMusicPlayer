package gahdammusicplayerfinals;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.util.Duration;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javafx.application.Platform;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MusicFrame extends javax.swing.JFrame {

    //import Other Files
    private ExtractInfo extractInfo;
    private MediaPlayer mediaPlayer;
    //import JavaFX
    private final JFXPanel fxPanel;

    private int cardCount = 0; //to deterine the how many cards in scroll panel
    private StringBuilder currentMusic = new StringBuilder(""); //SB for dynamic String
    private int musicIndex; // to deterimne the index

    private boolean isPlaying = false;

    //For Storing Cards Panel and Info
    private ArrayList<String> musicArray = new ArrayList<String>();
    private ArrayList<JPanel> cardsPanel;

    // For time stamp
    private DecimalFormat decimalFormat = new DecimalFormat("00");
    private Timer timer;
    private MouseEvent evt;
    private boolean userInteraction = false;

    // Mouse nav listener
    private int dragStartX;
    private int dragStartY;

    // Resize listener
    private int previousWidth;
    private int previousHeight;
    private boolean isFullScreen;

    public MusicFrame() {

        initComponents();
        init();

        fxPanel = new JFXPanel();
        footerPanel.add(fxPanel);
        Platform.runLater(() -> {
            initFX(fxPanel);

        });

        musicInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        northPanel = new javax.swing.JPanel();
        xButton = new javax.swing.JLabel();
        resizeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        settingCombo = new javax.swing.JComboBox<>();
        footerPanel = new javax.swing.JPanel();
        infoController = new javax.swing.JPanel();
        artworkContainer = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        songNameLabel = new javax.swing.JLabel();
        artistNameLabel = new javax.swing.JLabel();
        musicController = new javax.swing.JPanel();
        currentTime = new javax.swing.JLabel();
        stopButton1 = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        repeatToggleButton = new javax.swing.JToggleButton();
        endTime = new javax.swing.JLabel();
        musicJslider = new javax.swing.JSlider();
        volumeController = new javax.swing.JPanel();
        volumeSlider = new javax.swing.JSlider();
        volumeLogo = new javax.swing.JLabel();
        asidePanel = new javax.swing.JPanel();
        logoContainer = new javax.swing.JPanel();
        logo_50x50 = new javax.swing.JLabel();
        gahDamMusicLaebl = new javax.swing.JLabel();
        logoContainer1 = new javax.swing.JPanel();
        logo_25x25 = new javax.swing.JLabel();
        welcomeLogo = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        libraryLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        yourLibraryPanel = new javax.swing.JPanel();
        navBarPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        libraryscroll = new javax.swing.JScrollPane();
        libraryScrollPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        searchNav = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        searchScroll = new javax.swing.JScrollPane();
        searchScrollPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GahDamBro");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);

        backgroundPanel.setBackground(new java.awt.Color(204, 204, 204));
        backgroundPanel.setLayout(new java.awt.BorderLayout());

        northPanel.setBackground(new java.awt.Color(12, 0, 3));
        northPanel.setPreferredSize(new java.awt.Dimension(900, 25));
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

        settingCombo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        settingCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Directory" }));
        settingCombo.setToolTipText("");
        settingCombo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        settingCombo.setFocusable(false);
        settingCombo.setOpaque(false);
        settingCombo.setRequestFocusEnabled(false);
        settingCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout northPanelLayout = new javax.swing.GroupLayout(northPanel);
        northPanel.setLayout(northPanelLayout);
        northPanelLayout.setHorizontalGroup(
            northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, northPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, northPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(settingCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backgroundPanel.add(northPanel, java.awt.BorderLayout.NORTH);

        footerPanel.setBackground(new java.awt.Color(31, 31, 31));
        footerPanel.setPreferredSize(new java.awt.Dimension(900, 70));

        infoController.setBackground(new java.awt.Color(31, 31, 31));
        infoController.setPreferredSize(new java.awt.Dimension(250, 60));
        infoController.add(artworkContainer);

        jPanel4.setBackground(new java.awt.Color(31, 31, 31));
        jPanel4.setPreferredSize(new java.awt.Dimension(160, 50));

        songNameLabel.setBackground(new java.awt.Color(49, 49, 49));
        songNameLabel.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        songNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        songNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        artistNameLabel.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        artistNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        artistNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(songNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addComponent(artistNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(songNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(artistNameLabel))
        );

        infoController.add(jPanel4);

        footerPanel.add(infoController);

        musicController.setBackground(new java.awt.Color(31, 31, 31));
        musicController.setPreferredSize(new java.awt.Dimension(300, 60));
        musicController.setRequestFocusEnabled(false);

        currentTime.setBackground(new java.awt.Color(255, 255, 255));
        currentTime.setForeground(new java.awt.Color(255, 255, 255));
        currentTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentTime.setText("00:00");
        musicController.add(currentTime);

        stopButton1.setBackground(new java.awt.Color(31, 31, 31));
        stopButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stop-button.png"))); // NOI18N
        stopButton1.setBorder(null);
        stopButton1.setFocusPainted(false);
        stopButton1.setFocusable(false);
        stopButton1.setOpaque(false);
        stopButton1.setPreferredSize(new java.awt.Dimension(28, 28));
        stopButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopButton1MouseClicked(evt);
            }
        });
        musicController.add(stopButton1);

        prevButton.setBackground(new java.awt.Color(31, 31, 31));
        prevButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left-chevron.png"))); // NOI18N
        prevButton.setBorder(null);
        prevButton.setBorderPainted(false);
        prevButton.setContentAreaFilled(false);
        prevButton.setFocusable(false);
        prevButton.setPreferredSize(new java.awt.Dimension(32, 32));
        prevButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevButtonMouseClicked(evt);
            }
        });
        musicController.add(prevButton);

        playButton.setBackground(new java.awt.Color(31, 31, 31));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/play-button.png"))); // NOI18N
        playButton.setBorder(null);
        playButton.setBorderPainted(false);
        playButton.setContentAreaFilled(false);
        playButton.setFocusable(false);
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });
        musicController.add(playButton);

        nextButton.setBackground(new java.awt.Color(31, 31, 31));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/right-chevron.png"))); // NOI18N
        nextButton.setBorder(null);
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setFocusable(false);
        nextButton.setPreferredSize(new java.awt.Dimension(32, 32));
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        musicController.add(nextButton);

        repeatToggleButton.setBackground(new java.awt.Color(31, 31, 31));
        repeatToggleButton.setForeground(new java.awt.Color(204, 204, 255));
        repeatToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/repeat (3).png"))); // NOI18N
        repeatToggleButton.setToolTipText("");
        repeatToggleButton.setFocusable(false);
        repeatToggleButton.setOpaque(false);
        repeatToggleButton.setPreferredSize(new java.awt.Dimension(28, 28));
        repeatToggleButton.setRequestFocusEnabled(false);
        musicController.add(repeatToggleButton);

        endTime.setBackground(new java.awt.Color(255, 255, 255));
        endTime.setForeground(new java.awt.Color(255, 255, 255));
        endTime.setText("00:00");
        musicController.add(endTime);

        musicJslider.setPaintLabels(true);
        musicJslider.setPaintTicks(true);
        musicJslider.setValue(0);
        musicJslider.setMinimumSize(new java.awt.Dimension(280, 27));
        musicJslider.setOpaque(false);
        musicJslider.setPreferredSize(new java.awt.Dimension(280, 27));
        musicController.add(musicJslider);

        footerPanel.add(musicController);

        volumeController.setBackground(new java.awt.Color(31, 31, 31));
        volumeController.setPreferredSize(new java.awt.Dimension(300, 60));

        volumeSlider.setOpaque(false);

        volumeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/volume-up.png"))); // NOI18N

        javax.swing.GroupLayout volumeControllerLayout = new javax.swing.GroupLayout(volumeController);
        volumeController.setLayout(volumeControllerLayout);
        volumeControllerLayout.setHorizontalGroup(
            volumeControllerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, volumeControllerLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(volumeLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        volumeControllerLayout.setVerticalGroup(
            volumeControllerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volumeControllerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(volumeControllerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volumeLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        footerPanel.add(volumeController);

        backgroundPanel.add(footerPanel, java.awt.BorderLayout.SOUTH);

        asidePanel.setBackground(new java.awt.Color(37, 37, 38));
        asidePanel.setMaximumSize(new java.awt.Dimension(300, 460));
        asidePanel.setMinimumSize(new java.awt.Dimension(200, 460));
        asidePanel.setPreferredSize(new java.awt.Dimension(200, 460));

        logoContainer.setBackground(new java.awt.Color(204, 0, 0));
        logoContainer.setPreferredSize(new java.awt.Dimension(50, 50));

        logo_50x50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/50x50 Logo Pink.jpg"))); // NOI18N

        javax.swing.GroupLayout logoContainerLayout = new javax.swing.GroupLayout(logoContainer);
        logoContainer.setLayout(logoContainerLayout);
        logoContainerLayout.setHorizontalGroup(
            logoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoContainerLayout.createSequentialGroup()
                .addComponent(logo_50x50)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoContainerLayout.setVerticalGroup(
            logoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoContainerLayout.createSequentialGroup()
                .addComponent(logo_50x50)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gahDamMusicLaebl.setBackground(new java.awt.Color(204, 204, 204));
        gahDamMusicLaebl.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 16)); // NOI18N
        gahDamMusicLaebl.setForeground(new java.awt.Color(102, 255, 102));
        gahDamMusicLaebl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gahDamMusicLaebl.setText("GahDamMusic");

        logoContainer1.setBackground(new java.awt.Color(204, 0, 0));
        logoContainer1.setPreferredSize(new java.awt.Dimension(25, 25));

        logo_25x25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/25x25 Logo Pink.jpg"))); // NOI18N

        javax.swing.GroupLayout logoContainer1Layout = new javax.swing.GroupLayout(logoContainer1);
        logoContainer1.setLayout(logoContainer1Layout);
        logoContainer1Layout.setHorizontalGroup(
            logoContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoContainer1Layout.createSequentialGroup()
                .addComponent(logo_25x25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoContainer1Layout.setVerticalGroup(
            logoContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo_25x25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(logoContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeLogo))
                    .addGroup(asidePanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(asidePanelLayout.createSequentialGroup()
                                .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gahDamMusicLaebl, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                            .addComponent(libraryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addGroup(asidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoContainer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        libraryscroll.setBackground(new java.awt.Color(31, 31, 31));
        libraryscroll.setForeground(new java.awt.Color(31, 31, 31));
        libraryscroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        libraryscroll.setToolTipText("");
        libraryscroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        libraryscroll.setMinimumSize(new java.awt.Dimension(700, 410));
        libraryscroll.setPreferredSize(new java.awt.Dimension(700, 410));

        libraryScrollPanel.setBackground(new java.awt.Color(32, 32, 32));
        libraryScrollPanel.setMinimumSize(new java.awt.Dimension(700, 410));
        libraryScrollPanel.setPreferredSize(new java.awt.Dimension(700, 410));
        libraryscroll.setViewportView(libraryScrollPanel);

        yourLibraryPanel.add(libraryscroll, java.awt.BorderLayout.CENTER);

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
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });
        searchNav.add(searchTextField);
        searchTextField.setBounds(20, 10, 279, 33);

        searchPanel.add(searchNav, java.awt.BorderLayout.NORTH);

        searchScroll.setBackground(new java.awt.Color(31, 31, 31));
        searchScroll.setForeground(new java.awt.Color(31, 31, 31));
        searchScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        searchScroll.setToolTipText("");
        searchScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        searchScroll.setMinimumSize(new java.awt.Dimension(700, 410));
        searchScroll.setPreferredSize(new java.awt.Dimension(700, 410));

        searchScrollPanel.setBackground(new java.awt.Color(32, 32, 32));
        searchScrollPanel.setMaximumSize(new java.awt.Dimension(700, 9999));
        searchScrollPanel.setMinimumSize(new java.awt.Dimension(700, 420));
        searchScrollPanel.setPreferredSize(new java.awt.Dimension(700, 420));
        searchScroll.setViewportView(searchScrollPanel);

        searchPanel.add(searchScroll, java.awt.BorderLayout.CENTER);

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
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        System.out.println("repaint");

        addCards(false); // false, for us to set the dimension properly

    }//GEN-LAST:event_libraryLabelMouseClicked

    private void searchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseClicked
        mainPanel.removeAll();
        mainPanel.add(searchPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_searchLabelMouseClicked

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

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        if (isPlaying) {
            mediaPlayer.pause();
            playButton.setIcon(new ImageIcon(getClass().getResource("/icons/play-button.png")));
            if (timer != null) {
                timer.cancel(); // Cancel the timer task to pause it
            }
        } else {
            mediaPlayer.play();
            playButton.setIcon(new ImageIcon(getClass().getResource("/icons/pause-button.png")));
            if (timer != null) {
                startTimer(); // Start or resume the timer
            }
        }

        isPlaying = !isPlaying;


    }//GEN-LAST:event_playButtonMouseClicked

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        musicJslider.setValue(0);
        currentMusic.setLength(0);
        currentMusic.append(musicArray.get(musicIndex + 1));

        System.out.println("Playing: " + musicArray.get(musicIndex + 1));

        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        createMediaPlayer();
        mediaPlayer.setOnReady(() -> {
            Duration duration = mediaPlayer.getTotalDuration();
            long totalSeconds = (long) duration.toSeconds();
            long minutes = totalSeconds / 60;
            long seconds = totalSeconds % 60;
            DecimalFormat decimalFormat = new DecimalFormat("00");
            String formattedDuration = decimalFormat.format(minutes) + ":" + decimalFormat.format(seconds);
            endTime.setText(formattedDuration);

            setupSlider(duration);
            startTimer();
        });

        setVolumeMusic(50);
        volumeSlider.setValue(50);
        playMusic();

        mediaPlayer.setOnEndOfMedia(() -> {
            if (repeatToggleButton.isSelected()) {
                System.out.println("Toggle Button Enabled");
                mediaPlayer.seek(Duration.ZERO);
            } else {
                nextButtonMouseClicked(evt);
            }
        });

        musicIndex++;
        artistNameLabel.setText("<html>" + extractInfo.artistName[musicIndex] + "</html>");
        songNameLabel.setText("<html>" + extractInfo.musicName[musicIndex] + "</html>");
    }//GEN-LAST:event_nextButtonMouseClicked

    private void prevButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevButtonMouseClicked
        musicJslider.setValue(0);
        currentMusic.setLength(0);
        currentMusic.append(musicArray.get(musicIndex - 1));
        System.out.println("Playing: " + musicArray.get(musicIndex - 1));

        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        createMediaPlayer();
        mediaPlayer.setOnReady(() -> {
            Duration duration = mediaPlayer.getTotalDuration();
            long totalSeconds = (long) duration.toSeconds();
            long minutes = totalSeconds / 60;
            long seconds = totalSeconds % 60;
            DecimalFormat decimalFormat = new DecimalFormat("00");
            String formattedDuration = decimalFormat.format(minutes) + ":" + decimalFormat.format(seconds);
            endTime.setText(formattedDuration);

            setupSlider(duration);
            startTimer();
        });

        setVolumeMusic(50);
        volumeSlider.setValue(50);
        musicJslider.setValue(0);

        playMusic();
        mediaPlayer.setOnEndOfMedia(() -> {
            if (repeatToggleButton.isSelected()) {
                System.out.println("Toggle Button Enabled");
                mediaPlayer.seek(Duration.ZERO);
            } else {
                nextButtonMouseClicked(evt);
            }
        });

        musicIndex--;
        artistNameLabel.setText("<html>" + extractInfo.artistName[musicIndex] + "</html>");
        songNameLabel.setText("<html>" + extractInfo.musicName[musicIndex] + "</html>");
    }//GEN-LAST:event_prevButtonMouseClicked

    private void stopButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopButton1MouseClicked
        stopMusic();
    }//GEN-LAST:event_stopButton1MouseClicked

    private void settingComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingComboActionPerformed

        JComboBox<String> comboBox = (JComboBox<String>) evt.getSource();
        String selectedItem = (String) comboBox.getSelectedItem();

        if ("Directory".equals(selectedItem)) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int result = fileChooser.showOpenDialog(MusicFrame.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                libraryScrollPanel.removeAll();
                musicArray.clear();
                libraryScrollPanel.revalidate();
                libraryScrollPanel.repaint();
                File selectedFile = fileChooser.getSelectedFile();
                extractInfo.setDirectoryPath(selectedFile.getAbsolutePath() + "\\");
                System.out.println(selectedFile);
                addCards(true);

            }
        }

    }//GEN-LAST:event_settingComboActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased

        searchScrollPanel.removeAll();
        boolean noMatch = true;
        int searchCards = 0;

        String searchValue = searchTextField.getText();
        System.out.println("search: " + searchValue);

        if (searchValue.isEmpty()) {
            return;
        }

        String regexPattern = "\\b" + Pattern.quote(searchValue) + "\\b";
        Pattern pattern = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);
        boolean panelExists = false;

        for (JPanel panel : cardsPanel) {
            String panelName = panel.getName();
            Matcher matcher = pattern.matcher(panelName);

            if (matcher.find()) {
                System.out.println("Match found in element: " + panelName);
                panelExists = true;
                searchScrollPanel.add(panel);
            }

            searchCards++;
            if (searchCards % 4 == 0) {
                Dimension currentPreferredSize = searchScrollPanel.getPreferredSize();
                searchScrollPanel.setPreferredSize(new Dimension(currentPreferredSize.width, currentPreferredSize.height + 200));
                searchScrollPanel.revalidate();
            }
        }

        searchScroll.revalidate();
        searchScroll.repaint();

        if (!panelExists) {
            System.out.println("No Match Found");
            noMatch = true;
        } else {
            noMatch = false;
        }
    }//GEN-LAST:event_searchTextFieldKeyReleased

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
    private javax.swing.JLabel artistNameLabel;
    private javax.swing.JLabel artworkContainer;
    private javax.swing.JPanel asidePanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel currentTime;
    private javax.swing.JLabel endTime;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JLabel gahDamMusicLaebl;
    private javax.swing.JPanel infoController;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JPanel libraryScrollPanel;
    private javax.swing.JScrollPane libraryscroll;
    private javax.swing.JPanel logoContainer;
    private javax.swing.JPanel logoContainer1;
    private javax.swing.JLabel logo_25x25;
    private javax.swing.JLabel logo_50x50;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JPanel musicController;
    private javax.swing.JSlider musicJslider;
    private javax.swing.JPanel navBarPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel northPanel;
    private javax.swing.JButton playButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JToggleButton repeatToggleButton;
    private javax.swing.JLabel resizeButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JPanel searchNav;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JScrollPane searchScroll;
    private javax.swing.JPanel searchScrollPanel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JComboBox<String> settingCombo;
    private javax.swing.JLabel songNameLabel;
    private javax.swing.JButton stopButton1;
    private javax.swing.JPanel volumeController;
    private javax.swing.JLabel volumeLogo;
    private javax.swing.JSlider volumeSlider;
    private javax.swing.JLabel welcomeLogo;
    private javax.swing.JLabel xButton;
    private javax.swing.JPanel yourLibraryPanel;
    // End of variables declaration//GEN-END:variables

    private void init() {
        libraryscroll.setBorder(null);
        searchScroll.setBorder(null);
        libraryscroll.getVerticalScrollBar().setUnitIncrement(10);
        searchScroll.getVerticalScrollBar().setUnitIncrement(10);

    }

    private void addCards(boolean isDimensionAdded) {

        libraryScrollPanel.removeAll();
        System.out.println(extractInfo.directoryPath);
        cardsPanel = new ArrayList<>();

        extractInfo = new ExtractInfo();
        for (int i = 0; i < extractInfo.fileCount; i++) {
            final int index = i;

            Cards cards = new Cards();

            cards.artistName.setText("<html>" + extractInfo.artistName[i] + "</html>");
            cards.songName.setText("<html>" + extractInfo.musicName[i] + "</html>");

            musicArray.add(extractInfo.files[i].getName());

            cards.musicArtwork.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent me) {
                    artistNameLabel.setText("<html>" + extractInfo.artistName[index] + "</html>");
                    songNameLabel.setText("<html>" + extractInfo.musicName[index] + "</html>");

                    artworkContainer.setIcon(new ImageIcon(getClass().getResource("/icons/music icon1.jpg")));

                    musicIndex = index;
                    currentMusic.setLength(0);
                    currentMusic.append(musicArray.get(index));

                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    createMediaPlayer();
                    mediaPlayer.setOnReady(() -> {
                        Duration duration = mediaPlayer.getTotalDuration();
                        long totalSeconds = (long) duration.toSeconds();
                        long minutes = totalSeconds / 60;
                        long seconds = totalSeconds % 60;
                        DecimalFormat decimalFormat = new DecimalFormat("00");
                        String formattedDuration = decimalFormat.format(minutes) + ":" + decimalFormat.format(seconds);
                        endTime.setText(formattedDuration);
                        setupSlider(duration);

                        startTimer();
                    });

                    setVolumeMusic(50);
                    volumeSlider.setValue(50);
                    playMusic();

                    mediaPlayer.setOnEndOfMedia(() -> {

                        if (repeatToggleButton.isSelected()) {
                            System.out.println("Toggle Button Enabled");
                            mediaPlayer.seek(Duration.ZERO);

                        } else {
                            nextButtonMouseClicked(evt);

                        }
                    });
                    System.out.println("Playing: " + musicArray.get(index));
                }
            });

            cardsPanel.add(cards);
            cardsPanel.get(i).setName(extractInfo.musicName[i]);
            libraryScrollPanel.add(cards);

            cardCount++;
            if (cardCount % 4 == 0 && isDimensionAdded) {
                Dimension currentPreferredSize = libraryScrollPanel.getPreferredSize();
                libraryScrollPanel.setPreferredSize(new Dimension(currentPreferredSize.width, currentPreferredSize.height + 200));
                libraryScrollPanel.revalidate();
            }
        }

        libraryscroll.revalidate();
        libraryscroll.repaint();
    }

    private void musicInit() {
        volumeSlider.addChangeListener(e
                -> setVolumeMusic(volumeSlider.getValue() / 100.0)
        );
        ImageIcon image = new ImageIcon("src/icons/MainLogoPink.jpg");
        this.setIconImage(image.getImage());

    }

    private void initFX(JFXPanel fxPanel) {
        // This method initializes the JavaFX environment, and must be called before using any JavaFX components
        new JFXPanel(); // This line is required to ensure the JavaFX toolkit is initialized on the current thread
    }

    private void createMediaPlayer() {
        // This method creates the JavaFX MediaPlayer component, and sets up the media file to be played
        Media media = new Media(new File(extractInfo.directoryPath + currentMusic).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setOnEndOfMedia(() -> stopMusic()); // Stop playing when the media ends
    }

    private void playMusic() {
        if (mediaPlayer.getStatus() == Status.PAUSED) {
            mediaPlayer.play();

        } else {
            mediaPlayer.stop();
            mediaPlayer.seek(Duration.ZERO);
            mediaPlayer.play();
            isPlaying = true;
            playButton.setIcon(new ImageIcon(getClass().getResource("/icons/pause-button.png")));
        }

    }

    private void stopMusic() {
        mediaPlayer.stop();
        mediaPlayer.seek(Duration.ZERO);
    }

    private void setVolumeMusic(double volume) {
        mediaPlayer.setVolume(volume);
    }

    private void setupSlider(Duration totalDuration) {
        int totalSeconds = (int) totalDuration.toSeconds();
        musicJslider.setMaximum(totalSeconds);

        musicJslider.addChangeListener(e -> {
            if (userInteraction) {
                int value = musicJslider.getValue();
                Duration seekTime = Duration.seconds(value);
                mediaPlayer.seek(seekTime);
            }
        });
        musicJslider.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                userInteraction = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                userInteraction = false;
            }
        });
    }

    private void startTimer() {
        if (timer != null) {
            timer.cancel(); //dispose the other timer on the backgrond
        }

        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Duration currentTime = mediaPlayer.getCurrentTime();
                long currentSeconds = (long) currentTime.toSeconds();
                long minutes = currentSeconds / 60;
                long seconds = currentSeconds % 60;
                String formattedTimestamp = String.format("%02d:%02d", minutes, seconds);
                System.out.println("Timer: " + formattedTimestamp);
                SwingUtilities.invokeLater(() -> updateChanges(formattedTimestamp, (int) currentSeconds));
            }
        }, 0, 1000);

    }

    private void updateChanges(String timeStamp, int progress) {
        currentTime.setText(timeStamp);
        musicJslider.setValue(progress);
    }

}
