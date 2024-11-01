/*
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static final int[][] dyx = new int[][]{
        {0, -1},
        {0, 1},
        {-1, 0},
        {1, 0}
    };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer nm = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nm.nextToken());
        int m = Integer.parseInt(nm.nextToken());

        char[][] matrix = new char[n][];
        for(int i = 0; i < n; i++) {
            matrix[i] = br.readLine().toCharArray();
        }

        System.out.println(BFS(matrix));
    }

    public static int BFS(char[][] matrix) {
        int result = 1, height = matrix.length, width = matrix[0].length;

        if(height == 1 && width == 1) return 1;

        boolean[][][] visited = new boolean[height][width][2];
        List<List<Integer>> queue = new LinkedList<>();
        List<List<Integer>> next = new LinkedList<>();
        List<Integer> first = new ArrayList<>(List.of(0, 0, 1));
        queue.add(first);
        visited[0][0][1] = true;

        while (!queue.isEmpty()) {
            while (!queue.isEmpty()) {
                List<Integer> cur = queue.remove(0);
                int curX = cur.get(0);
                int curY = cur.get(1);
                int curB = cur.get(2);

                visited[curX][curY][curB] = true;

                for(int[] yx : dyx) {
                    int y = yx[0] + curX;
                    int x = yx[1] + curY;

                    if(y == height - 1 && x == width - 1) return result + 1;

                    if(isInbound(y, x, height, width)) {
                        int b = (matrix[y][x] == '1') ? curB - 1 : curB;

                        if(b >= 0 && !visited[y][x][b]) {
                            next.add(new ArrayList<>(List.of(y, x, b)));
                            visited[y][x][b] = true;
                        }
                    }
                }
            }

            while(!next.isEmpty()) {
                queue.add(next.remove(0));
            }
            ++result;
        }

        return -1;
    }

    public static boolean isInbound(int y, int x, int height, int width) {
        return (x >= 0 && x < width) && (y >= 0 && y < height);
    }
}
 */