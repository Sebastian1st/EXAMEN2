
/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lista
{
    // instance variables - replace the example below with your own
    private Nodo inicio;
    private int tamanio;

    public void Lista()
    {
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia()
    {
        return inicio == null;
    }
    
    public int getTamanio()
    {
        return tamanio;
    }
   
    public void agregarNota(int valor)
    {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setValor(valor);
        
        if(esVacia())
        {
            inicio = nuevoNodo;
        }
        else
        {
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
        }
        
        tamanio++;
    }
    
    
    public void imprimirLista()
    {
        if(!esVacia())
        {
            Nodo auxiliar = inicio;
            int posicion = 0;
            
            while(auxiliar.getSiguiente() != null)
            {
                System.out.println("Posicion: " + posicion + " Valor: " + auxiliar.getValor());
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }
            
            System.out.println("Posicion: " + posicion + " Valor: " + auxiliar.getValor());
        }
    }
    
    
    
    
    
    
    
}