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


public class DataBase {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String Regrex=".+@gmail\\.com$";
        List<String> list= new ArrayList();
        Pattern pattern=Pattern.compile(Regrex);
        for(int i=0;i<n;i++){
            String name=scanner.next();
            String email=scanner.next();
            Matcher matcher=pattern.matcher(email);
            if(matcher.find()){
                list.add(name);
            }
        }
        Collections.sort(list);
        for(String names:list){
            System.out.println(names);
        }
        scanner.close();
    }
}
