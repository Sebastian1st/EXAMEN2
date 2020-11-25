public class NodoLista
{
    private NodoLista siguiente;
    private int nota;
    

    /**
     * Constructor for objects of class Nodo
     */
    public void Nodo()
    {
        this.nota = 0;
        this.siguiente = null;
    }
    
    public int getNota()
    {
        return nota;
    }
    
    public void setNota(int nota)
    {
        this.nota = nota;
    }

    public NodoLista getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(NodoLista siguiente)
    {
        this.siguiente = siguiente;
    }
}
