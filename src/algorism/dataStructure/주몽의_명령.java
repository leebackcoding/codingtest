package algorism.dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class 주몽의_명령 {
    public static void main(String[] args) {
        /*
            갑옷을 만들 것이다. 갑옷을 만드는 재료들은 각각 고유한 번호가 있고, 갑옷은 2개의 재료로 만드는데
            2가지 재료의 고유한 번호를 합쳐 M(1 <= M <= 10000000)이 되면 갑옷이 만들어진다는 사실을 발견했다.
            자신이 만들고 있는 재료로 갑옷을 몇 개나 만들 수 있는지 궁금해서 N(1<= N <= 15000)개의 재료와
            M이 주어졌을 때 몇 개의 갑옷을 만들지 있는지 구하는 프로그램을 작성하시오.
            예)
            6 // N(재료의 개수)
            9 // M(갑옷이 완성되는 번호의 합)
            2 7 4 1 5 3 (재료들)
         */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] num = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++){
            num[i] = sc.nextInt();
        }
        int start_idx = 0;
        int end_idx = 1;
        Arrays.sort(num);
        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                int sum = num[i] + num[j];
                if(sum == M) {
                    count++;
                }else if(sum > M) {
                    break;
                }
            }
            if(num[i] > M){
                break;
            }
        }
        System.out.println(count);
    }
}
