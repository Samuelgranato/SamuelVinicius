package br.pro.hashi.ensino.desagil.tequilada;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void ImprimeTab(Boolean[ ] [ ] tab,int h, int w){
		for(int i=0;i<h;i++){
			
			for(int j=0;j<w;j++){
					System.out.print(tab[i][j]);
					
				}
			}
			
			System.out.println();
		}
		
		
	}
	
	
	 public static void main(String x[]) throws IOException{
		File testDoc = new File("C:\\Users\\Samuel\\workspace\\SamuelVinicius\\labirinto.txt");
        BufferedReader reader = new BufferedReader(new FileReader(testDoc));
        String tamanho = reader.readLine();
                
        int h=Integer.parseInt(tamanho.split(" ")[0]);
        int w=Integer.parseInt(tamanho.split(" ")[1]);
        
        Boolean[ ] [ ] tab = new Boolean [ h ] [ w ] ;
        
        String linha = "";
        
        for(int j = 0; j < h;j++){
        	linha =reader.readLine();
        	
	        for (int i = 0; i < linha.length(); i++) {
	   		
	         char aux=linha.charAt(i);
	   		 if(aux=='#'){
	   			 
	   			//System.out.print("X");
	   			tab[j][i]=true;
	   			
	   		 }else{
	   			//System.out.print(" ");
	   			tab[j][i]=false;
	   		 }
	   		 
	        }
	        //System.out.println("");
        }
        reader.close();
        ImprimeTab(tab,h,w); 
        

	 }
}