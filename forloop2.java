import java.util.Scanner;
class forloop2 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int a=scan.nextInt();
            int sum=0;
            for(int i=1;i<=a;i++){
                sum=sum+i;
            }
            System.out.println(sum);
        }   
}
