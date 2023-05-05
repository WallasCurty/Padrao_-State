public class PedidoStateIncompleto extends PedidoState{
    private PedidoStateIncompleto() {};
    private static PedidoStateIncompleto instance = new PedidoStateIncompleto();
    public static PedidoStateIncompleto getInstance() {
        return instance;
    }

    public String getState() {
        return "Pedido Incompleto";
    }
}
