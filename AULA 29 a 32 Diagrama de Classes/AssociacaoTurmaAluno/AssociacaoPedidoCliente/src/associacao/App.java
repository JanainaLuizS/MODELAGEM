package associacao;

public class App {

	public static void main(String[] args) {
		
			    Cliente cliente1 = new Cliente("Maria Silva", "133.444.777-00");

		        Pedido pedido1 = new Pedido(10, 150.50, cliente1);
		        Pedido pedido2 = new Pedido(11, 280.00, cliente1);

		        pedido1.exibirDados();
		        System.out.println();

		        pedido2.exibirDados();
		    }
		
	}


