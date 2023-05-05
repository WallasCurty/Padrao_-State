public class PedidoStateCadastrado extends PedidoState{
    private PedidoStateCadastrado() {};
    private static PedidoStateCadastrado instance = new PedidoStateCadastrado();
    public static PedidoStateCadastrado getInstance() {
        return instance;
    }

    public String getState() {
        return "Pedido Cadastrado";
    }

    public boolean finalizar(Pedido pedido) {
        pedido.setState(PedidoStateFinalizado.getInstance());
        return true;
    }

    public boolean concluir(Pedido pedido) {
        pedido.setState(PedidoStateConcluido.getInstance());
        return true;
    }

    public boolean terminar(Pedido pedido) {
        pedido.setState(PedidoStateIncompleto.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setState(PedidoStateCancelado.getInstance());
        return true;
    }

    public boolean trocar(Pedido pedido) {
        pedido.setState(PedidoStateTrocado.getInstance());
        return true;
    }
}
