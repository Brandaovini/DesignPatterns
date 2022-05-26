public interface PlayerEstado {

    String getEstado();
    String start(Player player);
    String abandonar(Player player);
    String banir(Player player);
    String perder (Player player);
    String suspender (Player player);
    String vencer(Player player);


}
