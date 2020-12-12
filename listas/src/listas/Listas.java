package listas;

import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
    Estructura Lista=null;
    Scanner Leer=new Scanner(System.in);
    int opcion=0;
    int numero;
    while(true){
        System.out.println("1.-Ingresar datos de la lista");
        System.out.println("2.- mostrar datos de la lista");
        System.out.println("seleccione su opcion");
        opcion=Leer.nextInt();
        switch (opcion){
            case 1:
            {
                System.out.println("Ingrese unn numero a la lista");
                numero=Leer.nextInt();
                Estructura aux =new Estructura();
                aux.numero=numero;
                aux.anterior=Lista;
                Lista =aux;
                System.out.println("Ingresado correctamente");
                break;
                
            }
            case 2:
            {
                if (Lista==null){
                    System.out.println("la lista esta vacia");
                }else{
                    System.out.println("Los datos de la lista son:");
                    Estructura aux=Lista;
                    while(aux!=null){
                        System.out.println(""+aux.numero);
                        aux=aux.anterior;
                        
                    }
                    
                    
                }
                break;
            }
            
            }
        }
    }
    
}
    

