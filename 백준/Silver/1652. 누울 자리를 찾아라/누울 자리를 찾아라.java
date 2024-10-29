import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] room = new char[n][n];
        for (int i = 0; i < n; i++) {
            room[i] = br.readLine().toCharArray();
        }

        int rowCount = 0;
        int colCount = 0;

        // Row check
        for (int i = 0; i < n; i++) {
            int emptyCount = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == '.') {
                    emptyCount++;
                } else {
                    if (emptyCount >= 2) rowCount++;
                    emptyCount = 0;
                }
            }
            if (emptyCount >= 2) rowCount++; // 마지막 열이 비어있는 경우
        }

        // Column check
        for (int i = 0; i < n; i++) {
            int emptyCount = 0;
            for (int j = 0; j < n; j++) {
                if (room[j][i] == '.') {
                    emptyCount++;
                } else {
                    if (emptyCount >= 2) colCount++;
                    emptyCount = 0;
                }
            }
            if (emptyCount >= 2) colCount++; // 마지막 행이 비어있는 경우
        }

        System.out.println(rowCount + " " + colCount);
    }
}