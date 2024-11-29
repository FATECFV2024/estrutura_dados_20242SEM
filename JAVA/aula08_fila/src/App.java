import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando uma fila vazia
        Queue<String> veiculos = new LinkedList<>();

        // adicionar elementos na fila
        veiculos.offer("Gol");
        veiculos.offer("Onix");
        veiculos.offer("Kwid");
        veiculos.offer("HB20");

        // Qual o tamanho estar a fila?
        System.out.println("Quantidade de veículos na fila: " + veiculos.size());

        // A fila esta vazia?// Se sim é TRUE, senão FALSE
        System.out.println("Tem veículos:" + veiculos.isEmpty());

        // Quem está no inicio da fila?
        System.out.println("O veículo " + veiculos.peek() + " está no inicio da fila");
        
        // percorrer uma fila
        for (String carro : veiculos) {
            System.out.println(carro);
        }

        // Remover o elemento no inicio da fila
        System.out.println("Removendo o veículio: " + veiculos.poll());

        System.out.println("Removendo o veículio: " + veiculos.poll());

    }
}
