
import java.util.Scanner;

public class Asegurado{
// Atributos
int edad;
double salario, suma_asegurada, pago_seguro, probabilidad_siniestro;
String nombre;    
    
public Asegurado(int edad,double salario, double suma_asegurada,
double pago_seguro,String nombre, double probabilidad_siniestro){
    this.edad=edad;
    this.salario=salario;
    this.suma_asegurada=suma_asegurada;
    this.pago_seguro=pago_seguro;
    this.nombre=nombre;
    this.probabilidad_siniestro=probabilidad_siniestro;
}

 public Asegurado(){
    
    Scanner in = new Scanner(System.in);
    System.out.println("Escribe el nombre del asegurado");
    nombre=in.nextLine(); 
        
    System.out.println("Escribe la edad");
    edad = in.nextInt();
        
    System.out.println("Escribe el salario");
    salario=in.nextDouble();
        
    System.out.println("Escribe la suma asegurada");
    suma_asegurada=in.nextDouble();
        
    System.out.println("Escribe el pago anual del seguro");
    pago_seguro=in.nextDouble();
            
    System.out.println("Escribe la probabilidad de siniestración");
    probabilidad_siniestro=in.nextDouble();
    
    this.nombre=nombre;
    this.edad=edad;
    this.salario=salario;
    this.suma_asegurada=suma_asegurada;
    this.pago_seguro=pago_seguro;
    this.probabilidad_siniestro=probabilidad_siniestro;

        }


public boolean si_pagara(){
    if(salario>pago_seguro){
        return true;
    }
    else{
        return false;
    }
}

    
}