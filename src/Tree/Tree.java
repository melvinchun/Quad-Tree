package Tree;

public class Tree {
    private Nodo raiz;
    
    public Tree() {
        this.raiz = new Nodo();
    }
    
    public Tree(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
