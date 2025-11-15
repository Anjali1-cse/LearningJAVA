
public class DemoArray {

	public static void main(String[] args) {
		//if we donot pass value to this array an exception is generated
		 System.out.println(args[0]);
		int [] num;
	      num = new int[3];

	      num[0]=10;
	      num[1]=20;
	      num[2]=30;
	      //num[3]=40; Exception
	      System.out.println(num[0]);
	      System.out.println(num[1]);
	      System.out.println(num[2]);

	      
	      //way 2
	      float[]marks = new float[2];
	       marks[0]=58.2f;
	       marks[1]=88.2f;
	       
	      // way 3
	       String[] subjects = {"java","DBT"};
	       
	       System.out.println(subjects[0]);
	       System.out.println(subjects[1]);
	       
	       for(int i = 0; i< subjects.length;i++ ) {
	    	   System.out.println(subjects[i]);
		       
	       }
	       
	       // enhanced loop
	       for(String s : subjects) {
	    	   System.out.println(s);
	       }
	}

}
