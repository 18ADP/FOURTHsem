package FileManagement;
import java.io.FileWriter;
import java.io.IOException;


public class File_Handeling_Write {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("handeling.txt");
            writer.write("Hello i have written something for you");
            writer.close();
            System.out.println("Successfully Written.");
        }
        catch(IOException e){
            System.out.println("An error has occured.");
        }
    }
}
/*Output:
 * Successfully Written.
 */
//A file is created.