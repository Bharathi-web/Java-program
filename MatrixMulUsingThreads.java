package JavaTask;

public class MatrixMulUsingThreads {
    public static int M = 3;
    public static int K = 2;
    public static int N = 3;
    public static int [][] A = {{1, 4}, {2, 5}, {3, 6}}; 
    public static int [][] B = {{8, 7, 6}, {5, 4, 3}};    
    public static int [][] C = new int [M][N]; 
    public static WorkerThread [][] Threads = new WorkerThread[3][3]; 
    public static void main(String[] args) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                Threads[i][j] = new WorkerThread(i, j, A, B, C);
                Threads[i][j].start(); 
            }
        }
        try {
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    Threads[i][j].join(); 
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Elements of Matrix C:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("[" + i + "," + j + "] = " + C[i][j]);
            }
        }
    }
    static class WorkerThread extends Thread {
        int i, j;
        int[][] A, B, C;
        public WorkerThread(int i, int j, int[][] A, int[][] B, int[][] C) {
            this.i = i;
            this.j = j;
            this.A = A;
            this.B = B;
            this.C = C;
        }

        @Override
        public void run() {
            for (int k = 0; k < K; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }
}
