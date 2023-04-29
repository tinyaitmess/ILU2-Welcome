package ilu2;

public class Welcome {
	
	
	public static String welcome (String input) {
		StringBuilder sortie = new StringBuilder("Hello, ");
		if (input==null || input.trim().equals(""))	
			sortie.append("my friend");
		else if(input.contains(",")) {
			return separerParVirgules(input);
		
		}else if (input.equals(input.toUpperCase()))
			return screamName(input);
		else
			sortie.append(capitaliser(input));
		return sortie.toString();
	}
	
	public static String capitaliser (String input){
		return input.substring(0, 1).toUpperCase()+input.substring(1);
	}
	
	public static String separerParVirgules (String input) {
		int nbMinus=0;
		String[] noms=input.split(",");
		String[] nomMinuscule = new String[noms.length] ;
		String[] nomMajuscule = new String[noms.length];
		int nbMaj=0;
		for(int i=0;i<noms.length;i++) {
			if (!(noms[i].equals(noms[i].toUpperCase()))) {
				nomMinuscule[nbMinus]=capitaliser(noms[i].trim());
				nbMinus++;
			}else {
				nomMajuscule[nbMaj]=noms[i].trim();
				nbMaj++;
			}
		}
		return tellNames(nomMinuscule, nbMinus).append(screamNames(nomMajuscule, nbMaj)).toString();
	}
	
	public static String screamName(String input) {
		StringBuilder output = new StringBuilder("HELLO, ");
		return output.append(input+" !").toString();
	}
	
	public static StringBuilder tellNames(String[] nomMin,int nbMinus) {
		StringBuilder output = new StringBuilder();
		if (nbMinus==0)
			return output;
		output.append("Hello");
		for(int i=0;i<nbMinus-1;i++)
			output.append(", "+nomMin[i]);
		if (nbMinus>1)
			output.append(" and");
		return output.append(" "+nomMin[nbMinus-1]);
	}
	
	public static StringBuilder screamNames(String[] nomMaj,int nbMaj) {
		StringBuilder output = new StringBuilder();
		if (nbMaj==0)
			return output;
		output.append(". AND HELLO");
		for(int i=0;i<nbMaj-1;i++)
			output.append(", "+nomMaj[i]);
		if (nbMaj>1)
			output.append(" AND");
		else
			output.append(",");
		return output.append(" "+nomMaj[nbMaj-1] +" !");
	}
	
}