package ReviewClass;



import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesDemo1 {
    public static void main(String[] args) throws FileNotFoundException {

        String path="src/ReviewClass/Notes.txt";

        File file=new File(path);


        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }


    }

}
