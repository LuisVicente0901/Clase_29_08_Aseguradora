
import java.util.Scanner;
public class Aseguradora
{
    Asegurado[] asegurados = new Asegurado[2];
    
    public Aseguradora(){
        

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
}
