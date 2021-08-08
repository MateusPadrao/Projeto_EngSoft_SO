package proj_engsoft_so;

public class Pilha {
    public int tamanhoTotal;
    public int tamanhoDisp;
    public NoPilha base;
    public NoPilha topo;

    public Pilha(int tamanhoTotal) {
        this.base = null;
        this.topo = null;
        this.tamanhoTotal = tamanhoTotal;
        this.tamanhoDisp = tamanhoTotal;
    }

    public boolean vazia() {
        if (base == null && topo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void empilha(int identificacao, int tamVar) {
        // push
        if (vazia()) {
            if (tamVar <= tamanhoDisp) {
                NoPilha novo = new NoPilha(identificacao, tamVar);

                tamanhoDisp -= tamVar;


                base = novo;
                topo = novo;
            }
            
        }
    }

    public Object desempilha() {
        //pop
        if (this.vazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }


}
