package ilu2;

import java.util.ArrayList;

public class Welcome {
	
	public Welcome() {
		throw new IllegalStateException("Utility class");
	}
	
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
		int nbMinus=0;int nbMaj=0;
		String[] noms=input.split(",");
		String[] nomMinuscule = new String[noms.length] ;
		String[] nomMajuscule = new String[noms.length];
		
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
	
	public static StringBuilder tellNames(String[] nomMinuscule,int nbMinus) {
		String[] nomMin = iterations(restraintTabString(nomMinuscule, nbMinus));
		nbMinus=nomMin.length;
		StringBuilder output = new StringBuilder();
		if (nbMinus==0)
			return output;
		output.append("Hello");
		for(int i=0;i<nbMinus-1;i++)
			output.append(", "+nomMin[i]);
		if (nbMinus>1)
			output.append(" and");
		else
			output.append(",");
		return output.append(" "+nomMin[nbMinus-1]);
	}
	
	public static StringBuilder screamNames(String[] noms,int nbMaj) {
		String[] nomMaj = iterations(restraintTabString(noms, nbMaj));
		nbMaj=nomMaj.length;
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
	
	
	public static String[] listWithoutRep (String[] noms) {
		int lengthList=0;
		ArrayList<String> nomsSansIter = new ArrayList<>();
		for (int i=0;i<noms.length;i++) {
			if (nomsSansIter.isEmpty()|| !nomsSansIter.contains(noms[i])) {
				nomsSansIter.add(noms[i]);
				lengthList++;
			}
		}
		String[] sansIter = new String[lengthList];
		int i=0;
		for (String nom : nomsSansIter) {
			sansIter[i]=nom;
			i++;
		}
		return sansIter;
	}
	
	public static int[] countRepetitions (String[] noms, String[] nomsSansIter) {
		int[] compteur = new int [nomsSansIter.length];
		for (int i=0;i<compteur.length;i++) {
			compteur[i]=0;
		}
		for (int i=0;i<nomsSansIter.length;i++)
			for (int j=0;j<noms.length;j++) {
				if (noms[j].equals(nomsSansIter[i]))
					compteur[i]++;
			}
		return compteur;
	}
	
	public static String[] namesWithNumIter (String [] noms, int [] compte) {
		String[] nomsUpdate = new String [noms.length];
		for(int i=0;i<noms.length;i++) {
			if (compte[i]==1)
				nomsUpdate[i]=noms[i];
			else 
				nomsUpdate[i]=noms[i]+" (*"+compte[i]+")";
		}
		return nomsUpdate;
	}
	
	public static String[] iterations (String[] noms){
		String[] nomsSansIterations = listWithoutRep(noms);
		int[] compteur= countRepetitions(noms, nomsSansIterations);
		return namesWithNumIter(nomsSansIterations, compteur);
	}
	
	public static String[] restraintTabString (String[] tab , int longNewTab) {
		String[] newTab= new String[longNewTab];
		for ( int i=0;i<longNewTab;i++) {
			newTab[i]=tab[i];
		}
		return newTab;
	}


}