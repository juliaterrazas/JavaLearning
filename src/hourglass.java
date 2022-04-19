import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class hourglass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int sumTemp=0;
        int sumMax =-100;
        bufferedReader.close();

       // System.out.println(arr.get(0).get(1));
        int err =0;
        for(int a=0;a<arr.size();a++) {
            if (arr.get(a).get(a) <= -9 && arr.get(a).get(a) >= 9 || arr.size()>6) {
                err = 1;
            }
        }
        if(err ==0) {
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < 4; i++) {
                    sumTemp = arr.get(j).get(i) + arr.get(j).get(i + 1) + arr.get(j).get(i + 2) + arr.get(j + 1).get(i + 1) + arr.get(j + 2).get(i) + arr.get(j + 2).get(i + 1) + arr.get(j + 2).get(i + 2);
                    if (sumTemp > sumMax) {
                        sumMax = sumTemp;
                    }
                }
            }
            System.out.println(sumMax);
        }
    }
}
