public class NodoListaNotas
{
    // instance variables - replace the example below with your own
    private int nota;
    private NodoListaNotas siguienteNodo;
    
    /**
     * Constructor for objects of class Nodo
     */
    public void NodoListaNotas()
    {
        this.nota = 0;
        this.siguienteNodo = null;
        
    }
    
    public int getNota()
    {
        return nota;
    }
    
    public void setNota(int nota)
    {
        this.nota = nota;
    }

    public NodoListaNotas getSiguiente()
    {
        return siguienteNodo;
    }
    
    public void setSiguiente(NodoListaNotas siguienteNodo)
    {
        this.siguienteNodo = siguienteNodo;
    }
}