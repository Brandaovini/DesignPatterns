public class PlayerEstadoPerder  implements PlayerEstado{
    private PlayerEstadoPerder(){}
    private static PlayerEstadoPerder instance = new PlayerEstadoPerder();
    public static PlayerEstadoPerder getInstance(){
        return instance;
    }


    public String getEstado() {
        return "Game Over";
    }

    public String start(Player player) {
        return "Não iniciado";
    }


    public String vencer(Player player) {
        player.setEstado(PlayerEstadoVencer.getInstance());
        return "Vencedor";
    }

    public String perder(Player player){
        player.setEstado(PlayerEstadoPerder.getInstance());
        return "Game Over";
    }

    @Override
    public String suspender(Player player) {
        return null;
    }

    public String abandonar(Player player){
        player.setEstado(PlayerEstadoAbandonar.getInstance());
        return "Partida Abandonada";
    }

    public String suspenso(Player player){
        player.setEstado(PlayerEstadoSuspenso.getInstance());
        return "Player Suspenso";
    }

    public String banir(Player player){
        player.setEstado(PlayerEstadoBanido.getInstance());
        return "Player Banido";
    }
}
