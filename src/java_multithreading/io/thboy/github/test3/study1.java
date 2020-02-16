package java_multithreading.io.thboy.github.test3;

class MyThread extends Thread{
	private int count = 50;
	@Override
	synchronized public void run() {
		count--;
		System.out.println(Thread.currentThread().getName()+":.."+count);
	}
}
public class study1 {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		
		for (int i = 0; i < 30; i++) {
			Thread thread = new Thread(myThread,"i+"+i);
			thread.start();
		}
	}

}
