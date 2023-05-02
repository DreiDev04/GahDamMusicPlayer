
package gahdammusicplayerfinals;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import java.io.File;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MusicJAVA_FX {

    private MediaPlayer mediaPlayer;
    
    String filePath = "C:\\Users\\tacuj\\Documents\\NetBeansProjects\\GahDamMusicPlayerFinals\\src\\gahdammusicplayerfinals\\Taylor Swift - 22.mp3";
    
    public void playMusic() {
        if (mediaPlayer != null && mediaPlayer.getStatus() == Status.PAUSED) {
            mediaPlayer.play();
        } else {
            stopMusic();
            createMediaPlayer(filePath);
            mediaPlayer.play();
        }
    }

    public void pauseMusic() {
        if (mediaPlayer != null && mediaPlayer.getStatus() == Status.PLAYING) {
            mediaPlayer.pause();
        }
    }

    public void stopMusic() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.dispose();
        }
    }

    public void setVolume(double volume) {
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(volume);
        }
    }

    private void createMediaPlayer(String filePath) {
        Media media = new Media(new File(filePath).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setOnEndOfMedia(this::stopMusic);
    }
    
    public static void main(String[] args) {
        MusicJAVA_FX musicPlayer = new MusicJAVA_FX();
        musicPlayer.playMusic();
    }



 
}
