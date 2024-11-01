import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) throws Exception {
        // lista_simples();
        // lista_encadeada();

        ListaCircular playlist = new ListaCircular();
        playlist.adicionar("Dani Callifornia - Red Hot Chili Peppers");
        playlist.adicionar("Can't Stop - Red Hot Chili Peppers");
        playlist.adicionar("By the way - Red Hot Chili Peppers");
        playlist.adicionar("Callifornication - Red Hot Chili Peppers");
        playlist.adicionar("Thriller - Michael Jackson");
        playlist.adicionar("Hello - Adelle");
        playlist.adicionar("Que Xou da Xuxa é esse? - Xuxa");

        playlist.percorrer(4);

    }

    public static void lista_encadeada() {
        // Criando uma Lista Encadeada
        LinkedList<String> carros = new LinkedList<>();

        // adicionando itens na lista
        carros.add("Corsa");
        carros.add("Gol");
        carros.add("HB20");
        carros.add("Onix");
        System.out.println("Listar carros:");
        System.out.println(carros.toString());

        // adicionando no inicio da lista
        carros.addFirst("Kwid");
        System.out.println("Listar carros:");
        System.out.println(carros.toString());

        // adicionando no fim da lista
        carros.addLast("Argo");
        System.out.println("Listar carros:");
        System.out.println(carros.toString());

        // removendo elementos
        carros.remove(1);
        System.out.println("Listar carros Removidos:");
        System.out.println(carros.toString());

        // removendo no inicio da lista
        carros.removeFirst();
        System.out.println("Listar carros removidos:");
        System.out.println(carros.toString());

        // removendo no fim da lista
        carros.removeLast();
        System.out.println("Listar carros removidos:");
        System.out.println(carros.toString());

        // consutar um elemento em especifico
        System.out.println("Acesso direto: "+carros.get(0));
        System.out.println("Acessando o 1º item da lista: "+carros.getFirst());
        System.out.println("Acessando o ultimo item da lista: "+carros.getLast());

        //percorrendo uma lista
        System.out.println("Percorrendo uma lista do inicio ao fim");
        ListIterator<String> it = carros.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Percorrendo uma lista do fim ao inicio");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }

    public static void lista_simples() {
        // Criando uma Lista Simples Não Encadeada
        ArrayList<String> frutas = new ArrayList<>();

        ArrayList<String> feira = new ArrayList<>();

        // Adicionando elementos na Lista: ADD
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Melância");
        frutas.add("Uva");

        // Remover elementos: REMOVE(index)
        frutas.remove(1);

        // Consultando elementos de acesso direto: GET(index)
        System.out.println(frutas.get(0));

        // Consultar o tamanho da lista: SIZE()
        System.out.println("O tamanho da lista de frutas tem: " + frutas.size() + " itens");
        System.out.println("O tamanho da lista da 'feira' tem: " + feira.size() + " itens");

        // Verificar se a lista esta vazia: ISEMPTY()
        System.out.println("A Lista de Frutas está vazia: " + frutas.isEmpty());
        System.out.println("A Lista da 'Feira' está vazia: " + feira.isEmpty());

        // Percorrendo uma lista com o FOREARCH
        System.out.println("Lista de Frutas:");
        for (String item : frutas) {
            System.out.println(item);
        }
    }
}
