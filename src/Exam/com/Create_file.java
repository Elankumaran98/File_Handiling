package Exam.com;
import java.io.FileOutputStream;
import java.util.Scanner;
public class Create_file {
    public void Create() {
        String location,text;
        Scanner in=new Scanner(System.in);
        try {
            System.out.println("Enter New filepath:");
            location=in.nextLine();
            FileOutputStream fileOutputStream=new FileOutputStream(location);
            System.out.println("Enter Your Text:");
            text=in.nextLine();
            byte b[]=text.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
            System.out.println("Success.....");
        }catch(Exception e){
            System.out.println("Error...");
        }
    }
}
