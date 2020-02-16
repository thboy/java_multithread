package java_multithreading.io.thboy.github.test2;

public class Study2 {
	public static void main(String[] args) {
		Thread MyThread = new MyThread();
		for(int i = 0; i < 2 ; i++) {
			MyThread.start();
		}
	}
	

}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("hello myThread"+Thread.currentThread().getName());
	}

}