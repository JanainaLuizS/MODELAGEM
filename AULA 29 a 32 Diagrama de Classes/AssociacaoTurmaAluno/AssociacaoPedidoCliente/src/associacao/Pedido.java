package associacao;

public class Pedido {

	    private int numero;
	    private double valorTotal;
	    private Cliente cliente; // associação

	    public Pedido(int numero, double valorTotal, Cliente cliente) {
	        this.numero = numero;
	        this.valorTotal = valorTotal;
	        this.cliente = cliente;
	    }

	    public double calcularTotal() {
	        return valorTotal;
	    }

	    public void exibirDados() {
	        System.out.println("Número do Pedido: " + numero);
	        System.out.println("Valor Total: R$ " + valorTotal);

	        System.out.println("Dados do Cliente:");
	        cliente.exibirDados();
	    }

	    // Getters
	    public int getNumero() {
	        return numero;
	    }

	    public double getValorTotal() {
	        return valorTotal;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }
	}


