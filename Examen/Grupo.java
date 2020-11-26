import javax.swing.JOptionPane;

/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grupo

{
    // instance variables - replace the example below with your own
    private Estudiante inicio;
    private int tamanio;  
    private NodoArbol raiz;
    private String nombre;
    private int carnet;
    private int nota1;
    private int nota2;
    private int nota3;

    final int divisor = 1;
    private float prom;
    
    public void Estudiante()
    {
        inicio = null;
        tamanio = 0;
        raiz = null;
    }
    public NodoArbol getRaiz()
    {
        return raiz;
    }
    
    private NodoArbol agregarRecursivo(NodoArbol actual, int valor)
    {
        if(actual == null)
        {
            return new Nodo(valor);
        }
        else if( valor < actual.getValor() )
        {
            actual.setHijoIzquierdo(agregarRecursivo(actual.getHijoIzquierdo(), valor));
        }
        else if( valor > actual.getValor() )
        {
            actual.setHijoDerecho(agregarRecursivo(actual.getHijoDerecho(), valor));
        }
        else
        {
            return actual;
        }
        
        return actual;
    }
    
    public void agregarHijo(int valor)
    {
        raiz = agregarRecursivo(raiz, valor);
    }    
    
    public void recorrerEnOrden(NodoArbol nodoActual)
    {
        if( nodoActual != null)
        {
            recorrerEnOrden(nodoActual.getHijoIzquierdo());
            System.out.print(" " + nodoActual.getValor());
            recorrerEnOrden(nodoActual.getHijoDerecho());
        }
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
            Estudiante auxiliar = inicio;

            int posicion = 0;

            while(auxiliar.getSiguiente() != null)
            {
                System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre()+ " Carné: " + auxiliar.getNombre()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3()+" Promedio: " + auxiliar.getPromedio());
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }

            System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre() + " Carné: " + auxiliar.getCarnet()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3()+" Promedio: " + auxiliar.getPromedio());
        }
    }

    public void imprimirIguales(float promedio){

        if(!esVacia())
        {
            Estudiante auxiliar = inicio;

            int posicion = 0;

            while(auxiliar.getSiguiente() != null)
            {
                if (auxiliar.getPromedio() == promedio){

                    System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre()+ " Carné: " + auxiliar.getNombre()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3()+" Promedio: " + auxiliar.getPromedio());

                }
                auxiliar = auxiliar.getSiguiente();
                posicion++;

            }
            if (auxiliar.getPromedio() == promedio){

                    System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre()+ " Carné: " + auxiliar.getNombre()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3()+" Promedio: " + auxiliar.getPromedio());

                }
        }

    }

    public void imprimirMayores(float promedio){
        if(!esVacia())
        {
            Estudiante auxiliar = inicio;

            int posicion = 0;

            while(auxiliar.getSiguiente() != null)
            {
                if (auxiliar.getPromedio() > promedio){

                    System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre()+ " Carné: " + auxiliar.getNombre()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3()+" Promedio: " + auxiliar.getPromedio());

                }
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }
            if (auxiliar.getPromedio() > promedio){

                    System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre()+ " Carné: " + auxiliar.getNombre()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3()+" Promedio: " + auxiliar.getPromedio());

                }
        }
    }

    public void imprimirMenores(float promedio){
        if(!esVacia())
        {
            Estudiante auxiliar = inicio;

            int posicion = 0;

            while(auxiliar.getSiguiente() != null)
            {
                if (auxiliar.getPromedio() < promedio){

                    System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre()+ " Carné: " + auxiliar.getNombre()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3()+" Promedio: " + auxiliar.getPromedio());

                }
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }
            if (auxiliar.getPromedio() < promedio){

                    System.out.println("Posicion: " + posicion + " Nombre: " + auxiliar.getNombre()+ " Carné: " + auxiliar.getNombre()+ " Nota 1: " + auxiliar.getNota()+ " Nota 2: " + auxiliar.getNota2()+ " Nota 3: " + auxiliar.getNota3()+" Promedio: " + auxiliar.getPromedio());

                }
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
        Estudiante nuevoNodo = new Estudiante();
        nuevoNodo.setCarnet(carnet);
        nuevoNodo.setNombre(nombre);
        nuevoNodo.setNota(nota1);
        nuevoNodo.setNota2(nota2);
        nuevoNodo.setNota3(nota3);
        prom = nuevoNodo.calcProm(divisor);
        nuevoNodo.setPromedio(prom);
        if(esVacia())
        {
            inicio = nuevoNodo;
        }
        else
        {
            Estudiante auxiliar = inicio;

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
