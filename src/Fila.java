public class Fila {
    private Listaligada lista;

    public Fila() {
        this.lista = new Listaligada();
    }

    public void adicionar(String novoValor){
        this.lista.adicionar(novoValor);
    }

    public void remover(){
this.lista.remover(this.get());
    }

    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
}
