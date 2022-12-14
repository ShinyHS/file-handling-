import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class ex1{
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
         * Create -c 
         * Read -r
         * Update -u
         * Delete -d
         */

         //Create
        //  File f=new File("Sample.txt");
        //  if(f.createNewFile()){
        //     System.out.println("File Created");
        //  }
        //  else{
        //     System.out.println("File not created");
        //  }


        //Reading
        // File f=new File("Sample.txt");
        // Scanner read=new Scanner(f);
        // while(read.hasNextLine()){
        //     System.out.println(read.nextLine());
        // }


        //Write
        FileWriter fw=new FileWriter("Sample2.txt");
        fw.write("Hello World");
        fw.close();

        ///Update
        // FileWriter fw=new FileWriter("Sample.txt",true);
        // for(int i=1;i<=100;i++){
        //     fw.write("Hello "+i+"\n");
        // }
        // fw.close();


        //Thread.sleep(2000);//Makes the program wait for 2000 milliseconds

        //Delete
        File f=new File("Sample2.txt");
        if(f.delete()){
            System.out.println("File Deleted");
        }
        else{
            System.out.println("Cannot Delete the specified file");
        }
    }
}