
/**
 * Write a description of class Controlador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controlador
{
    public static void controlador()
    {
        //Lista notas
        Estudiante lista = new Estudiante();
        Lista listapequena = new Lista();
        listapequena.agregarNota(70);
        listapequena.agregarNota(60);
        listapequena.agregarNota(80);
        lista.agregarEstudiante(7718,"Sebastián Soto");
        lista.agregarEstudiante(2020,"Alhandrom Zhaborim");
        
        lista.imprimirLista();
        
        
        listapequena.imprimirLista();
    
    }
}
