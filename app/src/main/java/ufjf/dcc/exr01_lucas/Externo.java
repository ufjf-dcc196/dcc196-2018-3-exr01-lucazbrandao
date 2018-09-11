package ufjf.dcc.exr01_lucas;

public class Externo {
    String nome;
    String email;

    Externo() {
        this.nome = null;
        this.email = null;
    }

    public void registrarExterno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
