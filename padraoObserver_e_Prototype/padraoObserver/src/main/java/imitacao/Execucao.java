package imitacao;
/**
 *
 * @author Mariane Azevedo
 */

import java.util.Observable;
import java.util.Observer;

public class Execucao implements Observer, Acao{
    public void vivo() {
        System.out.println("Criancas Ficam de Pé");
    }
    
    public void morto() {
        System.out.println("Criancas deitam");
    }

	public void sentar() {
		System.out.println("Criancas sentam");
	}
	
	public void pular() {
		System.out.println("Criancas Pulam");
	}

	public void update(Observable arg0, Object arg1) {
		Comando comandoObservado = (Comando)arg0;
		String acao = String.valueOf(arg1);
		
		if(acao.equals("vivo")){
			this.vivo();
		}
		else if(acao.equals("morto")){
			this.morto();
		}
		else if(acao.equals("sentar")){
			this.sentar();
		}
		else if(acao.equals("pular")){
			this.pular();
		}
	}
}
