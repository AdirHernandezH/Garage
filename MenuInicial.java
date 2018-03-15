/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utbis
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MenuInicial {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
         
        boolean stick=true;
        boolean stick2=false;
        
        Garage camioneta = new Garage("Cromo",false,"Mercedes Bens G63","MB-G-63",9,400000);
        Garage  coche = new Garage("Pepper Gray",false,"Mustang Eleanor 1967","ME-19-67",8,86450);
        Garage camioneta2 = new Garage("Negro",false,"Ford F-750","Ford-GTA-750",6,5043976);
        Garage coche2 = new Garage("Rojo Mate",false,"Acura Nsx","15-67-ffgg",4,120410);
        Garage motocicleta = new Garage("Black Metallic",false,"Ducati 848","SA-08-48",5,1200657);
        
        
        ArrayList<Garage>Almacen=new ArrayList();
        
        Almacen.add(camioneta);
        Almacen.add(coche);
        Almacen.add(camioneta2);
        Almacen.add(coche2);
        Almacen.add(motocicleta);
        
        

        
        do{
         try{
             System.out.println("----- Menu Inicial -----");
        System.out.println("1.- Mostrar vehiculos en Store.");
        System.out.println("2.- Modificar vehiculo.");
        System.out.println("3.- Agregar un vehiculo.");
        System.out.println("4.- Borrar un vehiculo.");
        System.out.println("5.- Salir.");
        System.out.println("->");
        int des=Entrada.nextInt();
        
        //Muestra informacion de los vehiculos en la Store
        
        
        switch(des){
            case 1:
                
                
                ////
                 System.out.println("\n");
                System.out.println("Vehiculos en Store");
                int index=1;
                
                for (Garage auto : Almacen) {
                    System.out.println("Numero.-"+index+" "+auto.getMarca());
                    System.out.println("-------------------------");
                    index++;
                }
                /////
                int res=0;
                System.out.println("\n");
                System.out.println("Introduce El Numero El Vehiculo Para Ver Mas Detalles");
                res=Entrada.nextInt();
                int total=res-1;
                System.out.println("---------------------------------");
                System.out.println(Almacen.get(total).toString());
                System.out.println("---------------------------------");
                
                stick2=true;
            break;
                
            //Modifica un vehiculo dentro de la lista 
            case 2:
                System.out.println("\n");
                System.out.println("-Introduce El Numero De Vehiculo A Modificar-");
                int j=1;
                for(Garage temp:Almacen)
                    {
                        System.out.println("Numero.-"+j+" "+temp.getMarca());
                        j++;
                    }
                int aux2=0;
                System.out.println("introduce el numero del Auto que deseas modificar: ");
                aux2=Entrada.nextInt();
                int tot=aux2-1;
                System.out.println("----------------------------------");
                System.out.println("Vehuiculo a modificar:\n "+Almacen.get(tot).toString());
                System.out.println("----------------------------------");
                            
                            System.out.println("¿Nuevo color?");
                            String ncolorco2=Entrada.next();
                            System.out.println("¿Nuevo ID?");
                            String noid2=Entrada.next();
                            System.out.println("¿Cuntas personas hay en el vehiculo?");
                            int noperson2=Entrada.nextInt();
                            Almacen.get(tot).setColor(ncolorco2);
                            Almacen.get(tot).setid(noid2);
                            Almacen.get(tot).setPasajeros(noperson2);
                            System.out.println("\n");
                            stick2 = true;
                            System.out.println("\n");
                break; 
            
            //Resistra un vehiculo dentro de la lista 
            case 3:
                    System.out.println("xXx Registro De Vehiculo xXx");
                    System.out.println("Ingresa el color del vehiculo?");
                    String color=Entrada.next();
                    System.out.println("Ingresa la marca del vehiculo?");
                    String marca=Entrada.next();
                    System.out.println("Ingresa el numero de placas o ID del vehiculo");
                    String id=Entrada.next();
                    System.out.println("Ingresa el numero de pasajeros del vehiculo");
                    int pasajeros=Entrada.nextInt();
                    System.out.println("Ingresa el precio");
                    float precio=Entrada.nextFloat();
                    Garage aux = new Garage(color,false,marca,id,pasajeros,precio);
                    Almacen.add(aux);
                    
                    stick2=true;
                    System.out.println("\n");
            break;
            
            //Borra un vehiculo de la lista
            case 4:
                    System.out.println("\n");
                System.out.println("-Vehiculos en Almacen-");
                int i=1;
                for(Garage temp:Almacen)
                    {
                        System.out.println("Numero.-"+i+" "+temp.getMarca());
                        i=i+1;
                    }
                System.out.println("\n");
                System.out.println("Numero de auto en stock a eliminar");
                int var=Entrada.nextInt();
                int res1=var-1;
                
                Almacen.remove(res1);
                System.err.println("Auto Eliminado");
            break;
            
            //Cierra el programa
            case 5:
                    stick2 = false;
                    stick = false;
            break;
        }//end of switch
         if(des>5 || des<1){
                         System.err.println("Opcion Erronea!");
                         stick2 = true;
                    }
                } catch (Exception ex) {
                    System.err.println("Vehiculo inexistente.");
                    stick2 = true;
                }
            System.out.println("\n");
            } while(stick2);
        
        
        
        
        
    }
    
    
}
