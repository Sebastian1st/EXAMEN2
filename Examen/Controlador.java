
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
         //ListaNotas listapequena = new ListaNotas();
        lista.agregarNota(70);
        lista.agregarNota(60);
        lista.agregarNota(80);
        lista.agregarEstudiante(7718,"Sebastián Soto");
        //lista.agregarEstudiante(2020,"Alhandrom Zhaborim");
        
        lista.imprimirLista();
        
        
        //.imprimirLista();
    
    }
}
