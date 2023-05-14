package gahdammusicplayerfinals;

import java.io.File;

public class ExtractInfo {
    public static String directoryPath;
    public static File directory;
    public static File[] files;
    public static String[] fileNames;
    public static String[] artistName;
    public static String[] musicName;
    public static int fileCount;

    static {
        directoryPath = "C:\\";
        directory = new File(directoryPath);
        files = directory.listFiles();
        fileNames = new String[files.length];
        artistName = new String[files.length];
        musicName = new String[files.length];
        fileCount = files.length;
    }

    public ExtractInfo() {
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            String[] fileParts = fileName.split(" - "); // If format is "ArtistName - SongName.mp3"

            if (fileParts.length == 2) {
                String artist = fileParts[0];
                String song = fileParts[1].substring(0, fileParts[1].lastIndexOf('.'));
                artistName[i] = artist;
                musicName[i] = song;
            }
        }
    }

    public static void setDirectoryPath(String path) {
        directoryPath = path ;
        directory = new File(directoryPath);
        files = directory.listFiles();
        fileNames = new String[files.length];
        artistName = new String[files.length];
        musicName = new String[files.length];
        fileCount = files.length;
    }

}
