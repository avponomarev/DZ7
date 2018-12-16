public class Cycle {
        public static void main(String[] args) throws InterruptedException {
            for (int i = 1; i <= 50; i++) {
                System.out.print(i + " ");
                Thread.sleep(220);
            }
        }
    }
