public class PedidoStateFinalizado extends PedidoState{
    private PedidoStateFinalizado() {};
    private static PedidoStateFinalizado instance = new PedidoStateFinalizado();
    public static PedidoStateFinalizado getInstance() {
        return instance;
    }

    public String getState() {
        return "Pedido Finalizado";
    }
}
