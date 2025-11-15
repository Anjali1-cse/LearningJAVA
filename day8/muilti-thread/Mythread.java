
public class Mythread extends Thread {
	
	@Override
	public void run() {
		Thread  c = Thread.currentThread();// static
		for(int i =1;i<5; i++) {
		System.out.println(i+" "+ c.getName());
		//System.out.println("In run "+ c.getPriority());
		}
	}
	public static void main(String[] args) {
		Mythread  t = new Mythread ();
		t.setName("anjali");
     	//t.setPriority(8);
		//t.setPriority(MAX_PRIORITY);
		t.start();
		
		Mythread  t1 = new Mythread ();
		t1.setName("Hi");
     	//t.setPriority(8);
		//t.setPriority(MAX_PRIORITY);
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}

}
