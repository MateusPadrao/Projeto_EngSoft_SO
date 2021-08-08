package proj_engsoft_so;

import java.util.Random;

public class GeradorRandomReqs {

    public int tam_min, tam_max, quantidade, id_min;
    public FilaCircular vetorReq;
    Random rand = new Random();

    /**
     * MISSING DESC
     *
     * @param tam_min    Tamanho mínimo da quantidade de memória necessária por requisição
     * @param tam_max
     * @param quantidade
     * @param vetorReq
     */
    public GeradorRandomReqs(int tam_min, int tam_max, int quantidade, FilaCircular vetorReq) {
        this.tam_min = tam_min;
        this.tam_max = tam_max;
        this.quantidade = quantidade;
        this.vetorReq = vetorReq;
        this.id_min = 0;
    }

    /**
     * Gera requisições
     *
     * @param quantidade número de requisições que serão geradas
     * @return retorna o vetor de requisições que estarão as requisições inseridas
     */
    public FilaCircular gerar(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            int tam = rand.nextInt((tam_max - tam_min) + 1) + tam_min;
            int id = id_min;
            id_min++;
            Requisicao req = new Requisicao(id, tam);
            vetorReq.addReq(req);
        }

        return vetorReq;
    }

// aleatorio.nextInt((max - min) + 1) + min;


}
