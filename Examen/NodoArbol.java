public class NodoArbol
{
    // instance variables - replace the example below with your own
    private int valor;
    NodoArbol hijoIzquierdo;
    NodoArbol hijoDerecho;

    public NodoArbol(int valor)
    {
        this.valor = valor;
        hijoIzquierdo = null;
        hijoDerecho = null;
    }
    
    public int getValor()
    {
        return valor;
    }
    
    public NodoArbol getHijoIzquierdo()
    {
        return hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho()
    {
        return hijoDerecho;
    }
    
    public void setValor(int valor)
    {
        this.valor = valor;
    }
    
    public void setHijoIzquierdo(NodoArbol nuevoNodo)
    {
        hijoIzquierdo = nuevoNodo;
    }

    public void setHijoDerecho(NodoArbol nuevoNodo)
    {
        hijoDerecho = nuevoNodo;
    }
}
