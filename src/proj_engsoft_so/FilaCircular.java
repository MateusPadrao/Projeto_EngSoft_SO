package proj_engsoft_so;

public class FilaCircular {

    private NoFilaCircular inicio;
    private NoFilaCircular fim;

    public FilaCircular() {
        inicio = null;
        fim = null;
    }

    public boolean vazia() {
        if (inicio == null && fim == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addReq(Requisicao req) {
        NoFilaCircular novo = new NoFilaCircular(req);

        if (vazia()) {
            inicio = novo;
            fim = novo;
            fim.proximo = inicio;
        } else {
            novo.proximo = inicio;
            fim.proximo = novo;
            fim = novo;
        }
    }

    public void removerReq() {
        if (vazia()) {
            System.out.println("Fila fazia.");
        } else if (inicio == fim) {
            inicio = null;
            fim = null;
            System.out.println("O úncio nó da fila foi removido.");
        } else {
            fim = inicio;
            inicio = inicio.proximo;
            fim.proximo = inicio;
            System.out.println("Removido com sucesso.");
        }
    }

}
