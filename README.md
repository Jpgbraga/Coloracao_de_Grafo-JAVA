# 🎨 Coloração de Grafos (m-Coloring Problem)

---

### Sobre o Projeto

Este projeto aborda um dos desafios mais famosos da Teoria dos Grafos e da Ciência da Computação: o Problema da Coloração de Grafos. O objetivo algorítmico é atribuir cores aos vértices de um grafo de forma que nenhum par de vértices adjacentes (conectados por uma aresta) compartilhe a mesma cor, utilizando no máximo um limite $m$ de cores permitidas. 

### Sobre o Sistema

O sistema foi desenvolvido em Java e resolve o problema aplicando o paradigma algorítmico de **Backtracking** (Tentativa e Erro recursiva). 

O grafo de entrada é representado na memória através de uma **Matriz de Adjacência**. O algoritmo explora a estrutura tentando colorir um vértice por vez, verificando constantemente a regra de segurança (checando se os vizinhos já possuem a cor testada). Caso o sistema chegue a um vértice onde nenhuma cor disponível seja válida, ele realiza o *backtrack*: retorna ao vértice anterior, desfaz a pintura e tenta a próxima cor da lista. 

Esse processo garante que a solução encontrada seja matematicamente válida ou determina de forma exata que é impossível colorir o grafo com as $m$ cores fornecidas.

### Funcionalidades

⚙️ **Estrutura e Algoritmos**
* Representação de grafos não-direcionados via Matriz de Adjacência estática.
* Validação dinâmica de segurança de arestas (método `isSeguro`).
* Implementação de algoritmo Backtracking para exploração profunda da árvore de estados.
* Saída de dados formatada no console exibindo o mapeamento exato de cada vértice para sua respectiva cor.

### Tecnologias Utilizadas

* Java
