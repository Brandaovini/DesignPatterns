public class PlayerEstadoVencer implements PlayerEstado{

    private PlayerEstadoVencer(){}
    private static PlayerEstadoVencer instance = new PlayerEstadoVencer();
    public static PlayerEstadoVencer getInstance(){
        return instance;
    }


    public String getEstado() {
        return "Vencedor";
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

    public String abandonar(Player player){
        player.setEstado(PlayerEstadoAbandonar.getInstance());
        return "Partida Abandonada";
    }

    public String suspender(Player player){
        player.setEstado(PlayerEstadoSuspenso.getInstance());
        return "Player Suspenso";
    }

    public String banir(Player player){
        player.setEstado(PlayerEstadoBanido.getInstance());
        return "Player Banido";
    }
}
