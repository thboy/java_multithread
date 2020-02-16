package java_multithreading.io.thboy.github.test1;
/**
 * 这个类用于演示如何实现多线程传参数--有参构造
 * @author 磊磊
 *
 */
public class study1 {
	public static void main(String[] args) {
		String age = new String("12");
		ThreadA a = new ThreadA(age);
		a.start();
	}

}

class ThreadA extends Thread{
	
	private String age;
	
	public ThreadA(String age) {
		this.age = age;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("age="+age);
		
	}
	
}
