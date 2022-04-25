package TD1GestionExceptionSurFichier;

import java.io.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String FolderDirectory = "src" + File.separator + "TD1GestionExceptionSurFichier" + File.separator; // Chemin d'accès au dossier où seront enregistrés les fichiers txt

        File folder = new File(FolderDirectory + "TXTfolder");

        folder.mkdir();

        System.out.println(folder.getParent());


//
//        String FileDirectory = folder + File.separator; // Chemin d'accès au fichier où seront enregistrer les txt
//        File fichier = new File(FileDirectory + "test.txt");
//
//
//
//        FileOutputStream fos = null;
//        FileInputStream fis = null;
//
//        try {
//            fichier.createNewFile();
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage()); // pas d'exception FileAlreadyExists
//        }
//
//

//        // Path outPath = outputFile.toPath();
//        Path test = Paths.get("java.txt");
//
//        try {
//            // Create the empty file with default permissions,
//                    Files.createFile(test);
//        }
//        catch (FileAlreadyExistsException fae) {
//            System.err.format("file named %s alreadyexists%n", ch);
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }


//        try{
//            fos = new FileOutputStream("Output.txt");
//
//        }catch (IOException fae){
//            System.err.format("aaaaa");
//        }
//
//        System.out.println("\n\n");
//
//        try {
//            fis = new FileInputStream("Input.txt");
//        }catch (FileNotFoundException ae){
//            System.err.format("File not found" );
//        }

    }
}
