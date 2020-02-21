package Exam.com;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int i,n=1;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("\n1.Create File:\n2.Print File:\n3.Word Count:\n4.Exit:\n");
            i=in.nextInt();
            switch (i){
                case 1:
                    Create_file cf=new Create_file();
                    cf.Create();
                    break;
                case 2:
                    Print_File p_F=new Print_File();
                    p_F.Print();
                    break;
                case 3:
                    Word_count w_c=new Word_count();
                    w_c.Count();
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Error Try Again");
                    break;
            }
        }while (n==1);
    }
}
