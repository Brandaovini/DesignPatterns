import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player;

    @BeforeEach
    public void setUp(){
        player = new Player();
    }

    // Jogo iniciado

    @Test
    public void naoDeveIniciarJogo(){
        player.setEstado(PlayerEstadoStart.getInstance());
        assertEquals("Não iniciado", player.start());
    }

    @Test
    public void deveGanharJogo(){
        player.setEstado(PlayerEstadoStart.getInstance());
        assertEquals("Vencedor", player.vencer());
    }

    @Test
    public void devePerderJogo(){
        player.setEstado(PlayerEstadoStart.getInstance());
        assertEquals("Game Over", player.perder());
    }

    @Test
    public void deveAbandonarJogo(){
        player.setEstado(PlayerEstadoStart.getInstance());
        assertEquals("Partida Abandonada", player.abandonar());
    }

    @Test
    public void deveSuspenderPlayer(){
        player.setEstado(PlayerEstadoStart.getInstance());
        assertEquals("Player Suspenso", player.suspender());
    }

    @Test
    public void deveBanirPlayer(){
        player.setEstado(PlayerEstadoStart.getInstance());
        assertEquals("Player Banido", player.banir());
    }

    // Player Suspenso

    @Test
    public void deverStartaPlayerSuspenso(){
        player.setEstado(PlayerEstadoSuspenso.getInstance());
        assertEquals("Jogo Iniciado", player.start());
    }

    @Test
    public void deveGanharJogoPlayerSuspenso(){
        player.setEstado(PlayerEstadoSuspenso.getInstance());
        assertEquals("Vencedor", player.vencer());
    }

    @Test
    public void deverBanirPlayerSuspenso(){
        player.setEstado(PlayerEstadoSuspenso.getInstance());
        assertEquals("Player Banido", player.banir());
    }

    @Test
    public void devePerderJogoPlayerSuspenso(){
        player.setEstado(PlayerEstadoSuspenso.getInstance());
        assertEquals("Game Over", player.perder());
    }

    @Test
    public void deverSuspenderPlayerSuspenso(){
        player.setEstado(PlayerEstadoSuspenso.getInstance());
        assertEquals("Suspenção não realizada", player.suspender());
    }

    @Test
    public void deveAbandonarJogoPlayerSuspenso(){
        player.setEstado(PlayerEstadoSuspenso.getInstance());
        assertEquals("Partida Abandonada", player.abandonar());
    }

    // Ganahando Jogo

    @Test
    public void deveGanharPlayerVencedor(){
        player.setEstado(PlayerEstadoVencer.getInstance());
        assertEquals("Vitoria Invalida", player.vencer());
    }

    @Test
    public void deveAbandonarPlayerVencedor(){
        player.setEstado(PlayerEstadoVencer.getInstance());
        assertEquals("Opção Invalida", player.abandonar());
    }

    @Test
    public void deveBanirPlayerVencedor(){
        player.setEstado(PlayerEstadoVencer.getInstance());
        assertEquals("Opção Invalida", player.banir());
    }
    @Test
    public void deveStartarPlayerVencedor(){
        player.setEstado(PlayerEstadoVencer.getInstance());
        assertEquals("Opção Invalida", player.start());
    }

    @Test
    public void deveSuspenderPlayerVencedor(){
        player.setEstado(PlayerEstadoVencer.getInstance());
        assertEquals("Opção Invalida", player.suspender());
    }

    @Test
    public void devePerderJogoPlayerGanho(){
        player.setEstado(PlayerEstadoVencer.getInstance());
        assertEquals("Opção Invalida", player.perder());
    }

    // Perdendo Jogo


    @Test
    public void devePerderPlayerPerdedor(){
        player.setEstado(PlayerEstadoPerder.getInstance());
        assertEquals("Opção Invalida", player.perder());
    }

    @Test
    public void deveAbandonarPlayerPerdedor(){
        player.setEstado(PlayerEstadoPerder.getInstance());
        assertEquals("Opção Invalida", player.abandonar());
    }

    @Test
    public void deveBanirPlayerPerdedor(){
        player.setEstado(PlayerEstadoPerder.getInstance());
        assertEquals("Player Banido", player.banir());
    }
    @Test
    public void deveStartarPlayerPerdedor(){
        player.setEstado(PlayerEstadoPerder.getInstance());
        assertEquals("Jogo Iniciado", player.start());
    }

    @Test
    public void deveSuspenderPlayerPerdedor(){
        player.setEstado(PlayerEstadoPerder.getInstance());
        assertEquals("Player Suspenso", player.suspender());
    }

    @Test
    public void deveVencerJogoPlayerPerdedor(){
        player.setEstado(PlayerEstadoPerder.getInstance());
        assertEquals("Opção Invalida", player.vencer());
    }

}