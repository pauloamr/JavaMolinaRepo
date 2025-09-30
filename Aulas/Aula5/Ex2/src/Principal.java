import java.util.ArrayList;

public class Principal{
    public static <String> int contarUnicos(ArrayList<String> lista) {
        ArrayList<String> unicos = new ArrayList<>();

        for (String elemento : lista) {
            if (!unicos.contains(elemento)) {
                unicos.add(elemento);
            }
        }

        return unicos.size();
    }

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Laranja");
        frutas.add("Banana");

        System.out.println("Número de elementos únicos: " + contarUnicos(frutas));
    }
}
