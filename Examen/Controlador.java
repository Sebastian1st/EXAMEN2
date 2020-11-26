import javax.swing.JOptionPane;
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
        Grupo estudiante = new Grupo();
        Estudiante nodoestudied = new Estudiante();
        boolean volveralmenu= true;
        while (volveralmenu== true){
            //Solicitar datos
            estudiante.pedirNombre();
            estudiante.pedirCarnet();
            estudiante.pedirNota1();
            estudiante.pedirNota2();
            estudiante.pedirNota3();
            estudiante.agregarEstudiante();
            ///ACABA SOLICITAR DATOS
            Object opcionmenu = JOptionPane.showInputDialog(null,"Desea continuar introduciendo datos? ",
                    "Examen 2", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Sí","No"},
                    "Sí");

            if (opcionmenu == "Sí"){
                
            }
            if (opcionmenu == "No"){
                
                volveralmenu=false;
            }
        }
        
        
        
        estudiante.imprimirLista();

    }
}
