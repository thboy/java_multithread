package java_multithreading.io.thboy.github.test1;

import java.util.concurrent.Callable;

/**
 * ʵ�ֶ��̷߳���ֵ
 * @author ����
 *
 */
public class study2 {

	public static void main(String[] args) {
		MyCallable myCallable = new MyCallable("������");
		String call = null;
		try {
			call = myCallable.call();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(call);
	}


}

class MyCallable implements Callable<String>{
	private String name;
	
	public MyCallable(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "call:"+name;
	}
	
}