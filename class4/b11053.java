/*
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[][] longest = new int[n][n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 1;
        for(int i = n - 1; i > -1; i--) {
            Arrays.fill(longest[i], 1);
            int max = 1;
            for(int j = i; j < n; j++) {
                if(arr[i] < arr[j]) {
                    longest[i][j] = longest[j][n - 1] + 1;
                    max = Math.max(max, longest[i][j]);
                }
            }
            longest[i][n - 1] = max;
            result = Math.max(result, max);
        }

        System.out.println(result);
    }
}
 */