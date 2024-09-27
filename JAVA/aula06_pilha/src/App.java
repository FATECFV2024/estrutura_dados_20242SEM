import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Stack<String> pilha_pratos = new Stack<>();

        // adicionando pratos
        pilha_pratos.push("Prato Laranja");
        pilha_pratos.push("Prato Azul");
        pilha_pratos.push("Prato Verde");
        pilha_pratos.push("Prato Vermelho");

        // tamanho da pilha
        int tam = pilha_pratos.size();
        System.out.println("O tamanho da pilha é: " + tam);

        // verificar o topo da pilha
        String topo = pilha_pratos.peek();
        System.out.println("O elemento que está no topo é: " + topo);

        // removendo o elemento que está no topo
        String rem = pilha_pratos.pop();
        System.out.println("O elemento removido foi: " + rem);

        // verificar o topo da pilha
        topo = pilha_pratos.peek();
        System.out.println("O elemento que está no topo é: " + topo);

        //Verificar se a pilha esta vazia
        Boolean vazio = pilha_pratos.isEmpty();
        System.out.println("A pilha esta vazia: " +vazio);

        //Imprimindo a pilha
        System.out.println(pilha_pratos.toString());

        System.out.println("Utilizando Conceito LIFO (Ultimo a Entrar, Primeiro a Sair)");

        for (int i=pilha_pratos.size()-1;i>=0;i--){
            System.out.println(pilha_pratos.get(i));
        }
    }
}
