package TP2;
import java.util.*;

public class CombatPokemon {
	
	//Renvoie le multiplicateur de dégats
	
	public int attaque(String type1,String type2) {
		Map<String, List<String>> typeAffinities = new HashMap<>();
		typeAffinities.put("Acier", Arrays.asList("Feu", "Combat", "Fée"));
		typeAffinities.put("Combat", Arrays.asList("Psy", "Fée", "Insecte"));
		typeAffinities.put("Dragon", Arrays.asList("Dragon"));
		typeAffinities.put("Eau", Arrays.asList("Feu", "Terre", "Roche"));
		typeAffinities.put("Electrique", Arrays.asList("Eau", "Vol"));
		typeAffinities.put("Fée", Arrays.asList("Combat", "Poison", "Acier"));
		typeAffinities.put("Feu", Arrays.asList("Plante", "Glace", "Insecte", "Acier"));
		typeAffinities.put("Glace", Arrays.asList("Feu", "Combat", "Roche", "Acier"));
		typeAffinities.put("Insecte", Arrays.asList("Plante", "Psychique"));
		typeAffinities.put("Normal", Arrays.asList());
		typeAffinities.put("Plante", Arrays.asList("Eau", "Terre", "Roche"));
		typeAffinities.put("Poison", Arrays.asList("Plante", "Poison", "Sol"));
		typeAffinities.put("Psy", Arrays.asList("Combat", "Psychique"));
		typeAffinities.put("Roche", Arrays.asList("Eau", "Plante", "Insecte"));
		typeAffinities.put("Sol", Arrays.asList("Feu", "Poison", "Roche", "Acier"));
		typeAffinities.put("Spectre", Arrays.asList("Spectre", "Psychique"));
		typeAffinities.put("Ténèbres", Arrays.asList("Combat", "Fée"));
		typeAffinities.put("Vol", Arrays.asList("Plante", "Electrique"));
		
		//On regardesi type 1 est super efficace sur type2
		List<String> type1Efficace = typeAffinities.get(type1);
		
		if (type1Efficace.contains(type2)) {
			return 2;
		}
		
		//Faire les résistances et les immunitées 
		
		
		
		
		
		
		}
	
	
	
			
}
		
		
			

	


