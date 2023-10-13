package algorism.dataStructure;

import java.util.Scanner;

public class 주몽의_명령1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] num = new int[N];
        int start_idx = 0;
        int end_idx = N - 1;
        int count = 0;
        for(int i = 0; i < N; i++){
            num[i] = sc.nextInt();
        }

        while(end_idx >= start_idx){
            int sum = num[start_idx] + num[end_idx];
            if(sum < M){
                start_idx++;
            }else if(sum > M){
                end_idx--;
            }else{
                count++;
                start_idx++;
                end_idx--;
            }
        }
        System.out.println(count);
    }
}
