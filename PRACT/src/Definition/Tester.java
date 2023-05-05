package Definition;
import Definition.AccType;

public class Tester {

	public static void main(String[] args) {
		
		AccType A1 = AccType.valueOf("SAVING");
		AccType A2 = AccType.valueOf("CURRENT");
		AccType A3 = AccType.valueOf("FD");
		AccType A4 = AccType.valueOf("DMAT");
		
		System.out.println(A1.getMinBalance());
		System.out.println(A2.getMinBalance());
		System.out.println(A3.getMinBalance());
		System.out.println(A4.getMinBalance());
	}

}
