import java.util.Scanner;

public class SumaMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] matrizSuma = new int[filas][columnas];

        // Ingrese los valores de la matriz A
        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("matrizA[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Ingrese los valores de la matriz B
        System.out.println("Ingrese los valores de la matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print("matrizB[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Suma las matrices A y B
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Muestra la matriz resultante
        System.out.println("La matriz resultante (A + B) es:");
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {
                System.out.print(matrizSuma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
