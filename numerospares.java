/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;
/**
 *
 * @author yalidominguez
 */
public class JavaApplication1 {

    int num[] = new int[4];
    int i;
    String result = "";
    String resultpares = "";

    public void IngresarNumeros() {
        for (i = 0; i < num.length; i++) {
            do {
                num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita numeros del 1 al 10"));
            }while (!Error(num));
        }
    }

    public boolean Error(int num[]) {
        boolean rango;
        if (num[i] >= 1 && num[i] < 11) {
            rango = true;
        } else {
            rango = false;
            JOptionPane.showMessageDialog(null, "Número fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rango;
    }

    public void Resultados() {
        for (i = 0; i < num.length; i++) {
            result = result + num[i];
            result += "\n";
        }
        JOptionPane.showMessageDialog(null, result, "Números introducidos", JOptionPane.INFORMATION_MESSAGE);
    }

    public int NumeroPar() {
        for (i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                resultpares = resultpares + num[i];
                resultpares += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, resultpares, "Numeros Pares", JOptionPane.INFORMATION_MESSAGE);
        return num[i];
    }

    public static void main(String[] args) {
        JavaApplication1 np = new JavaApplication1();
        np.IngresarNumeros();
        np.Resultados();
        np.NumeroPar();
        np.Error(np.num);
    }
}
