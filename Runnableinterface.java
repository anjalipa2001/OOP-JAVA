import java.util.Scanner;
class FibonacciGenerator implements Runnable {
    private int limit;

    public FibonacciGenerator(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci Series:");
        System.out.print(num1 + ", " + num2);

        for (int i = 2; i < limit; i++) {
            int next = num1 + num2;
            System.out.print(", " + next);
            num1 = num2;
            num2 = next;
        }
        System.out.println();
    }
}
class EvenNumberDisplay implements Runnable {
    private int start;
    private int end;

    public EvenNumberDisplay(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Even Numbers within range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Runnableinterface {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit to find fibonacci : ");
		int lim=s.nextInt();
		System.out.println("Enter the range 1 : ");
		int start=s.nextInt();
		System.out.println("Enter the range 2 : ");
		int end=s.nextInt();

        FibonacciGenerator fibonacci = new FibonacciGenerator(lim);
        EvenNumberDisplay even= new EvenNumberDisplay(start,end);

        Thread fThread = new Thread(fibonacci);
		
        Thread eThread = new Thread(even);
        eThread.start();
        fThread.start();
    }
}
