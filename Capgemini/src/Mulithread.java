public class Mulithread {
    public static class ChildThread1 implements Runnable {
        public void run(){
            for (int i = 0; i < 100; i++){
                System.out.println("child 1 " + i);
            }
        }
    }
    public static class ChildThread2 extends Thread{
        public void run(){
         for(int i = 0; i < 100; i++){
             System.out.println("child 2 " + i);
         }
        }
    }
        public static void main(String[] args) {
        ChildThread1 obj = new ChildThread1();
        Thread t1 = new Thread(obj);
        t1.start();
        ChildThread2 t2 = new ChildThread2();
        t2.start();
            for (int i = 1; i < 100; i++){
                System.out.println("main " + i);
            }
        }
}
