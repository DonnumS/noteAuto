import java.util.*;
import java.io.*;

public class Note {
    public static void main(String args[]) throws IOException{
        
        System.out.println();
        System.out.println("                 ***************");
        System.out.println("                  NoteAutomator");
        System.out.println("                 ***************");
        System.out.println("--------------------------------------------------");
        System.out.println("Type in folder, name and extension of desired file");
        System.out.println("If folder doesn't exist, a new one is created");
        System.out.println("If file doesn't exist, a new one is created");
        System.out.println("--------------------------------------------------");
        System.out.println();
        // First read the inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of folder: ");
        String folder = sc.nextLine();
        System.out.println();

        System.out.print("Name of file: ");
        String name = sc.nextLine();
        System.out.println();

        System.out.print("Enter desired extension (leave blank for txt): ");
        String ex = sc.nextLine();
        System.out.println();
        
        // Check if folder exists
        String folderString = "/Users/sebastian/Desktop/Notater/" + folder;

        File file = new File(folderString);

        boolean created = file.mkdir();

        if(created) {
            System.out.println("Created new folder: " + folder);
        }

        ;

        String path = "sublime /Users/sebastian/Desktop/Notater/";
        String folderNamePath;
        if(!ex.isEmpty()) {
            folderNamePath = folder + "/" + name + "." + ex;
        } else {
            folderNamePath = folder + "/" + name + ".txt";
        }
        

        String wholePath = path + folderNamePath;
        
        Process process = Runtime.getRuntime().exec(wholePath);

        sc.close();
        System.exit(0);
    }
}