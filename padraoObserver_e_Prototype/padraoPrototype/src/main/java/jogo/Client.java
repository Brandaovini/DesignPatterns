
package jogo;

/**
 *
 * @author Mariane Azevedo
 */
public class Client {
    public static void main(String[] args){
        
    //Carregar os diferentes tipos de notas musicais
	TimesParticipantes.carregaTimes();
        
    //Confrontos Oitavas
        System.out.print(" Libertadores 2022 - Confrontos Oitavas - IDA\n");
        TimesParticipantes.getTime("CAP").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("LIB").escreve();
        System.out.print("\n");
             
        TimesParticipantes.getTime("FOR").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("EST").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("CER").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("PAL").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("EME").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("CAM").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("TLM").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("FLA").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("COR").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("BOC").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("TAL").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("COL").escreve();
        System.out.print("\n");
        
         TimesParticipantes.getTime("VEL").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("RIV").escreve();
        System.out.print("\n \n \n");
        
        /*************************************/
        System.out.print(" Libertadores 2022 - Confrontos Oitavas - VOLTA\n");
        TimesParticipantes.getTime("LIB").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("CAP").escreve();
        System.out.print("\n");
             
        TimesParticipantes.getTime("EST").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("FOR").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("PAL").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("CER").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("CAM").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("EME").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("FLA").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("TLM").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("BOC").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("COR").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("COL").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("TAL").escreve();
        System.out.print("\n");
        
        TimesParticipantes.getTime("RIV").escreve();
        System.out.print(" vs ");
        TimesParticipantes.getTime("VEL").escreve();
        System.out.print("\n \n");

    }
    
}
