package imitacao;
/**
 *
 * @author Mariane Azevedo
 */
import java.util.Observable;

public class Comando extends Observable implements Acao {
    private String acao = "";
    public void vivo() {
        acao = "vivo";
        System.out.println("Adulto da o comando vivo:");
        this.mudaEstado();
    }
    
    public void morto() {
        acao = "morto";
        System.out.println("Adulto da o comando morto:");
        this.mudaEstado();
    }
        
    public void sentar() {
        acao = "sentar";
        System.out.println("Adulto da o comando sentar:");
        this.mudaEstado();
    }

   
    public void pular() {
        acao = "pular";
        System.out.println("Adulto da o comando pular:");
        this.mudaEstado();
    }
    
    public void mudaEstado(){
        setChanged(); // Mudou o estado
        notifyObservers(acao); // Notifica os observadores
    }



}
