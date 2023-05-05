package gahdammusicplayerfinals;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Song_ArtistName {

    public static void main(String[] args) {
        // Specify the directory containing the music files
        String directoryPath = "C:\\Users\\tacuj\\Documents\\NetBeansProjects\\GahDamMusicPlayerFinals\\src\\musicFolder";

        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Get a list of all the music files in the directory
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".mp3"));

        // Create a list to store the music names and artists
        List<String[]> musicList = new ArrayList<>();

        // Iterate over each music file and extract its name and artist
        for (File file : files) {
            String musicFilePath = file.getAbsolutePath();
            Media media = new Media(new File(musicFilePath).toURI().toString());

            String musicName = (String) media.getMetadata().get("title");
            String artistName = (String) media.getMetadata().get("artist");

            // Add the music name and artist to the list
            musicList.add(new String[]{musicName, artistName});
        }

        // Print the list of music names and artists
        for (String[] music : musicList) {
            System.out.println("Music Name: " + music[0]);
            System.out.println("Artist Name: " + music[1]);
        }
    }
}