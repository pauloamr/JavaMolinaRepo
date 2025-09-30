import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) {
        ArrayList<String> itens = new ArrayList<>();

        itens.add("Linha");
        itens.add("Vara");
        itens.add("Molinete");
        itens.add("Anzol");

        System.out.println("Tamanho da lista: " + itens.size());

        String elemento = "Barbante";
        if (itens.contains(elemento)) {
            System.out.println(elemento + " está na lista.");
        } else {
            System.out.println(elemento + " não está na lista.");
        }
    }
}
