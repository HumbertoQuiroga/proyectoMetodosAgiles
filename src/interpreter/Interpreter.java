package interpreter;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author PC
 */
public class Interpreter 
{
    private List<String[]> listaContenido;
    private String contenidoString;
    
    public Interpreter() 
    {
        listaContenido = new ArrayList<>();
    }
    
    public boolean comprobarnombre(String nombre)
    {
        return !(nombre.startsWith("Names") || nombre.equals(""));
    }
    
    public String[] estractroAtributosNombre(String nombre)
    {
        //Nombre[0], Estado asistencia[1], Hora entrada[2], Cantidad minutos en sesion[3].
        contenidoString = nombre;
        String[] contenido = new String[4];
        if(nombre.contains("✔"))
        {
            //Nombre
            contenido[0] = contenidoString.substring(0, contenidoString.indexOf("✔")-1);
            contenidoString = contenidoString.substring(contenidoString.indexOf("✔")+1, contenidoString.length());
          
            //Hora entrada
            contenido[2] = contenidoString.substring(1, contenidoString.indexOf(" "));
            contenidoString = contenidoString.substring(contenidoString.indexOf(" ")+1, contenidoString.length());
            
             
        }
        else if(nombre.contains("	"))
        {
            //Nombre
            contenido[0] = contenidoString.substring(0, contenidoString.indexOf("	"));
            contenidoString = contenidoString.substring(contenidoString.indexOf("	")+1, contenidoString.length());
           
            //Hora entrada
            contenido[2] = contenidoString.substring(0, contenidoString.indexOf(" "));
        }
        //Cantidad minutos totales en clase
        if(contenidoString.contains("("))
        {
            //Estado asistencia
            contenido[1] = "Asistio";
            
            int cantidadEntradas=0;
            String remplazoContenido = contenidoString;
            for(int cont=0 ; cont<contenidoString.length(); cont++)
            {
                if(remplazoContenido.contains("("))
                {
                    remplazoContenido = remplazoContenido.substring(remplazoContenido.indexOf("(")+1, remplazoContenido.length());
                    cantidadEntradas = cantidadEntradas+1;
                }
            }

            int[] cantMin = new int[cantidadEntradas];
            int cantidadMinTotales=0;
            for(int cont=0 ; cont < cantidadEntradas ; cont++)
            {
                contenido[3] = contenidoString.substring(contenidoString.indexOf("(")+1,contenidoString.indexOf(")"));
                contenidoString = contenidoString.substring(contenidoString.indexOf(")")+1, contenidoString.length());
                cantMin[cont] = Integer.valueOf(contenido[3].substring(0, contenido[3].indexOf("m")));
                cantidadMinTotales = cantidadMinTotales+cantMin[cont];
            }
            contenido[3] = String.valueOf(cantidadMinTotales);
        } 
        else if(nombre.contains("Attendance"))
        {
            contenido[0] = contenidoString.substring(contenidoString.length()-10, contenidoString.length());
        }
        else
        {
            //Nombre
            contenido[0] = contenidoString;
            
            //Estado asistencia
            contenido[1] = "No Asistio";
            
            //Hora entrada
            contenido[2] = "";
            
            //Minutos totoales
            contenido[3] = "";
        }
        
        return contenido;
    }
    
    public List<String[]> importarArchivo(File archivo)
    {
        if(archivo!=null)
        {
           try 
            {
                CSVReader lector = new CSVReader(new FileReader(archivo));
                String[] listaArchivo;
                List<String[]> contenidoArchivo = lector.readAll();
                for(int cont=0; cont <  contenidoArchivo.size(); cont++)
                {
                   if(comprobarnombre(contenidoArchivo.get(cont)[0]))
                   {
                       listaContenido.add(estractroAtributosNombre(contenidoArchivo.get(cont)[0]));
                   }
                }
                return listaContenido;
            } 
            catch (FileNotFoundException ex) {System.out.println("Error, "+ex.getMessage());} 
            catch (IOException ex) {System.out.println("Error, "+ex.getMessage());}   
        }
        return null;
    }
    
    public Object[][] getConteridoTabla(List<String[]> listaContenido)
    {
        Object[][] objetosArreglo = new Object[listaContenido.size()-1][5];
        for(int cont=0 ; cont < objetosArreglo.length ; cont++)
        {
            objetosArreglo[cont][0] = String.valueOf(cont+1);
            objetosArreglo[cont][1] = listaContenido.get(cont+1)[0];
            objetosArreglo[cont][2] = listaContenido.get(cont+1)[1];
            objetosArreglo[cont][3] = listaContenido.get(cont+1)[2];
            objetosArreglo[cont][4] = listaContenido.get(cont+1)[3];
        }
        return objetosArreglo;
    }
    
    
    public void mostrarListaContenido(List<String[]> listaConenido)
    {
        for(int cont=0; cont < listaConenido.size() ; cont++)
        {
            System.out.println((cont+1)+". "+"Nombre:"+listaConenido.get(cont)[0]+", Estado:"+listaConenido.get(cont)[1]
                              +", Hora entrada:"+listaConenido.get(cont)[2]+", Cant minutos:"+listaConenido.get(cont)[3]);
        }
    }
    
    
    
}
