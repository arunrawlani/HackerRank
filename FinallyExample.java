
public class FinallyExample {
	
	public static void main (String args[]){
		bar();
	}
	
	public static void bar(){
		System.out.println("Enter bar");
		String v = foo();
		System.out.println(v);
		System.out.println("Exit bar");
	}
	
	public static String lem(){
		System.out.println("lem");
		return "return from lem";
	}
	
	public static String foo(){
		int x = 0;
		int y = 5;
		try{
			System.out.println("Enter try");
			int b  = y/x;
			System.out.println("end try");
			return "return from try";
		}
		catch (Exception e){
			System.out.println("catch");
			return lem()+" | returned from catch";
		}
		finally{
			System.out.println("finally");
		}
	}

}