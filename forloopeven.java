import java.util.Scanner;
class forloopeven {
        public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           int a=2;
           for(int i=1;i<=100;i++){
            if(i%a==0){
                System.out.println(i);
            }
           }
        }   
}
