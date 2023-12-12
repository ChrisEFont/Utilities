package miscelaneous;

import java.util.Scanner;
/**
 *
 * @author chris
 */
public class MenuMaker {    
    
    public static void makeMenu() {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de opciones:");

        int opt = input.nextInt();

        /////////////////////////////////////////////////////////         

        System.out.println("int opt;"); //0

        System.out.println("do{");//0

        System.out.println("  System.out.println(\"Ingrese una opción\");");//2

        for(int i=0; i<opt; i++){
            System.out.println("  System.out.println("+"\""+(i+1)+" - "+"\");");//2
        }

        System.out.println("  System.out.println(\"0 - Finalizar\");");//2        

        System.out.println("  opt=input.nextInt();");//2

        System.out.println("  switch(opt){");//2

        for(int i=0; i<opt; i++){
            System.out.println("    case "+(i+1)+":");//4
            System.out.println("      break;");//6
        }

        System.out.println("    case 0:");//4
        System.out.println("      break;");//6
        System.out.println("    default:");//4
        System.out.println("      System.out.println(\"Opción invalida\");");//6

        System.out.println("  }");//2
        System.out.println("}while(opt!=0);");//0        
    }   
    
}
