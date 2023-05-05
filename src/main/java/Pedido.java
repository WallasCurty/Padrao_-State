public class Pedido {
    private String nome;
    private PedidoState state;

    public Pedido() {
        this.state = PedidoStateCadastrado.getInstance();
    }

    public void setState(PedidoState state) {
        this.state = state;
    }

    public boolean cadastrar() {
        return state.cadastrar(this);
    }

    public boolean finalizar() {
        return state.finalizar(this);
    }

    public boolean trocar() {

        return state.trocar(this);
    }

    public boolean terminar() {
        return state.terminar(this);
    }

    public boolean cancelar() {
        return state.cancelar(this);
    }

    public boolean concluir() {

        return state.concluir(this);
    }

    public String getNomeState() {

        return state.getState();
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public PedidoState getState() {

        return state;
    }
}
