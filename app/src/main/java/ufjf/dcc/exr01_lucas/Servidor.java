package ufjf.dcc.exr01_lucas;

public class Servidor {
    String nome;
    String SIAPE;

    Servidor() {
        this.nome = null;
        this.SIAPE = null;
    }

    public void registrarServidor(String nome, String siape) {
        this.nome = nome;
        this.SIAPE = siape;
    }
}
