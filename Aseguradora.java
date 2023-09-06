import java.util.Scanner;

public class Aseguradora{
    
    Asegurado[] asegurados ;
    
    
    
    public Aseguradora(){
        
        Scanner numero = new Scanner(System.in);
        System.out.println("¿Cuántos asegurados tendra la aseguradora?");
        int numero_asegurados = numero.nextInt();
        asegurados = new Asegurado[numero_asegurados];
        

        for(int i=0;i<asegurados.length;i++){
            
            Scanner in = new Scanner(System.in);
            
            System.out.println("Escribe el nombre del asegurado número "+(i+1));
            String nombre=in.nextLine(); 
        
            System.out.println("Escribe la edad");
            int edad = in.nextInt();
        
            System.out.println("Escribe el salario");
            double salario=in.nextDouble();
        
            System.out.println("Escribe la suma asegurada");
            double suma_asegurada=in.nextDouble();
        
            
            System.out.println("Escribe el pago anual del seguro");
            double pago_seguro=in.nextDouble();
            
            System.out.println("Escribe la probabilidad de siniestración");
            double probabilidad_siniestro=in.nextDouble();

            
            asegurados[i]=new Asegurado(edad, salario,  suma_asegurada, 
            pago_seguro,nombre,probabilidad_siniestro);
        }
        
        
    }
    
    public Aseguradora(int edad, double salario, double suma_asegurada, 
    double pago_seguro, String nombre, double probabilidad_siniestro){
        for(int i=0;i<asegurados.length;i++){
            asegurados[i]=new Asegurado(edad, salario, suma_asegurada, 
            pago_seguro,nombre,probabilidad_siniestro);
        }
    }   
    
    
}