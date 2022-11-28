package threadDemo;


public class threadExample extends Thread {
	public void run()//override run method
	{
		System.out.println("Started running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadExample t1=new threadExample();
		threadExample t2=new threadExample();
		threadExample t3=new threadExample();
		threadExample t4=new threadExample();
		threadExample t5=new threadExample();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.stop();
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		

	}

}
