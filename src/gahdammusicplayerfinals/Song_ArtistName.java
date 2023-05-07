package gahdammusicplayerfinals;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Song_ArtistName {
    
    static String[] musicTitle;
    static String[] artistName;
    
    // Set the URL path to String
    static String directoryPath = "C:\\Users\\tacuj\\Documents\\NetBeansProjects\\GahDamMusicPlayerFinals\\src\\musicFolder";
    // Set File Directory
    File directory = new File(directoryPath);
    // Get the list of files in the directory
    File[] files = directory.listFiles();
    // Convert the file list to an array of file names
    String[] fileNames = new String[files.length];
    // Convert the file list to an array of file index
    int[] fileIndex = new int[files.length];

    // List to store music info
    List<String[]> musicList = new ArrayList<>();
    
    // Hashtable to store music info
    Hashtable<String, String> musicInfoTable = new Hashtable<>();

    public void extractMusicInfo() {
        // Set the file list
        for (int i = 0; i < files.length; i++) {
            
            // Extract the music name and artist name
            String fileName = files[i].getName();
            String[] fileParts = fileName.split(" - "); // Assuming the format is "ArtistName - SongName.mp3"

            if (fileParts.length == 2) {
                String artistName = fileParts[0];
                String musicName = fileParts[1].substring(0, fileParts[1].lastIndexOf('.'));

                // Store the music name and artist name in a list
                String[] musicInfo = {musicName, artistName};
                musicList.add(musicInfo);
                
                // Add music info to the hashtable
                musicInfoTable.put(musicName, artistName);
            }
        }

        // Output the extracted information
        for (String[] musicInfo : musicList) {
            String musicName = musicInfo[0];
            String artistName = musicInfo[1];
            System.out.println("Music Name: " + musicName);
            System.out.println("Artist Name: " + artistName);
            System.out.println("---------------------------");
        }
        
    }
    
    // Method to retrieve the artist name for a given music name
    public String getArtistName(String musicName) {
        String artistName = musicInfoTable.get(musicName);
        if (artistName == null) {
            System.out.println("Artist name not found for " + musicName);
        }
        return artistName;
    }

    public static void main(String[] args) {
        Song_ArtistName songArtistName = new Song_ArtistName();
//        songArtistName.extractMusicInfo();
        
        // retrieve artist name for a given music name
        String musicName = "Song Name";
        String artistName = songArtistName.getArtistName(musicName);
        System.out.println("Artist Name for " + musicName + ": " + artistName);
    }
}
