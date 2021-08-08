package proj_engsoft_so;

public class NoFilaCircular {
    public NoFilaCircular proximo;
    public Requisicao dado;

    public NoFilaCircular(Requisicao dado) {
        this.proximo = null;
        this.dado = dado;
    }

}
