public class Nodo
{
    // instance variables - replace the example below with your own
    private int nota;
    private Nodo siguienteNodo;
    
    /**
     * Constructor for objects of class Nodo
     */
    public void Nodo()
    {
        this.nota = 0;
        this.siguienteNodo = null;
        
    }
    
    public int getValor()
    {
        return nota;
    }
    
    public void setValor(int valor)
    {
        this.nota = valor;
    }

    public Nodo getSiguiente()
    {
        return siguienteNodo;
    }
    
    public void setSiguiente(Nodo siguiente)
    {
        this.siguienteNodo = siguienteNodo;
    }
}