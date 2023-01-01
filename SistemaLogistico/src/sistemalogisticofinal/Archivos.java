package sistemalogisticofinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivos {

    public void escribirArrayList(ArrayList<Transportadora> lista, String nombreArchivo) throws IOException {
        PrintWriter salida = null;
        try {
            // escritura de datos
            salida = new PrintWriter(new BufferedWriter(new FileWriter(nombreArchivo)));
            for (int i = 0; i < lista.size(); i++) {
                salida.println(lista.get(i).getNomeRemetente() + "," + lista.get(i).getNomeClienteDestino() + "," + lista.get(i).getVolumeCarga() + "," + lista.get(i).getDistancaoCidadeDestino());
            }
            salida.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Datos no Compatibles");
        } finally {
            salida.close();
        }
    }

    public ArrayList<Transportadora> leerArrayList(String file) throws IOException {
        ArrayList<Transportadora> a = new ArrayList<>();
        try {
            //lectura de datos
            BufferedReader entrada = new BufferedReader(new FileReader(file));
            String s, s2 = new String();
            String nombre;
            String destino;
            float volumen;
            float distancia;
            while ((s = entrada.readLine()) != null) {
                s2 += s + "\n";
                String[] informacion = s.split(",");
                nombre = informacion[0];
                destino = informacion[1];
                volumen = Float.parseFloat(informacion[2]);
                distancia = Float.parseFloat(informacion[3]);
                Transportadora obj = new Transportadora(nombre,destino,volumen,distancia) ;             
                a.add(obj);
            }
           
        
            entrada.close();
        } catch (java.io.IOException e) {
            
        }
        return a;
    }

}
