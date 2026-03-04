class Macete extends Post implements Atividade{
    String frase;

    public Macete(String autor, String materia, String frase) {
        super(autor, materia);
        this.frase = frase;
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Dica de ouro para decorar " + materia + ": " + frase);
    }

    @Override
    public void postar() {
        System.out.println("postar no app");
    }
}