import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    static int result=1;
    public static int factorial(int n) {
        // Write your code here
        if(n>1){
            result = result*n;
            factorial(n-1);
        }
        else{
            result = result;
        }

        return result;
    }

}

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        if(n>1 && n<12) {
            int result = Result1.factorial(n);
            System.out.println(result);
        }
//        bufferedWriter.write(String.valueOf(Result1.result));
//        bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}