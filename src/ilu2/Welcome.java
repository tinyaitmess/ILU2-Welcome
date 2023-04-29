package ilu2;

public class Welcome {
	
	
	public static String welcome (String input) {
		StringBuilder sortie = new StringBuilder("Hello, ");
		if (input==null || input.trim()=="")	
			sortie.append("my friend");
		else if(input.contains(",")) {
			return separerParVirgules(input);
		
		}else if (input==input.toUpperCase())
			sortie.append(input+" !");
		else
			sortie.append(capitaliser(input));
		return sortie.toString();
	}
	
	public static String capitaliser (String input){
		return input.substring(0, 1).toUpperCase()+input.substring(1);
	}
	
	public static String separerParVirgules (String input) {
		StringBuilder output= new StringBuilder("Hello");
		String[] noms=input.split(",");
		for(int i=0;i<noms.length;i++) {
			output.append(", "+capitaliser(noms[i].trim()));
		}
		return output.toString();
	}
	
	
}
