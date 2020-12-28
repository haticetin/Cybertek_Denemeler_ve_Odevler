package Assignments.Assignment14.Q13;

import java.util.*;

public class Color {
		
   private int[] rgb = new int[3];
   
   public final static int[] WHITE     = new int[]{255, 255, 255};
   public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
   public final static int[] GRAY      = new int[]{128, 128, 128};
   public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
   public final static int[] BLACK     = new int[]{0, 0, 0};
   public final static int[] RED       = new int[]{255, 0, 0};
   public final static int[] PINK      = new int[]{255, 175, 175};
   public final static int[] ORANGE    = new int[]{255, 200, 0};
   public final static int[] YELLOW    = new int[]{255, 255, 0};
   public final static int[] GREEN     = new int[]{0, 255, 0};
   public final static int[] MAGENTA   = new int[]{255, 0, 255};
   public final static int[] CYAN      = new int[]{0, 255, 255};
   public final static int[] BLUE      = new int[]{0, 0, 255};


   public Color(int r, int g, int b){
	   rgb[0] = r;
	   rgb[1] = g;
	   rgb[2] = b;
   }

   public Color() {
       this(255, 255, 255);
   }

   
   public String toString() {
       
	   int[][] colorCode = {{255, 255, 255},{192, 192, 192},{128, 128, 128},{64, 64, 64},{0, 0, 0},{255, 0, 0},
			   {255, 175, 175},{255, 200, 0},{255, 255, 0},{0, 255, 0},{255, 0, 255},{0, 255, 255},{0, 0, 255}};
	   
	   String [] colorName = {"white", "light gray", "gray", "dark gray", "black", "red", "pink", "orange", "yellow", "green", "magenta", "cyan", "blue"};
	   
	   for(int i=0; i<colorCode.length; i++) {
		  
		   if(Arrays.equals(rgb, colorCode[i])) {
			   return colorName[i];
		   }
		   
	   }
      
       return "n/a"; 
   }

}
