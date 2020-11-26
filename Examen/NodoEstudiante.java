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
    //NOTA 1 
    private int nota1;
    //NOTA 2 
    private int nota2;
    //NOTA 3
    private int nota3;
    
    //str
    /**
     * Constructor for objects of class Nodo
     */
    public void NodoEstudiante() 
    {
        this.nombre = "";
        this.carnet = 0;
        this.nota1 = 0;
        this.nota2 = 0; 
        this.nota3 = 0;
        this.promedio = 0;
        
        this.siguiente = null;
    }
    
    //get y set de la nota 3
    public int getNota3()
    {
        return nota3;
    }

    public void setNota3(int nota3)
    {
        this.nota3 = nota3;
    }
    //get y set de la nota 2
    public int getNota2()
    {
        return nota2;
    }

    public void setNota2(int nota2)
    {
        this.nota2 = nota2;
    }
    //get y set de la nota 1
    
    public int getNota()
    {
        return nota1;
    }

    public void setNota(int nota1)
    {
        this.nota1 = nota1;
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
