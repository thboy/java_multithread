package java_multithreading.io.thboy.github.test1;

public class TheFirstThread {
	public static void main(String[] args) {
		Thread MyThread = new MyThread();
		MyThread.start();
	}

}
class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("hello myThread"+Thread.currentThread().getName());
	}
}
