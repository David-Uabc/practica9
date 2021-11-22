
package practica9;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class archivo {
        public int calificaciones[] = new int[21];
        public void archivoCSV(){
            String line;
            String path = "C:\\Users\\David-pc\\Documents\\NetBeansProjects\\Practica9\\practica9.csv";
            try{
                BufferedReader br = new BufferedReader(new FileReader(path));
                try {
                    while((line = br.readLine())!= null){
                        String numeros[] = line.split(",");//formato para leer espacios
                        numeros[0] = String.valueOf(numeros[0].charAt(1)) + String.valueOf(numeros[0].charAt(2)) ; //elimina el primer caracter
                        for(int i = 0; i<numeros.length;i++){
                            calificaciones[i] = Integer.parseInt(numeros[i]);
                        }
                    }
                } catch (IOException ex) { //Si se da un error a la hora de estar leyendo el archivo
                    System.out.println("Error al leer el archivo " + ex);
                }
            }
            catch(FileNotFoundException e){ //Si se da un error a la hora de querer abrir el archivo
                System.out.println("Error al abrir el archivo " + e);
            }
        }
}