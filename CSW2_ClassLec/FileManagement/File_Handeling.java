package FileManagement;

import java.io.File;
import java.io.IOException;

class File_Handeling {
    public static void main(String[] args) {
        try{
            File obj=new File("filehandeling.txt");
            if(obj.createNewFile()){
                System.out.println("File created: "+obj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
            
        }catch(IOException e){
            System.out.println("An error has occured.");
        }
    }

    
}
/*Output:
if file doesn't exists. =>
 * File created: myfile.txt
if file already exists. =>
 * File already exists.
 */