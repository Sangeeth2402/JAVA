import java.util.Scanner;
class whileloop2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int i=1;
        while(i<=a){
            if(i%2==0)
            System.out.println(i);
            i++;
        }
    }    
}
