import java.util.Iterator;

public class Combat {
    public static Integer contarAlunosAtivosCurso(Turn curso) {
        int quantidade = 0;
        for (Creature aluno : curso) {
            if (aluno.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalAlunosCurso(Turn curso) {
        int quantidade = 0;
        for (Iterator a = curso.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
