public class ColoracaoGrafo {
    private int numVertices;
    private int[] cores;
    private int[][] grafo;
    private int numCoresPermitidas;

    
    public ColoracaoGrafo(int[][] grafo, int numCoresPermitidas) {
        this.numVertices = grafo.length;
        this.grafo = grafo;
        this.numCoresPermitidas = numCoresPermitidas;
        this.cores = new int[numVertices]; 
    }

    
    private boolean isSeguro(int vertice, int cor) {
        for (int i = 0; i < numVertices; i++) {
            
            if (grafo[vertice][i] == 1 && cores[i] == cor) {
                return false;
            }
        }
        return true;
    }

    
    private boolean resolverColoracaoBacktracking(int vertice) {
        // Condição de parada: se todos os vértices receberam cores, sucesso!
        if (vertice == numVertices) {
            return true;
        }

        
        for (int cor = 1; cor <= numCoresPermitidas; cor++) {
            if (isSeguro(vertice, cor)) {
                cores[vertice] = cor; 

                
                if (resolverColoracaoBacktracking(vertice + 1)) {
                    return true;
                }

                
                cores[vertice] = 0;
            }
        }
        
        
        return false;
    }

    public void resolver() {
        if (!resolverColoracaoBacktracking(0)) {
            System.out.println("=> NÃO é possível colorir o grafo utilizando " + numCoresPermitidas + " cores.");
        } else {
            imprimirResultado();
        }
    }

    private void imprimirResultado() {
        System.out.println("=========================================");
        System.out.println("    RESULTADO DA COLORAÇÃO DO GRAFO      ");
        System.out.println("=========================================");
        System.out.println("Foi possível colorir o grafo respeitando a regra!");
        System.out.println("Cores disponíveis (m): " + numCoresPermitidas);
        System.out.println("-----------------------------------------");
        
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Vértice [" + i + "] -> Pintado com a Cor: " + cores[i]);
        }
        System.out.println("=========================================");
    }

    // --- (Main) ---
    public static void main(String[] args) {
        /*
         * 
         * 
         */
        int[][] matrizSlide = {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {1, 0, 1, 0}
        };

        int m = 3; 

        
        ColoracaoGrafo problema = new ColoracaoGrafo(matrizSlide, m);
        problema.resolver();
    }
}