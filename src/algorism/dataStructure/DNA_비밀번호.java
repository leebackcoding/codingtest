package algorism.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA_비밀번호 {

    static int[] checkArr;
    static int[] myArr;
    static int checkSecret; // 확인 개수
    public static void main(String[] args) throws IOException {
        /*
            백준 온라인 12891번

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(stringTokenizer.nextToken()); // s는 문자열 크기
        int p = Integer.parseInt(stringTokenizer.nextToken()); // p는 부분 문자열 크기

        int result = 0;
        checkArr = new int[4]; // 비밀번호 체크배열
        myArr = new int[4]; // 현재 상태 배열
        char[] a = new char[s]; // 문자열 데이터
        checkSecret = 0; // 확인 갯수


        a = br.readLine().toCharArray();
        stringTokenizer = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(checkArr[i] == 0) {
                checkSecret++;
            }
        }
        for(int i = 0; i < s; i++){
            if(i >= p){
                sub(a[i-p]);
                add(a[i]);
            }else{
                add(a[i]);
            }
            if(i >= p - 1 && (checkSecret == 4)){
                result++;
            }

        }
        System.out.println(result);


    }

    private static void sub(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}
