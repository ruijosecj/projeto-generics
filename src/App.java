import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        ListaGenerics<Carro> garagem = new ListaGenerics<Carro>();

        Carro civic = new Carro(2022, "Civic", "Honda", 4);
        Carro onix = new Carro(2023, "Onix LTZ", "Chevrolet", 4);
        Carro polo = new Carro(2024, "Polo", "Wolkswagen", 4);

        garagem.adicionarCarro(polo);
        garagem.adicionarCarro(civic);
        garagem.adicionarCarro(onix);

        garagem.imprimirCarros();
    }
}
