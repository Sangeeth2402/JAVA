import java.util.Scanner;
class talently1 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int a=scan.nextInt(),sum=0;
            for(int i=1;i<=100;i++){
                if(i%2!=0){
                    sum=sum+i;
                    System.out.println(i);
                }
            }
        }    
}
