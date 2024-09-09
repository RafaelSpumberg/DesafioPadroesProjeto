import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String> {
    private static LogSimples instanciaUnica;
    private List<String> mensagens;
    private LogSimples() {
        mensagens = new LinkedList<>();
    }

    public static LogSimples getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new LogSimples();
        }
        return instanciaUnica;
    }

    public void log(String m) {
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
