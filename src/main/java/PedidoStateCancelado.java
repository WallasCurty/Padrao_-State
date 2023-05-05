public class PedidoStateCancelado extends PedidoState{
    private PedidoStateCancelado() {};
    private static PedidoStateCancelado instance = new PedidoStateCancelado();
    public static PedidoStateCancelado getInstance() {
        return instance;
    }

    public String getState() {
        return "Pedido Cancelado";
    }

    public boolean terminar(Pedido pedido) {
        pedido.setState(PedidoStateIncompleto.getInstance());
        return true;
    }
}
