package java_multithreading.io.thboy.github.test1;
/**
 * �����������ʾ���ʵ�ֶ��̴߳�����--�вι���
 * @author ����
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
