import java.util.Scanner;
class forloop4 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int a=scan.nextInt();
            int sum=0;
            for(int i=1;i<=a;i++){
                if(i%2==0){
                    sum=sum+i;
                }
            }System.out.println(sum);
        }   
}
