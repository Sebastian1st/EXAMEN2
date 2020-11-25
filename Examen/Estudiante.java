
/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante

{
    // instance variables - replace the example below with your own
    private NodoLista inicio;
    private int tamanio;

    public void Estudiante()
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
    
    public void imprimirLista()
    {
        if(!esVacia())
        {
            NodoLista auxiliar = inicio;
            int posicion = 0;
            
            while(auxiliar.getSiguiente() != null)
            {
                System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre()+ " Carné: " + auxiliar.getNombre());
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }
            
            System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre() + " Carné: " + auxiliar.getCarnet());
        }
    }
    public void agregarEstudiante(int carnet, String nombre)
    {
        NodoLista nuevoNodo = new NodoLista();
        nuevoNodo.setCarnet(carnet);
        nuevoNodo.setNombre(nombre);
        if(esVacia())
        {
            inicio = nuevoNodo;
        }
        else
        {
            NodoLista auxiliar = inicio;

            while(auxiliar.getSiguiente() != null)
            {
                auxiliar = auxiliar.getSiguiente();
            }

            auxiliar.setSiguiente(nuevoNodo);
        }

        tamanio++;
    }

    
}
