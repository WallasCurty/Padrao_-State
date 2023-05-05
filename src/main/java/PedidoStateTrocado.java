public class PedidoStateTrocado extends PedidoState{
    private PedidoStateTrocado() {};
    private static PedidoStateTrocado instance = new PedidoStateTrocado();
    public static PedidoStateTrocado getInstance() {
        return instance;
    }

    public String getState() {
        return "Trocado";
    }
}
