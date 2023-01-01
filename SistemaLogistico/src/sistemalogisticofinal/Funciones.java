package sistemalogisticofinal;

import java.io.IOException;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Funciones {

    public static DefaultTableModel tabla = new DefaultTableModel();
    public static ArrayList<Transportadora> historicosEntregas = new ArrayList<>();
    public static ArrayList<Transportadora> registrosDeposito = new ArrayList<>();
    public static ArrayList<Transportadora> registroCamion = new ArrayList<>();
    public static ArrayList<Transportadora> registroTotal = new ArrayList<>();
    public static Queue<Transportadora> DepositoQueue = new LinkedList<>();
    public static Stack<Transportadora> PilaCamion = new Stack<>();

    public static void registrar(ArrayList<Transportadora> array, String nome, String dest, float vol, float dista) throws IOException {

        array.add(new Transportadora(nome, dest, vol, dista));

    }

    public static int Cantidad(ArrayList<Transportadora> array) {
        return array.size();

    }

    public static Transportadora setTabla(int i, ArrayList<Transportadora> array) {
        Transportadora h;
        h = array.get(i);
        return h;
    }

    public static void Push(Transportadora y, ArrayList<Transportadora> array) {
        array.add(y);

    }

    public static void ordenarArrayPorDistancia(ArrayList<Transportadora> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - 1 - i; j++) {
                if (array.get(j).getDistancaoCidadeDestino() > array.get(j + 1).getDistancaoCidadeDestino()) {
                    Transportadora temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }

    public static ArrayList<Transportadora> invertirArray(ArrayList<Transportadora> array) {
        ArrayList<Transportadora> a = new ArrayList<>();
        for (int i = array.size() - 1; i >= 0; i--) {
            a.add(array.get(i));
        }
        return a;
    }

    public static void Pop(ArrayList<Transportadora> array) {
        if (!array.isEmpty()) {
            array.remove(array.size() - 1);
        }
    }

    public static void cargarCamion(ArrayList<Transportadora> deposito, ArrayList<Transportadora> camion) {
        float max = 0;

        for (int i = 0; i < deposito.size(); i++) {

            if (max + deposito.get(i).getVolumeCarga() <= 50) {

                max = max + deposito.get(i).getVolumeCarga();
                camion.add(deposito.get(i));
                deposito.remove(i);
                i--;

            }

        }

    }

    public static void calcularCargaCamion(ArrayList<Transportadora> camion) {
        String s = "";
        float max = 0;
        float distot = 0;
        float valtot;
        float t = 0;
        int i = 0;
        for (Transportadora x : camion) {

            s = s + "Remite: " + x.getNomeRemetente() + " - Destinatario: " + x.getNomeClienteDestino() + " \n"
                    + "Volumen: " + x.getVolumeCarga() + " - Distancia " + x.getDistancaoCidadeDestino() + " \n" + " \n";

            if (x.getDistancaoCidadeDestino() >= t) {
                distot = x.getDistancaoCidadeDestino();
            }
            max = max + x.getVolumeCarga();

        }

        valtot = (float) (distot * 1.17 * max);
        JOptionPane.showMessageDialog(null, s + "\n Volumen: " + max + "\n Valor Total: " + valtot);

        System.out.println(camion.toString());

    }

    public static String entregar(int ciudad, ArrayList<Transportadora> array) {

        if (!array.isEmpty()) {
            if (array.get(0).getDistancaoCidadeDestino() == ciudad) {

                historicosEntregas.add(array.get(0));
                array.remove(0);

            } else {
                JOptionPane.showMessageDialog(null, "No esta en la ciudad correcta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Descarga finalizada");
        }

        String t = "";

        for (Transportadora x : array) {
            t = t + x.getNomeRemetente() + ",\t " + x.getNomeClienteDestino()
                    + ",\t " + x.getVolumeCarga() + ",\t " + x.getDistancaoCidadeDestino() + ", \n";

        }
        return t;

    }

    public static Queue<Transportadora> convertirACola(ArrayList<Transportadora> lista) {
        Queue<Transportadora> cola = new LinkedList<>();
        cola.addAll(lista);
        return cola;
    }

    public static Stack<Transportadora> convertirAPila(ArrayList<Transportadora> lista) {
        Stack<Transportadora> pila = new Stack<>();
        for (Transportadora elemento : lista) {
            pila.push(elemento);
        }
        return pila;
    }


}
