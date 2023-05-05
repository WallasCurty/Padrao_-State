import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void naoDeveCadastrarPedidoQueFoiCadastrado() {
        pedido.setState(PedidoStateCadastrado.getInstance());
        assertFalse(pedido.cadastrar());
    }

    @Test
    public void deveConcluirPedidoCadastrado() {
        pedido.setState(PedidoStateConcluido.getInstance());
        assertTrue(pedido.concluir());
        assertEquals(PedidoStateConcluido.getInstance(), pedido.getState());
    }

    @Test
    public void deveFinalizarPedidoCadastrado() {
        pedido.setState(PedidoStateFinalizado.getInstance());
        assertTrue(pedido.finalizar());
        assertEquals(PedidoStateFinalizado.getInstance(), pedido.getState());
    }

    @Test
    public void deveTerminarPedidoCastrado() {
        pedido.setState(PedidoStateIncompleto.getInstance());
        assertTrue(pedido.terminar());
        assertEquals(PedidoStateIncompleto.getInstance(), pedido.getState());
    }

    @Test
    public void deveCancelarPedidoCastrado() {
        pedido.setState(PedidoStateCancelado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoStateCancelado.getInstance(), pedido.getState());
    }

    @Test
    public void deveTrocarPedidoCastrado() {
        pedido.setState(PedidoStateTrocado.getInstance());
        assertTrue(pedido.trocar());
        assertEquals(PedidoStateTrocado.getInstance(), pedido.getState());
    }

    @Test
    public void deveCadastrarPedidoQueFoiCancelado() {
        pedido.setState(PedidoStateCancelado.getInstance());
        assertTrue(pedido.cadastrar());
        assertEquals(PedidoStateCadastrado.getInstance(), pedido.getState());
    }

    @Test
    public void naoDeveFinalizarPedidoQueFoiCancelado() {
        pedido.setState(PedidoStateCancelado.getInstance());
        assertFalse(pedido.finalizar());
    }

    @Test
    public void naoDeveTrocarPedidoQueFoiCancelado() {
        pedido.setState(PedidoStateCancelado.getInstance());
        assertFalse(pedido.trocar());
    }

    @Test
    public void deveTerminarPedidoQueFoiCancelado() {
        pedido.setState(PedidoStateCancelado.getInstance());
        assertTrue(pedido.terminar());
        assertEquals(PedidoStateIncompleto.getInstance(), pedido.getState());
    }

    @Test
    public void deveCancelarPedidoQueFoiCancelado() {
        pedido.setState(PedidoStateCancelado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoStateCancelado.getInstance(), pedido.getState());
    }

    @Test
    public void naoDeveConcluirPedidoQueFoiCancelado() {
        pedido.setState(PedidoStateCancelado.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void naoDeveCadastrarPedidoFinalizado() {
        pedido.setState(PedidoStateFinalizado.getInstance());
        assertFalse(pedido.cadastrar());
    }

    @Test
    public void naoDeveFinalizarPedidoFinalizado() {
        pedido.setState(PedidoStateFinalizado.getInstance());
        assertFalse(pedido.finalizar());
    }

    @Test
    public void naoDeveCancelarPedidoFinalizado() {
        pedido.setState(PedidoStateFinalizado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveTerminarPedidoFinalizado() {
        pedido.setState(PedidoStateFinalizado.getInstance());
        assertFalse(pedido.terminar());
    }

    @Test
    public void naoDeveConcluirPedidoFinalizado() {
        pedido.setState(PedidoStateFinalizado.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void naoDeveTrocarPedidoFinalizado() {
        pedido.setState(PedidoStateFinalizado.getInstance());
        assertFalse(pedido.trocar());
    }

    @Test
    public void naoDeveCadastrarPedidoTerminado() {
        pedido.setState(PedidoStateIncompleto.getInstance());
        assertFalse(pedido.cadastrar());
    }

    @Test
    public void naoDeveFinalizarPedidoTerminado() {
        pedido.setState(PedidoStateIncompleto.getInstance());
        assertFalse(pedido.finalizar());
    }

    @Test
    public void naoDeveCancelarPedidoTerminado() {
        pedido.setState(PedidoStateIncompleto.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveTerminarPedidoTerminado() {
        pedido.setState(PedidoStateIncompleto.getInstance());
        assertFalse(pedido.terminar());
    }

    @Test
    public void naoDeveConcluirPedidoTerminado() {
        pedido.setState(PedidoStateIncompleto.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void naoDeveTrocarPedidoTerminado() {
        pedido.setState(PedidoStateIncompleto.getInstance());
        assertFalse(pedido.trocar());
    }

    @Test
    public void naoDeveCadastrarPedidoConcluido() {
        pedido.setState(PedidoStateConcluido.getInstance());
        assertFalse(pedido.cadastrar());
    }

    @Test
    public void naoDeveFinalizarPedidoConcluido() {
        pedido.setState(PedidoStateConcluido.getInstance());
        assertFalse(pedido.finalizar());
    }

    @Test
    public void naoDeveCancelarPedidoConcluido() {
        pedido.setState(PedidoStateConcluido.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void deveTerminarPedidoConcluido() {
        pedido.setState(PedidoStateConcluido.getInstance());
        assertTrue(pedido.terminar());
        assertEquals(PedidoStateConcluido.getInstance(), pedido.getState());
    }

    @Test
    public void naoDeveConcluirPedidoConcluido() {
        pedido.setState(PedidoStateConcluido.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void naoDeveTrocarPedidoConcluido() {
        pedido.setState(PedidoStateConcluido.getInstance());
        assertFalse(pedido.trocar());
    }

    @Test
    public void naoDeveCadastrarPedidoTrocado() {
        pedido.setState(PedidoStateTrocado.getInstance());
        assertFalse(pedido.cadastrar());
    }

    @Test
    public void naoDeveFinalizarPedidoTrocado() {
        pedido.setState(PedidoStateTrocado.getInstance());
        assertFalse(pedido.finalizar());
    }

    @Test
    public void naoDeveCancelarPedidoTrocado() {
        pedido.setState(PedidoStateTrocado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveTerminarPedidoTrocado() {
        pedido.setState(PedidoStateTrocado.getInstance());
        assertFalse(pedido.terminar());
    }

    @Test
    public void naoDeveConcluirPedidoTrocado() {
        pedido.setState(PedidoStateTrocado.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void naoDeveTrocarPedidoTrocado() {
        pedido.setState(PedidoStateTrocado.getInstance());
        assertFalse(pedido.trocar());
    }
}
