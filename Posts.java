abstract class Post {
    String autor;
    String materia;
    String data;

    public Post(String autor, String materia) {
        this.autor = autor;
        this.materia = materia;
        this.data = "04/03/2026";
    }

    // MÉTODO ABSTRATO: Cada filha vai decidir como mostrar seu conteúdo
    public abstract void exibirConteudo();
}