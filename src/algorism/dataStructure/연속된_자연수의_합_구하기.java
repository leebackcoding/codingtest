package algorism.dataStructure;

import java.util.Scanner;

/*
    투 포인터는 2개의 포인터로 알고리즘의 시간 복잡도를 최적화한다.
    알고리즘이 매우 간단하여 실전 문제를 통해 이해해보자.
 */
public class 연속된_자연수의_합_구하기 {

    public static void main(String[] args) {
        /*
            어떠한 자연수 N은 몇개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은
            어떤 자연수 N(1 <= N <= 10000000)을 몇 개의 연속된 자연수의 합으로
            나타내는 가짓수를 알고 싶다. 이때 사용하는 자연수는 N이어야 한다.
            예를 들어 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5이다.
            반면, 10을 나타내는 방법은 10, 1+2+3+4이다. N을 입력받아
            연속된 자연수의 합으로 나타내는 가짓수를 출력하는 프로그램을 작성하시오.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index != N){
            if(sum == N){
                count++;
                end_index++;
                sum = sum + end_index;
            }else if(sum > N){
                sum = sum - start_index;
                start_index++;
            }else{
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);

    }
}
