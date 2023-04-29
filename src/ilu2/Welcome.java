package ilu2;

public class Welcome {
	
	
	public static String capitaliser (String input){
		return input.substring(0, 1).toUpperCase()+input.substring(1);
	}
	public static String welcome (String input) {
		StringBuilder sortie = new StringBuilder("Hello, ");
		sortie.append(capitaliser(input));
		return sortie.toString();
	}

}
