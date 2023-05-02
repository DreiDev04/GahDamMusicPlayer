
package gahdammusicplayerfinals;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.util.Duration;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javafx.application.Platform;

public class SwingJavaFXMusicPlayer extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JFXPanel fxPanel;
    private final JButton playButton;
    private final JButton pauseButton;
    private final JButton stopButton;
    private final JSlider volumeSlider;

    private MediaPlayer mediaPlayer;

    public SwingJavaFXMusicPlayer() {
        super("Swing + JavaFX Music Player");
        setSize(WIDTH, HEIGHT);

        // Create a new JFXPanel to embed the JavaFX music player
        fxPanel = new JFXPanel();

        // Create Swing buttons for play, pause, and stop
        playButton = new JButton("Play");
        playButton.addActionListener(e -> play());

        pauseButton = new JButton("Pause");
        pauseButton.addActionListener(e -> pause());

        stopButton = new JButton("Stop");
        stopButton.addActionListener(e -> stop());

        // Create a Swing slider for volume
        volumeSlider = new JSlider(0, 100, 50);
        volumeSlider.addChangeListener(e -> setVolume(volumeSlider.getValue() / 100.0));

        // Add Swing components to the frame
        JPanel controlPanel = new JPanel(new GridLayout(2, 2));
        controlPanel.add(playButton);
        controlPanel.add(pauseButton);
        controlPanel.add(stopButton);
        controlPanel.add(volumeSlider);

        setLayout(new BorderLayout());
        add(fxPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        // Initialize the JavaFX environment
        Platform.runLater(() -> {
            initFX(fxPanel);
            createMediaPlayer();
        });
    }

    private void initFX(JFXPanel fxPanel) {
        // This method initializes the JavaFX environment, and must be called before using any JavaFX components
        new JFXPanel(); // This line is required to ensure the JavaFX toolkit is initialized on the current thread
    }

    private void createMediaPlayer() {
        // This method creates the JavaFX MediaPlayer component, and sets up the media file to be played
        Media media = new Media(new File("C:\\Users\\tacuj\\Documents\\NetBeansProjects\\GahDamMusicPlayerFinals\\src\\musicFolder\\Taylor Swift - 22.mp3").toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setOnEndOfMedia(() -> stop()); // Stop playing when the media ends
    }

    public void play() {
        // This method starts playing the media file using the JavaFX MediaPlayer
        if (mediaPlayer.getStatus() == Status.PAUSED) {
            mediaPlayer.play();
        } else {
            mediaPlayer.stop();
            mediaPlayer.seek(Duration.ZERO);
            mediaPlayer.play();
        }
    }

    public void pause() {
        // This method pauses the media file using the JavaFX MediaPlayer
        mediaPlayer.pause();
    }

    public void stop() {
        // This method stops the media file using the JavaFX MediaPlayer
        mediaPlayer.stop();
        mediaPlayer.seek(Duration.ZERO);
    }

    public void setVolume(double volume) {
        // This method sets the volume of the media file using the JavaFX MediaPlayer
        mediaPlayer.setVolume(volume);
    }

    public static void main(String[] args) {
        SwingJavaFXMusicPlayer player = new SwingJavaFXMusicPlayer();
        player.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        player.setVisible(true);
    }
}

