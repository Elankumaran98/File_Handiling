package Exam.com;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileReader;
public class Word_count {
    public void Count(){
        String filepath;
        Scanner in=new Scanner(System.in);
        try{
            System.out.println("Enter Filepath Address(.txt):");
            filepath=in.nextLine();
            FileReader fileReader=new FileReader(filepath);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String  words[]=null;
            int count=0;
            String s;
            while ((s=bufferedReader.readLine())!=null){
                words=s.split(" ");
                count+=words.length;
            }
            fileReader.close();
            System.out.println("Number of Words in file="+count);
        }catch (Exception e){
            System.out.println("File not found");
        }
    }
}
