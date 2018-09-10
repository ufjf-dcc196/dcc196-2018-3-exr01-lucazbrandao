package ufjf.dcc.exr01_lucas;

public class Aluno {
    private String nome;
    private String matricula;

    Aluno () {
        this.nome = null;
        this.matricula = null;
    }

    public void registrarAluno(String name, String mat) {
        this.nome = name;
        this.matricula = mat;
    }
}
