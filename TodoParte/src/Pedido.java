import java.util.Date;

public class Pedido {

    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte

    public Pedido() {
    }

    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return " id= " + id +
                " data= " + data +
                " \n cliente= " + cliente;
    }
}
