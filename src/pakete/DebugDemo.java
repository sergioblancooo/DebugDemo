package pakete;

import java.util.Scanner;

public class DebugDemo {

    // Método para calcular el factorial de un número
    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i; // Aquí se calcula el factorial
        }
        return resultado;
    }

    // Método para llenar un arreglo con números del 1 al tamaño del arreglo
    public static int[] rellenarArray(int tamanio) {
        int[] array = new int[tamanio];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Llenar el arreglo con números consecutivos
        }
        return array;
    }

    // Método para concatenar varias frases
    public static String concatenarFrases(String[] frases) {
        StringBuilder resultado = new StringBuilder();
        for (String frase : frases) {
            resultado.append(frase).append(" "); // Concatenar cada frase
        }
        return resultado.toString().trim();
    }

    // Método para sumar los elementos de un arreglo
    public static int sumarElementos(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num; // Sumar cada elemento del arreglo
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Factorial
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numeroFactorial = scanner.nextInt();
        int resultadoFactorial = factorial(numeroFactorial);
        System.out.println("El factorial de " + numeroFactorial + " es: " + resultadoFactorial);

        // Parte 2: Rellenar un arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamanioArreglo = scanner.nextInt();
        int[] arregloRelleno = rellenarArray(tamanioArreglo);
        System.out.print("Arreglo llenado: ");
        for (int num : arregloRelleno) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Parte 3: Concatenar frases
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.println("Ingrese tres frases para concatenar:");
        String[] frases = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Frase " + (i + 1) + ": ");
            frases[i] = scanner.nextLine();
        }
        String fraseConcatenada = concatenarFrases(frases);
        System.out.println("Frase concatenada: " + fraseConcatenada);

        // Parte 4: Sumar elementos de un arreglo
        System.out.println("La suma de los elementos del arreglo es: " + sumarElementos(arregloRelleno));

        // Cerrar el escáner
        scanner.close();
        System.out.println("Fin del programa");
    }
}//jjjjjjjjjjaaaaaaaaaaaaaaaaaaaaaaajdksjlaaaaaaaaaaf
