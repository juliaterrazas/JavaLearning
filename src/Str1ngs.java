import java.util.Scanner;

public class Str1ngs {
//    private int st;

    public Str1ngs(String st0){
        String stOdd ="";
        String stEven ="";

        for(int i =0;i < st0.length(); i++){
            if(i%2 ==0){
                stEven = stEven + st0.charAt(i);
            }
            else {
                stOdd = stOdd + st0.charAt(i);
            }

        }
        System.out.println(stEven+" "+stOdd);

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        String ST[] = new String[T];
        for (int i = 0; i < T; i++) {
            ST[i] = sc.nextLine();
            //System.out.println();
        }
        sc.close();

        for (int i = 0; i < T; i++) {
           new Str1ngs(ST[i]);
        }
    }
}
