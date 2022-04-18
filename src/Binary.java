import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        String bin= new String();
        //System.out.println(bin);
        int cnt1 =0;
        int cntotal =1;
        if(n>=1 && n<=1000000 ) {
            while(n>0){
                int resto = n%2;
                if(resto == 1){
                    cnt1++;
                    if(cnt1>cntotal) {
                        cntotal =cnt1;
                    }
                }
                else{
                    cnt1 =0;
                }
                n=n/2;
                bin = bin+ String.valueOf(resto);
                System.out.println(bin);
            }
            System.out.println(cntotal);
            System.out.println(bin);
        }
    }
}
