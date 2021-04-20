package uts;
public class No1 {
    public static void bubblesort(int[] A) {
        int i=1, j, n = A.length;
        int temp;
        while (i<n) {   //1<5
            j = n-1;    //j=5-1=4
            while(j>=1){   //4>=1-T
                if(A[j-1]>A[j]){  //A[3]>A[4]-3>1-T
                    temp = A[j];  //temp=1
                    A[j] = A[j-1];  //A[4]=A[3]=3
                    A[j-1] = temp;  //A[3]=1
                }
                j = j - 1;  //j=3
            }
            i = i + 1;  //i=i+1
        }
    }
    
    public static void tampil(int data[]) {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int A[] = {3, 10, 4, 2, 8, 13};
        No1.tampil(A);
        No1.bubblesort(A);
        No1.tampil(A);
        int IndeksAwal = 0;   
        int IndeksAkhir = A.length-1;
        int cari = 8;
        int ketemu = 0;
        int point = 0;
        
        //System.out.println("Isi data adalah ");
        for(int i = 0; i < A.length; i++) {
            
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        while((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
        point = (IndeksAwal + IndeksAkhir) / 2;   
        System.out.println("Indeks pointer : "+ point);
            if(cari == A[point]) {   
                ketemu = 1;
                System.out.println("Data "+ cari +" Telah ditemukan pada indeks ke " + point);
            }
            
            else if(cari < A[point]) {    
                System.out.println("Cari di kiri ");
                IndeksAkhir = point-1;   
            }
            else {
                IndeksAwal = point+1;
                System.out.println("Cari di kanan");
            }
        }
        if(ketemu == 1)
            System.out.println("Kesimpulan : data ditemukan ");
        else
            System.out.println("Kesimpulan : data tidak ditemukan ");
        
        System.out.println(" ");
    System.out.println("RR. Niken Pambayun Dyah Setyawati");
    }
}