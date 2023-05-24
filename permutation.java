public class Main {
 
    static int[] arr = {1, 2, 3}; // 입력
    static int[] result = new int[3]; // 결과를 담을 배열
    static boolean[] visit = new boolean[4]; // 방문 여부
 
    public static void recur(int cnt) {
        if (cnt == 3) { // 종료조건: 3개의 요소를 모두 채워 넣었을 때.
            for (int i = 0; i < 3; i++) {
                System.out.print(result[i]);
            }
            System.out.println();
            return;
        }
 
        for (int i = 0; i < 3; i++) {
            if (visit[arr[i]] == false) { // 아직 사용하지 않은 요소에 대하여
                visit[arr[i]] = true;
                result[cnt] = arr[i];
                recur(cnt + 1); // 재귀 실행
                visit[arr[i]] = false;
            }
        }
    }
 
    public static void main(String[] args) {
        recur(0);
    }
}


//순열을 구하는 코드//


import java.io.*;

public class Main{
    static int[] perm;
    static int n = 4;
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        perm = new int[]{1, 2, 3, 4};

        while(get_next_perm()){
            for(int num : perm){
                bw.write(String.valueOf(num) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }

    private static boolean get_next_perm(){
        int i = n-1;

        // 뒤에서부터 체크하여 현재 위치가 뒤에서부터 오름차순이 아닌 경우를 찾음
        // 뒤에서부터 오름차순이라는 것은 사전 순으로 최종 수열이라는 의미임
        while(i > 0 && perm[i-1] >= perm[i]) i--;

        // 이미 자체적으로 최종 순열이라면, false를 반환
        if(i <= 0) return false;

        // j는 현재 i-1위치에서 시작.
        // i-1 이후의 모든 숫자 중 큰 것을 고르는데 그 중, j의 값이 가장 큰 경우로 선택
        int j = i-1;
        while(j < n-1 && perm[j+1] > perm[i-1]) j++;

        // j와 i-1번째의 숫자를 swap
        swap(i-1, j);

        // i번째부터 이후의 모든 숫자를 뒤집음
        // i~n-1 사이의 숫자를 상호 뒤집어야 하므로 j 값을 n-1로 초기화
        j = n-1;
        while(i < j){
            swap(i, j);
            i+=1; j-=1;
        }
        return true;
    }

    private static void swap(int i, int j){
        int temp = perm[i];
        perm[i] = perm[j];
        perm[j] = temp;
    }
}