package Sudo;

public class MatrixCheck
{
  public static boolean matcheck(int[][] datos) { 
int cant=0;  
for (int i = 0; i < datos.length; i++) { 
for (int j = 0; j < datos[0].length; j++) { 
for (int k = 0; k < datos.length; k++) { 
for (int l = 0; l < datos[0].length; l++) { 
if (datos[i][j] == datos[k][l]) { 
cant++; 
} 
} 
} 
if(cant > 1){ 
return false; 
} 
cant=0; 
} 
} 
return true; 
} 
   // if(repeatition then false else true)
}
