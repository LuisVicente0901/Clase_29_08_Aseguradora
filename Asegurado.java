
public class Asegurado{
// Atributos
int edad;
double salario, suma_asegurada, pago_seguro, probabilidad_siniestro;
String nombre;    

public Asegurado(){
    edad=20;
    salario=10000;
    suma_asegurada=20000;
    pago_seguro=500;
    nombre="A";
    probabilidad_siniestro = 0.7;
    }
    
public Asegurado(int edad,double salario, double suma_asegurada,
double pago_seguro,String nombre, double probabilidad_siniestro){
    this.edad=edad;
    this.salario=salario;
    this.suma_asegurada=suma_asegurada;
    this.pago_seguro=pago_seguro;
    this.nombre=nombre;
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