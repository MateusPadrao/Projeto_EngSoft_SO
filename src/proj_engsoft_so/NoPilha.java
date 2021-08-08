package proj_engsoft_so;

public class NoPilha {
    public NoPilha proximo;
    public int identificacao;
    public int tamVar;

    public NoPilha(int identificacao, int tamVar) {
        this.proximo = null;
        this.identificacao = identificacao;
        this.tamVar = tamVar;
    }

}
