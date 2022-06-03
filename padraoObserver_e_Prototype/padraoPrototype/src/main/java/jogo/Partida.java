
package jogo;
/**
 *
 * @author Mariane Azevedo
 */
public abstract class Partida implements Cloneable {
    public Partida clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return (Partida) clone;
    }
    public abstract void escreve();
}
