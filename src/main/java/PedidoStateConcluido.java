public class PedidoStateConcluido extends PedidoState{
    private PedidoStateConcluido() {};
    private static PedidoStateConcluido instance = new PedidoStateConcluido();
    public static PedidoStateConcluido getInstance() {

        return instance;
    }

    public String getState() {

        return "Pedido Concluido";
    }
}
