import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo {

	public static void main(String[] args) {
		
		Project p = new Project();
		//Class c = p.getClass();
		/*Class c ;
		try {
			c= Class.forName("Project");
			String name = c.getName();
			System.out.println(name);
			
			Method[] m = c.getMethods();
	        for(Method m1: m) {
	        	System.out.println(m1.getName());
	        }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		String name = "Mumbai";
		Class cStr = name.getClass();
		//Field[] f =cStr.getFields();
		Field[] f =cStr.getDeclaredFields();
		
		for(Field f1:f) {
			System.out.println(f1.getName()+" \t \t \t"+ 
		           Modifier.toString(f1.getModifiers()));
		}
		
		System.out.println("=================================");
		
		Method[] ms = cStr.getDeclaredMethods();
		for(Method m : ms) {
		System.out.println(Modifier.toString(m.getModifiers())+
				"   "+ m.getReturnType()+
		        "   "+m.getName());	
		}
		
	}

}
