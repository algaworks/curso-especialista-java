import java.util.Set;

public class Principal {

    public static void main(String[] args) {
        // Performance é mais importante (não garante a ordem dos elementos)
        Set<Cidade> cidades = null;

        // Performance é importante, mas precisa manter ordem de inserção dos elementos
//        Set<Cidade> cidades = null;

        // Performance é menos importante e precisa manter a ordem natural dos elementos
//        Set<Cidade> cidades = null;

        cidades.add(new Cidade(3170206, "Uberlândia", 706_597));
        cidades.add(new Cidade(3170107, "Uberaba", 340_277));
        cidades.add(new Cidade(3550308, "São Paulo", 12_396_372));
        cidades.add(new Cidade(3106200, "Belo Horizonte", 2_530_701));
        cidades.add(new Cidade(2304400, "Fortaleza", 2_703_391));
        cidades.add(new Cidade(1100205, "Porto Velho", 548_952));

        // TODO Iterar no conjunto de cidades
    }

}
