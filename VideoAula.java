class VideoAula extends Post {
    String url;

    public VideoAula(String autor, String materia, String url) {
        super(autor, materia);
        this.url = url;
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Assista ao vídeo de " + materia + " em: " + url);
    }
}