package proj_engsoft_so;

public class HeapPosition {
    public HeapPosition proximo;
    public int identificacao;
    public int tamVar;
    public boolean pronto;

    public HeapPosition(int identificacao, int tamVar) {
        this.proximo = null;
        this.identificacao = identificacao;
        this.tamVar = tamVar;
    }

}
