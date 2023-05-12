
package gahdammusicplayerfinals;

import java.io.File;


public class ExtractInfo {
    
    static String directoryPath = "C:\\Users\\tacuj\\Documents\\NetBeansProjects\\GahDamMusicPlayerFinals\\src\\musicFolder\\";
    
//    static String directoryPath = ;
    //Set File Directory
    static File directory = new File(directoryPath);
    //Get the list of files in the directory
    public static File[] files = directory.listFiles();
    //Convert the file list to an array of file names
    static String[] fileNames = new String[files.length];
    
    final static String[] artistName = new String[files.length];
    final static String[] musicName = new String[files.length];
    static int fileCount = files.length;
    
    public ExtractInfo(){
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
    public static void main(String[] args) {
        new ExtractInfo();
        
//        for (String string : musicName) {
//            System.out.println(string);
//        }
        
        
    }
}
