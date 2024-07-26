import java.util.Scanner;
class vowels 
     {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        int flag=0;
        String s = old.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                flag=1;
            }
            else
            {
                if (s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o' || s.charAt(i) != 'u') {
                    flag=0;
                }
            }
        }
        if(flag==1){
            System.out.println("String contains vowels.");
        }
        else{
            System.out.println("String does not contain vowels.");
        }
    }

}

