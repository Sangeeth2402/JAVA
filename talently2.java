import java.util.*;
class talently2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),b=1,i;
        for(i=1;i<=a;i++){
           b=i*b; 
        }System.out.println(b);
    }    
}
