package Exam.com;
import java.io.FileInputStream;
import java.util.Scanner;

public class Print_File{
    public void Print(){
        String filepath;
        Scanner in=new Scanner(System.in);
        try {
            System.out.println("Enter Filepath:");
            filepath=in.nextLine();
            FileInputStream fileInputStream=new FileInputStream(filepath);
            int i;
            while ((i=fileInputStream.read())!=-1)
                System.out.print((char)i);
            fileInputStream.close();
        }catch (Exception e){
            System.out.println("Enter Correct filepath");
        }
    }
}
