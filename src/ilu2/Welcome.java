package ilu2;

public class Welcome {
	
	
	public static String welcome (String input) {
		StringBuilder sortie = new StringBuilder("Hello, ");
		if (input==null || input.trim()=="")	
			sortie.append("my friend");
		else if(input.contains(",")) {
			String[] noms=input.trim().split(",") ;
			sortie.append(capitaliser(noms[0])+", "+capitaliser(noms[1]));
		
		}else if (input==input.toUpperCase())
			sortie.append(input+" !");
		else
			sortie.append(capitaliser(input));
		return sortie.toString();
	}
	
	public static String capitaliser (String input){
		return input.substring(0, 1).toUpperCase()+input.substring(1);
	}
	
	//public static String separerParVirgules (String input)
	
	
}
