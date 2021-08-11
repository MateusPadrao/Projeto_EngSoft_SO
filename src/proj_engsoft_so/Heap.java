package proj_engsoft_so;

public class Heap {
    public static int tamanhoTotal;     // Tamanho total da memória
    public int tamanhoDisp;             // Tamanho atualmente disponível da memória
    public int qtdTotReq;               // Quantidade total de requisições na fila
    public HeapPosition inicio, fim;    // Ponteiro de incio da fila
    public float percentageUT;          // Porcentagem de memória utilizada (0.xx)

    public Heap(int tamanhoTotal, float limRAM, float idealRAM) {
        this.tamanhoTotal = tamanhoTotal;
        this.tamanhoDisp = tamanhoTotal;
    }

    public boolean vazia() {
        if (this.tamanhoDisp == this.tamanhoTotal) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Trás para heap(lista encadeada) a variavel do vetor de requisições(fila circular)
     *
     * @param identificacao
     * @param tamVar
     */
    public void alocador(int identificacao, int tamVar) {
        // alocador
        if (vazia()) {                      // Caso a heap esteja vazia
            if (tamVar <= tamanhoDisp) {
                HeapPosition novo = new HeapPosition(identificacao, tamVar);

                tamanhoDisp -= tamVar;
                //percentageUT = (100 - ((tamanhoDisp * 100)/tamanhoTotal))/100;

                inicio = novo;
                fim = novo;
            } else {
                System.out.println("Erro! Não foi possível inciar a Heap.");
            }

        }
    }

    public void desempilha() {
        //pop

    }


}
