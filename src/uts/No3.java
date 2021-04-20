package uts;
import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
    int a, b, i, j, k, l, x, y;  
    int matriksA[][] = new int[10][10];
    int matriksB[][] = new int[10][10];
    int transposeA[][] = new int[10][10];
    int transposeB[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);  
    
    System.out.print("Masukkan jumlah baris matriks A : ");
    k = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks A : ");
    l = scan.nextInt();
    System.out.println("Masukkan elemen matriks A : ");
    for(i = 0; i < k; i++) {
        for(j = 0; j < l; j++) {
            matriksA[i][j] = scan.nextInt();
        }
    }
    System.out.println("Hasil matriks : ");
    for(i = 0; i < k; i++) {
        for(j = 0; j < l; j++) {
            System.out.print(matriksA[i][j] + "\t");
        }
        System.out.println();
    }
    
    for(i = 0; i < k; i++) {
        for(j = 0; j < l; j++) {
            transposeA[j][i] = matriksA[i][j];
        }
    }
    System.out.println("Hasil transpose matriks A : ");
    for(i = 0; i < l; i++) {
        for(j = 0; j < k; j++) {
            System.out.print(transposeA[i][j] + "\t");
        }
        System.out.println();
        }
    
    System.out.print("Masukkan jumlah baris matriks B : ");
    a = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks B : ");
    b = scan.nextInt();
    System.out.println("Masukkan elemen matriks B : ");
    for(x = 0; x < a; x++) {
        for(y = 0; y < b; y++) {
            matriksB[x][y] = scan.nextInt();
        }
    }
    System.out.println("Hasil matriks B : ");
    for(x = 0; x < a; x++) {
        for(y = 0; y < b; y++) {
            System.out.print(matriksB[x][y] + "\t");
        }
        System.out.println();
    }
    for(x = 0; x < a; x++) {
        for(y = 0; y < b; y++) {
            transposeB[y][x] = matriksB[x][y];
        }
    }
    System.out.println("Hasil transpose matriks B : ");
    for(x = 0; x < b; x++) {
        for(y = 0; y < a; y++) {
            System.out.print(transposeB[x][y] + "\t");
        }
        System.out.println();
        }
    System.out.println(" ");
    System.out.println("RR. Niken Pambayun Dyah Setyawati");
    }
}
