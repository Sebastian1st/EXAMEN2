public class NodoEstudiante
{
    private NodoEstudiante siguiente;
    //OBJETOS    
    //PROMEDIO
    private float promedio ;
    //NOMBRE
    private String nombre;
    //CARNET
    private int carnet;
    //NODO DE LA LISTA DE NOTAS 
    private NodoListaNotas inicioLN;    
    //private lista de notas
    
    
    //str
    /**
     * Constructor for objects of class Nodo
     */
    public void NodoEstudiante() 
    {
        this.nombre = "";
        this.carnet = 0;
        //this apuntando a la otra 
        //inicioLN = null;
        this.promedio = 0;
        this.inicioLN = null;
        
        this.siguiente = null;
    }
    
    
    
    
    //get y set de la nota 
    
    //da el siguiente nodo 
    public NodoListaNotas getNotaNodoE()
    {
        return inicioLN;
    }
  
    //obtiene el siguiente nodo usando
    public void setNotaNodoE(NodoListaNotas inicioLN)
    {
        this.inicioLN = inicioLN;
    }

    /**public void obtenerLaNota()
    {
        ListaNotas conseguirNotas = new ListaNotas();
        conseguirNotas.imprimirLista();
    }
    
    /**public void setNota()
    {
        ListaNotas conseguirNotas = new ListaNotas();
        conseguirNotas.imprimirLista();
    }
    **/    
    
    //get y set nombre
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    //get y set promedio
    
    
    //get y set carnet
    public int getCarnet()
    {
        return carnet;
    }

    public void setCarnet(int carnet)
    {
        this.carnet = carnet;
    }

    //get y set promedio
    public float getPromedio()
    {
        return promedio;
    }

    public void setPromedio(float carnet)
    {
        this.promedio = promedio;
    }

    //da el siguiente nodo 
    public NodoEstudiante  getSiguiente()
    {
        return siguiente;
    }

    //obtiene el siguiente nodo usando
    public void setSiguiente(NodoEstudiante siguiente)
    {
        this.siguiente = siguiente;
    }
}
