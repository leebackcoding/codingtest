package algorism.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 구간합 {

    public static void main(String[] args) {
        /*
        합 배열 공식
        s[i] = s[i - 1] + A[i];
         */
        /*
        수 N개가 주어졌을 때 i번째 수에서 j번째 수까지의 합을 구하는 프로그램을 작성하시오.
        1번째 줄의 수의 개수 N(1 <= N <= 100000), 합을 구해야 하는 횟수 M(1 <= M <= 100000), 2번째 줄에는
        N개의 수가 주어진다. 각 수는 1000보다는 작거나 같은 자연수이다. 3번째 줄부터는 M개의 줄에 합을 구해야
        하는 구간 i와 j가 주어진다.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{

            StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
            //숫자 개수
            int suNo = Integer.parseInt(stringTokenizer.nextToken());
            //질의 개수
            int quizNo = Integer.parseInt(stringTokenizer.nextToken());
            long[] s = new long[suNo + 1];
            stringTokenizer = new StringTokenizer(reader.readLine());
            for(int i = 1 ; i <= suNo; i++){
                s[i] = s[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
            }
            for(int q = 0; q < quizNo; q++) {
                stringTokenizer = new StringTokenizer(reader.readLine());
                int i = Integer.parseInt(stringTokenizer.nextToken());
                int j = Integer.parseInt(stringTokenizer.nextToken());
                System.out.println(s[j] - s[i - 1]);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(reader != null){
                    reader.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
