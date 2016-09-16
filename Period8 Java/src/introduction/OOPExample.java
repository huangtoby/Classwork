package introduction;

public class OOPExample {

	public static void main(String[] args) {
		
		Student jillian = new Senior("Jillian");
		Student jordan = new Student("Jordan");
		Student joseph = new Student("Joseph");
		
		jillian.talk();
		jordan.talk();
		joseph.talk();
		//casting a Student into a Junior
		((Junior)jordan).showColor();
	}

}
