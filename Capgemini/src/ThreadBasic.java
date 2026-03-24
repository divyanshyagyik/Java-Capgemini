public class ThreadBasic {

    public static class DownLoader implements Runnable {
        public String images;
        public DownLoader(String images){
            this.images = images;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("downloading" + images);
        }

    }
        public static void main(String[] args) {
            String images[] = {"image1","image3","image3"};
            for (int i = 0; i < images.length; i++){
                Thread t = new Thread(new DownLoader(images[i]));
                t.start();
            }
        }
}
