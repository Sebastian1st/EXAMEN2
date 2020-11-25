
/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListaNotas
{
    // instance variables - replace the example below with your own
    private NodoListaNotas inicioLN;
    private int tamanio;

    public void ListaNotas()
    {
        inicioLN = null;
        tamanio = 0;
    }

    public boolean esVacia()
    {
        return inicioLN == null;
    }
    
    public int getTamanio()
    {
        return tamanio;
    }
   
    public void agregarNota(int valor)
    {
        NodoListaNotas nuevoNodo = new NodoListaNotas();
        nuevoNodo.setNota(valor);
        
        if(esVacia())
        {
            inicioLN = nuevoNodo;
        }
        else
        {
            nuevoNodo.setSiguiente(inicioLN);
            inicioLN = nuevoNodo;
        }
        
        tamanio++;
    }
    
    
    public void imprimirLista()
    {
        if(!esVacia())
        {
            NodoListaNotas auxiliar = inicioLN;
            int posicion = 0;
            
            while(auxiliar.getSiguiente() != null)
            {
                System.out.println("Posicion: " + posicion + " Valor: " + auxiliar.getNota());
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }
            
            System.out.println("Posicion: " + posicion + " Valor: " + auxiliar.getNota());
        }
    }
    
    
    
    
    
    
    
}