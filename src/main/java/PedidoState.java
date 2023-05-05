public abstract class PedidoState {
    public abstract String getState();

    public boolean cadastrar(Pedido pedido) {
        return false;
    }

    public boolean concluir(Pedido pedido) {
        return false;
    }
    public boolean finalizar(Pedido pedido) {
        return false;
    }
    public boolean terminar(Pedido pedido) {
        return false;
    }
    public boolean cancelar(Pedido pedido) {
        return false;
    }
    public boolean trocar(Pedido pedido) {
        return false;
    }
}
