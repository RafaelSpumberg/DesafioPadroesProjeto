public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstancia();
        
        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        // Itera sobre as mensagens e as imprime
        for (String m : log) {
            System.out.println(m);
        }
    }
}
