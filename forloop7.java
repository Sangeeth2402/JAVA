import java.util.Scanner;
class forloop7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),sum=0;
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                
                System.out.println(i);
            }
        }
    }    
}
