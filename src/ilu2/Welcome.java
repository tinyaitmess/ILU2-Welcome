package ilu2;

public class Welcome {
	
	
	public static String welcome (String input) {
		StringBuilder sortie = new StringBuilder("Hello, ");
		if (input==null || input.trim()=="")	
			sortie.append("my friend");
		else if(input.contains(",")) {
			return separerParVirgules(input);
		
		}else if (input==input.toUpperCase())
			return screamName(input);
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
		String nomMajuscule=null;
		for(int i=0;i<noms.length;i++) {
			if (noms[i]!= noms[i].toUpperCase())
				output.append(", "+capitaliser(noms[i].trim()));
			else
				nomMajuscule=noms[i].trim();
		}
		if (nomMajuscule!=null)
			output.append(". AND HELLO, "+nomMajuscule+" !");
		return output.toString();
	}
	
	public static String screamName(String input) {
		StringBuilder output = new StringBuilder("HELLO, ");
		return output.append(input+" !").toString();
	}
	
}
