import java.util.Scanner;
public class calculator {public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=a+b;
    int d=a-b;
    int e=a/b;
    int f=a*b;
    System.out.println("ADDITION IS "+c);
    System.out.println("SUBRACTION IS "+d);
    System.out.println("DIVISION IS "+e);
    System.out.println("MULTIPLICATION IS "+f);
}
    
}
