import java.util.*;

public class Dictionaries {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> contacto = new HashMap<String, Integer>();
        List<String> nombres = new ArrayList<String>();
        int n = in.nextInt();
        int cnt=0;
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contacto.put(name,phone);


        }
        while(in.hasNext()){
            String s = in.next();
            nombres.add(s);
            cnt++;
            // Write code here
        }
        in.close();
         for(int i=0; i<cnt;i++){
             if(contacto.containsKey(nombres.get(i))){
                 System.out.println(nombres.get(i)+"="+contacto.get(nombres.get(i)));
             }
             else{
                 System.out.println("Not found");
             }
         }
    }


}
