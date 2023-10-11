package algorism.dataStructure;

import java.util.Scanner;

public class D01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        int[] A = new int[N];
//        for(int i = 0; i < N; i++){
//            A[i] = sc.nextInt();
//        }
        long sum = 0;
        long max = 0;

        for(int i = 0; i < N; i++){
//            if(A[i] > max) max = A[i];
            int temp = sc.nextInt();
            if(temp > max) max = temp;
            sum = sum + temp;
        }

        System.out.println(sum * 100.0 / max / N);
    }
}
