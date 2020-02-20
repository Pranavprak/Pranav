package thread;

public class ThreadEx extends Thread{
	@Override
	public void run(){
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Im running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx t1=new ThreadEx();
		ThreadEx t2=new ThreadEx();
		t1.start();
		//Thread.sleep(100);
		t2.start();
		//t2.join();
		
	}

}
