import java.util.Scanner;

import jav.util.*;
 class forloop1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int power=1;
        for(int i=1;i<=b;i++){
            power=power*a;
         
        }System.out.println(power);
    }
}
