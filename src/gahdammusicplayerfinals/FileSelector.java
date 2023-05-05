
package gahdammusicplayerfinals;

import java.io.File;

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
    int [] fileIndex = new int[files.length];
    
    public FileSelector(){
      //Set the file list
        for (int i = 0; i < files.length; i++){
            fileNames[i] = "["+ i +"]" + " " + files[i].getName();
            fileIndex[i] = i;
        }
        
    }
    public void showFile(){
        for (String element : fileNames) {
            System.out.println(element);
        }
    }
}
