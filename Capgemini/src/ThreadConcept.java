public class ThreadConcept {
    public static class Row implements Runnable{
        int[] row1;
        int[] row2;
        int[] result;
        public Row(int[] row1, int[]row2, int[]result){
            this.row1 = row1;
            this.row2= row2;
            this.result = result;
        }

        @Override
        public void run() {
            for(int i = 0; i < row1.length; i++){
                result[i] = row1[i] + row2[i];
            }
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        int cols = 4;
        int[][] A = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,1,1},
                {3,4,1,6},
                {7,8,9,0}
        };

        int[][] B = {
                {2,9,8,7},
                {6,5,4,3},
                {2,1,0,9},
                {8,7,6,5},
                {4,3,2,1}
        };
        int[][] result = new int[rows][cols];
        Thread[] thread = new Thread[rows];
       for(int i = 0; i < rows; i++){
           thread[i] = new Thread(new Row(A[i], B[i],result[i]));
           thread[i].start();
       }

        for (int i = 0; i < rows; i++) {
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


}
