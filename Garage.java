/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utbis
 */
public class Garage {
    
    private String color;
    private boolean status;
    private String marca;
    private String id;
    private int pasajeros;
    private float precio;
    
    public Garage(String color,boolean status,String marca,String id,int pasajeros,float precio)
    {
        this.color=color;
        this.status=status;
        this.marca=marca;
        this.id=id;
        this.pasajeros=pasajeros;
        this.precio=precio;
    }
    
    public void encender(boolean a)
    {
        this.status=a;
    }
    
    public String getColor()
    {
        System.out.println("Color:"+color);
        return color;
    }
    
    public void setColor(String ncolor)
    {
        this.color=ncolor;
    }
    public boolean getPrender()
    {
        if(status)
        {
            System.out.println("Prendido");
        }
        else
        {
            System.out.println("Apagado");
        }
        return status;
    }
    public String getMarca()
    {
        return marca;
    }
    public String getid()
    {
        System.out.println("Numero de placa o ID:"+id);
        return id;
    }
    public float getPrecio()
    {
        return precio;
    }
     public void setid(String id)
    {
        this.id=id;
    }
    public int getPasajeros()
    {
        System.out.println("Hay:"+" "+pasajeros+" "+"personas");
        return pasajeros;
    }
     public void setPasajeros(int pasajeros)
    {
        this.pasajeros=pasajeros;
    }
     public void setPrecio(float nprecio)
     {
         this.precio=nprecio;
     }
    
     @Override
     public String toString(){
    String aux="";
    aux="Color de vehiculo:"+" "+color+"\n"+"La marca es: "+" "+marca+"\n"+"Numero de placas"+" "+id+"\n"+"Hay"+" "+pasajeros+" "+"personas\n"+"El auto esta ";
        if(status){
       aux=aux+"Encendido"+"\nPrecio:"+precio;
       
        }else{
       aux=aux+"Apagado"+"\nPrecio:"+precio;
        }
   return aux;
}
    
    
}
    

