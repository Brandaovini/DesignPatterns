
package jogo;

/**
 *
 * @author Mariane Azevedo
 */

import java.util.Hashtable;

public class TimesParticipantes {
    private static Hashtable<String, Partida> timeMap = new Hashtable<String, Partida>();
    
    public static void carregaTimes(){
        //Adiciona todos os tipos de notas à estrutura hashtable
        
        AtleticoMG timeATL = new AtleticoMG();
        timeMap.put("CAM", timeATL);
              
        Boca timeBOCA = new Boca();
        timeMap.put("BOC", timeBOCA);
        
        Colon timeColon = new Colon();
        timeMap.put("COL", timeColon);
        
        Cerro timeCerro = new Cerro();
        timeMap.put("CER", timeCerro);
        
        Corinthians timeCOR = new Corinthians();
        timeMap.put("COR", timeCOR);
        
        Flamengo timeFLA = new Flamengo();
        timeMap.put("FLA", timeFLA);
		
	AtheticoPr timeCAP= new AtheticoPr();
	timeMap.put("CAP", timeCAP);
		
	Libertad timeLIB = new Libertad();
	timeMap.put("LIB", timeLIB);
		
	Emelec timeEME = new Emelec();
	timeMap.put("EME", timeEME);
		
	Velez timeVEL = new Velez();
	timeMap.put("VEL", timeVEL);
		
	Palmeiras timePAL = new Palmeiras();
	timeMap.put("PAL", timePAL);
		
	Estudiantes timeEST = new Estudiantes();
	timeMap.put("EST", timeEST);
        
        Fortaleza timeFOR = new Fortaleza();
        timeMap.put("FOR", timeFOR);
        
        River timeRIV = new River();
        timeMap.put("RIV", timeRIV);
        
        Tolima timeTLM = new Tolima();
        timeMap.put("TLM", timeTLM);
        
        Talleres timeTAL = new Talleres();
        timeMap.put("TAL", timeTAL);

	}
	
	public static Partida getTime(String nome){
		Partida nota = timeMap.get(nome);
		
		return nota.clone();
	}
    
}
