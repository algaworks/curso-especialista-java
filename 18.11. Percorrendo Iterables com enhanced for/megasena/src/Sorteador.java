import java.util.Iterator;

public class Sorteador implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return new SorteadorIterator();
    }

}
