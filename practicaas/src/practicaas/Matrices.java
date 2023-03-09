package practicaas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int[][] m = new int[10][10];
        int[][] p = new int[3][3];

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Llenar la matriz M aleatoriamente
        System.out.println("Matriz M:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(100);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        // Pedir al usuario que introduzca los valores para la matriz P
        System.out.println("Matriz P:");
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                System.out.print("Introduce el valor para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                p[i][j] = scanner.nextInt();
            }
        }

        boolean found = false;
        String[] row = new String[9];
        int counter=0;

        for (int i = 0; i <= m.length - p.length; i++) {
            for (int j = 0; j <= m[i].length - p[0].length; j++) {
                boolean match = true;
                for (int k = 0; k < p.length; k++) {
                    for (int l = 0; l < p[k].length; l++) {
                        if (p[k][l] != m[i + k][j + l]) {
                            match = false;
                            break;
                        }else {
                        	row[counter]=(k+" "+l);
                            found = true;
                            counter++;
                            break;
                        }
                        	
                    }
                    if (!match) {
                        break;
                    }
                    
                }
                
            }
            
            if (found) {
                break;
            }
           
        }

        if (found) {
        	for (int i=0;i<=8;i++) {
        		System.out.println(row[i]);
        	}
           
        	   
       
        } else {
            System.out.println("La submatriz P no se encuentra en la matriz M");
        }
    }
}