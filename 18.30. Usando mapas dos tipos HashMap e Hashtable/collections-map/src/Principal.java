import com.algaworks.detran.Carro;
import com.algaworks.detran.Proprietario;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Proprietario maria = new Proprietario("Maria", "05577788899");
        Proprietario ana = new Proprietario("Ana", "33344488811");
        Proprietario jose = new Proprietario("José", "09988877766");
        Proprietario joao = new Proprietario("João", "22233344455");

        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        Map<Carro, Proprietario> proprietarios = new HashMap<>();
//        Map<Carro, Proprietario> proprietarios = new Hashtable<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);

        // Substituição de valor para uma chave
        proprietarios.put(porsche, jose);

        // Remoção de entrada através da chave
//        proprietarios.remove(new Carro("JAV5A67", "XXXX"));

        // Adição de chave nula (HashMap permite, Hashtable não)
//        proprietarios.put(null, joao);
//        proprietarios.put(null, jose);

        // Adição de valor nulo (HashMap permite, Hashtable não)
//        proprietarios.put(porsche, null);
//        proprietarios.put(ford, null);

        // Impressão dos dados do mapa
//        System.out.println(proprietarios);

        // Obtenção de valor pela chave
//        System.out.println(proprietarios.get(new Carro("JAV5A67", "XXXX")));
//        System.out.println(proprietarios.get(new Carro("XXX5A67", "XXXX")));

        // Iteração nas chaves
//        Set<Carro> chaves = proprietarios.keySet();
//        for (Carro carro : chaves) {
//            System.out.println(carro);
//        }

        // Iteração nas chaves
//        for (Carro carro : proprietarios.keySet()) {
//            System.out.println(carro);
//        }

        // Iteração nos valores
//        Collection<Proprietario> proprietariosCollection = proprietarios.values();
//        for (Proprietario proprietario : proprietariosCollection) {
//
//        }

        // Iteração nos valores
//        for (Proprietario proprietario : proprietarios.values()) {
//            System.out.println(proprietario);
//        }

        // Iteração nas chaves para depois obter os valores
//        for (Carro carro : proprietarios.keySet()) {
//            Proprietario proprietario = proprietarios.get(carro);
//            System.out.printf("%s (%s) = %s%n", carro.getPlaca(), carro.getModelo(),
//                    proprietario.getNome());
//        }

        // Iteração nas entradas (pares de chave/valor)
//        for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()) {
//            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(),
//                    entry.getKey().getModelo(), entry.getValue().getNome());
//        }

        // Iteração nas entradas (pares de chave/valor)
        for (var entry : proprietarios.entrySet()) {
            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(),
                    entry.getKey().getModelo(), entry.getValue().getNome());
        }
    }

}