class Macete extends Post {
    String frase;

    public Macete(String autor, String materia, String frase) {
        super(autor, materia);
        this.frase = frase;
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Dica de ouro para decorar " + materia + ": " + frase);
    }
}