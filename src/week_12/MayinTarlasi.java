package week_12;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

	public static void main(String[] args) {
		 
		int a=0 , b=0 ;
		
        Scanner scan=new Scanner (System.in);
        System.out.println(" Lutfen 1-4 arasi bir zorluk seviyesi gir ");
        int zorluk=scan.nextInt();
        if(zorluk==1) {
        	a=5;
        	b=5;
        	
        }if(zorluk==2) {
        	a=10;
        	b=10;
        	
        }if(zorluk==3) {
        	a=15;
        	b=15;
        	
        }if(zorluk==4) {
        	a=20;
        	b=20;
        	
        }
    	
 int [][] oyunMatrisi=RastgeleDoldur(a,b);
        
        int puan=0;
        boolean kontrol=true;
        while(kontrol) {
        	System.out.println("Satiri");
        	int x=scan.nextInt();
        	
        	System.out.println("Sutunu");
        	int y=scan.nextInt();
        	
        	if(oyunMatrisi[x][y]==1) {
        		kontrol=false;
        	}else {
        		puan =puan+10;
        		System.out.println("Hala hayattasin.Puanin :  "+puan);
        	}
        	
        }
        
        System.out.println("GAme Over . Puanin :  "+puan);
        
		
        
        
        
        // bu kisim oyun bittikten asonra tarlanin acik halini gormek icin 
        for (int i = 0; i < oyunMatrisi.length; i++) {
			for (int j = 0; j < oyunMatrisi.length; j++) {
				if(oyunMatrisi[i][j]==1) {
					System.out.print("✹ ");
				}else if(oyunMatrisi[i][j]==0) {
					System.out.print("❀ ");
				}
			}  // ☢ 🌟☺ ㋛
			System.out.println();
		}
		
	}

	public static int[][] RastgeleDoldur(int a, int b) {
		Random rnd=new Random();
		
		int [][]matris= new int [a][b];
		int i=0;
		while(i<a) {
			int j=0;
			while(j<b) {
				
				matris[i][j]=rnd.nextInt(2); //0 veya 1 sallayacak  1 mayin var 0 yok demek 
				
				j=j+1;
			}
			
			
			i=i+1;
		}
		
		for (int k = 0; k <a; k++) {
			for (int l = 0; l < b; l++) {
				
				System.out.print("☯"+ " ");
				
			}
			System.out.println();
		 
		}
		
		
		return matris;
		
		
		
		

	}

}
