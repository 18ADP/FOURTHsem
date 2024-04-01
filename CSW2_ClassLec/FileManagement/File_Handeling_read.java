package FileManagement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Handeling_read {
    public static void main(String[] args) {
        try{
        File f=new File("/workspaces/FOURTHsem/CSW2_ClassLec/FileManagement/handelingFile.txt");
        Scanner sc=new Scanner(f);
        while (sc.hasNextLine()) {
            String data=sc.nextLine();
            System.out.println(data);
            
        }sc.close(); 
    }  catch(FileNotFoundException e){
        System.out.println("AN error has occured.");  
}
    }
}
/*Output:
Helllo
hii
ok
bye
chalo
goodnight
 */
    

    

