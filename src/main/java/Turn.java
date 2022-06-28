import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Turn implements Iterable<Creature>{
    private List<Creature> alunos = new ArrayList<Creature>();

    public Turn(Creature... alunos) {
        this.alunos = Arrays.asList(alunos);
    }

    @Override
    public Iterator<Creature> iterator() {
        return alunos.iterator();
    }
}
