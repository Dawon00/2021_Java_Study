package tutorial10;

public class Main2 {

	//문자열중 마지막 글자
	
	public static char function(String input) {
		return input.charAt(input.length() -1);
	}
	
	public static void main(String[] args) {


		System.out.println(function("Hello World"));
	}

}
