package imitacao;

public class Client {
    
public static void main(String[] args) {
		//Observador
		Execucao execucao = new Execucao();
		
		//Observado
		Comando comando = new Comando();
		
		//Adicionar observador ao observado
		comando.addObserver(execucao);
		
		comando.morto();
                comando.vivo();
                comando.pular();
                comando.sentar();
                comando.vivo();
                comando.morto();
                comando.sentar();

	}

    
}
