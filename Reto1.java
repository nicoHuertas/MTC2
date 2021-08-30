
package domingo_reto1;

import java.util.Scanner;


public class Reto1 {

    public static String calcularRiesgo(double imc, int edad){
    
        String riesgo = "";
        if (imc < 22 && edad < 45) riesgo = "Bajo";
        if (imc < 22 && edad >= 45) riesgo = "Medio";
        if (imc >= 22 && edad < 45)  riesgo = "Medio";
        if (imc >= 22 && edad >= 45) riesgo = "Alto";
    
        return riesgo;
    }
    
    
    public static double calcularIMC(double masa, double altura){
        return masa / (altura * altura);
    }
    
    
    public static boolean validarEntrada(double masa, double altura, int edad){
        if ((masa < 0 || masa > 150) || (altura < 0.1 || altura > 2.5) || (edad < 0 || altura > 110)){
        return false;
        }
    return true;    
     
    } 
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        
        double masa = Double.parseDouble(input[0]);
        double altura = Double.parseDouble(input[1]);
        int edad = Integer.parseInt(input[2]);
        double imc = calcularIMC(masa, altura);
        
        if (validarEntrada(masa, altura, edad)){
            System.out.println(String.format("%.1f", imc) + " " + calcularRiesgo(imc,edad));
        }
        else {
            System.out.println("ERROR");
        }
        
    }
    
}
