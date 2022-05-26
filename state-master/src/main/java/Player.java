public class Player {

    private String namePlayer;
    private PlayerEstado estado;

    public Player(){
        this.estado = PlayerEstadoStart.getInstance();
    }

    public String start(){
        return estado.start(this);
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public PlayerEstado getEstado() {
        return estado;
    }

    public void setEstado(PlayerEstado estado) {
        this.estado = estado;
    }


    public String vencer() {
        return estado.vencer(this);
    }

    public String perder() {
        return estado.perder(this);
    }

    public String abandonar() {
        return estado.abandonar(this);
    }

    public String suspender() {
        return estado.suspender(this);
    }

    public String banir() {
        return estado.banir(this);
    }
}
