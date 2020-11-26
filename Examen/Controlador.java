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
        Estudiante estudiante = new Estudiante();

        
        boolean volveralmenu= true;
        while (volveralmenu== true){
            //Solicitar datos
            estudiante.pedirNombre();
            estudiante.pedirCarnet();
            estudiante.pedirNota1();
            estudiante.pedirNota2();
            estudiante.pedirNota3();
            ///ACABA SOLICITAR DATOS
            Object opcionmenu = JOptionPane.showInputDialog(null,"Examen 2 ",
                    "Desea continuar introduciendo datos?", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Seleccione una opción","Sí","No"  },
                    "Seleccione");

            if (opcionmenu == "Sí"){
                
            }
            if (opcionmenu == "No"){
                JOptionPane.showMessageDialog(null,"Gracias por usarme :D" );
                volveralmenu=false;
            }
        }
        //Solicitar datos
        estudiante.pedirNombre();
        estudiante.pedirCarnet();
        estudiante.pedirNota1();
        estudiante.pedirNota2();
        estudiante.pedirNota3();
        ///ACABA SOLICITAR DATOS

        estudiante.agregarEstudiante();
        estudiante.imprimirLista();

    }
}
