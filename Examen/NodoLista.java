public class NodoLista
{
    private NodoLista siguiente;
    private float promedio ;
    private String nombre;
    private int carnet;
    private Lista inicio;
    //private lista de notas

    /**
     * Constructor for objects of class Nodo
     */
    public void Nodo()
    {
        this.nombre = "";
        this.carnet = 0;
        //this apuntando a la otra 
        this.inicio=null;
        this.promedio = 0;
       
        this.siguiente = null;
    }
    
    
    //get y set nombre
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    //get y set Notas
    public Lista getNotas()
    {
        return inicio;
    }
    public void setNotas(Lista inicio)
    {
        this.inicio = inicio;
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
    
    
    public NodoLista getSiguiente()
    {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente)
    {
        this.siguiente = siguiente;
    }
}
