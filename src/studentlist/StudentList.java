
package studentlist;
import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {
        System.out.println ("hello world");
        Student s1 =new Student("s1","Priyal");
        Scanner input = new Scanner(System.in);
        
        Student[] studentList1=new Student[3];
        studentList1[0]=s1;
        studentList1[1]=new Student("s2","abc");
        studentList1[2]=new Student("s3", "asd");
    }
}
