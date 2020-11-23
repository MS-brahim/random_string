package random;

public class randomTest {

	public static void main(String[]args) {
		String[]names;
		names = new String[4];
		names[0] = "AB";
		names[1] = "CD";
		names[2] = "EF";
		names[3] = "GH";
		
		int random = (int) (Math.random()*4);
		
		System.out.println("The chosen name is : " + names[random]);
	}
}
