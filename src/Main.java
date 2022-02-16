
public class Main extends Exception{
	
	public static void throwException(String message) throws Exception {
		throw new Exception(message);
	}
	
	
	public static void iterate() throws Exception {
		for (int i = 0; i < 10; ++i) {
			throwException("Exception:  Number is " + i);
			
	}
	}
	
	public static void uncheckedIterate(Object a) {
		for (int i = 0; i < 10; ++i) {
			System.out.println(a.toString());
		}
	}
}