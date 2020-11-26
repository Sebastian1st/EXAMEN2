import javax.swing.JOptionPane;

/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante

{
    // instance variables - replace the example below with your own
    private NodoEstudiante inicio;
    private int tamanio;  
    
    private String nombre;
    private int carnet;
    private int nota1;
    private int nota2;
    private int nota3;
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
            NodoEstudiante auxiliar = inicio;
            
            int posicion = 0;
            
            while(auxiliar.getSiguiente() != null)
            {
                System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre()+ " Carné: " + auxiliar.getNombre()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3());
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }
            
            System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre() + " Carné: " + auxiliar.getCarnet()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3());
        }
    }
    
    public void pedirNombre()
    { 
        nombre = JOptionPane.showInputDialog("Digite el nombre del estudiante");
    }
    public void pedirCarnet()
    {
        carnet = Integer.parseInt(JOptionPane.showInputDialog("Digite el carnet del estudiante"));
    }
    public void pedirNota1()
    {
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 1 del estudiante"));
    }
    public void pedirNota2()
    {
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 2 del estudiante"));
    }
    public void pedirNota3()
    {
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 3 del estudiante"));
    }
    public void agregarEstudiante()
    {
        NodoEstudiante nuevoNodo = new NodoEstudiante();
        nuevoNodo.setCarnet(carnet);
        nuevoNodo.setNombre(nombre);
        nuevoNodo.setNota(nota1);
        nuevoNodo.setNota2(nota2);
        nuevoNodo.setNota3(nota3);
        if(esVacia())
        {
            inicio = nuevoNodo;
        }
        else
        {
            NodoEstudiante auxiliar = inicio;

            while(auxiliar.getSiguiente() != null)
            {
                auxiliar = auxiliar.getSiguiente();
            }

            auxiliar.setSiguiente(nuevoNodo);
        }

        tamanio++;
    }

    
    
    /*** 
       
     * ListaNotas
       
       ***/
    
    
    
    
    
}
