public class Programa {

    public static void main(String[] args) {
     Fila fila = new Fila();

     fila.adicionar("João");
        fila.adicionar("José");
        fila.adicionar("Julio");
        fila.adicionar("Maria");
        fila.adicionar("Ana");


        System.out.println("Primeiro da fila: " + fila.get());
        fila.remover();
        System.out.println("Novo Primeiro da fila: " + fila.get());
        fila.remover();
        System.out.println("Novo Primeiro da fila: " + fila.get());
        fila.remover();

    }
}
