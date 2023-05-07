package gahdammusicplayerfinals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.media.Media;

public class FileSelector {
    //Set the URL path to String

    static String directoryPath = "C:\\Users\\tacuj\\Documents\\NetBeansProjects\\GahDamMusicPlayerFinals\\src\\musicFolder";
    //Set File Directory
    File directory = new File(directoryPath);
    //Get the list of files in the directory
    File[] files = directory.listFiles();
    //Convert the file list to an array of file names
    String[] fileNames = new String[files.length];
    //Convert the file list to an array of file index
    int[] fileIndex = new int[files.length];

    List<String[]> musicList = new ArrayList<>();

    public FileSelector() {
        //Set the file list
        for (int i = 0; i < files.length; i++) {
            fileNames[i] = "[" + i + "]" + " " + files[i].getName();
            fileIndex[i] = i;

        }
    }

    // Iterate over each music file and extract its name and artist
    public void showFile() {
        for (String element : fileNames) {
//            System.out.println(element);

        }
        for (String[] music : musicList) {
            System.out.println("Music Name: " + music[0]);
            System.out.println("Artist Name: " + music[1]);
        }
    }
}
