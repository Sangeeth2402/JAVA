import java.util.Scanner;

class voterifelse{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        if(a<=18){
            System.out.println("YOU ARE NOT ELIGIBLE TO VOTE");
        }        
        else{
            System.out.println("YOU ARE ELIGIBLE TO VOTE");
        }
    }
}