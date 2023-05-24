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
