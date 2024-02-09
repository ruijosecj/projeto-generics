import java.util.ArrayList;
import java.util.List;

public class ListaGenerics<T extends Carro> {
    private List<T> listaDeCarros;

    public ListaGenerics() {
        listaDeCarros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        listaDeCarros.add(carro);
    }

    public void imprimirCarros() {
        for (T carro : listaDeCarros) {
            System.out.println(carro.getAnoFabricacao());
            System.out.println(carro.getModelo());
            System.out.println(carro.getFabricante());
            System.out.println(carro.getNumeroPortas());
        }
    }
}