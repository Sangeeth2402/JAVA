import java.util.Scanner;
class if1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a<0){
            System.out.println("NUMBER IS NEGATIVE");
        }else if(a>0){
            System.out.println("NUMBER IS POSITIVE");
        }
    }
}
