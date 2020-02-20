package thread;
class A
{
	
}

public class ByRunable extends A implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByRunable r=new ByRunable();
		Thread t=new Thread(r);
		t.start();
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run");
		
	}

}
