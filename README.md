# Creación de una aseguradora con el fin de practicar los conocimientos de:
- Programación en Java.
  * Estructuras de ciclos y condicionales (`for`,`if/else`)
- Creación de una clase.
  * Declaración de parámetros.
  * Constructores y métodos.

 ## Clase Asegurado:
 - Se contruye el objeto Asegurado con las características:
   * edad (en años)
   * salario (ingresos mensuales en pesos)
   * suma_asegurada (cantidad que el asegurado recibirá si ocurre el siniestro)
   * pago_seguro (pago mensual que el asegurado hace)
   * nombre
   * probabilidad_siniestro (número en $\mathbb R$ entre 0 y 1 que representa la probabilidad que el asegurado tiene de sufrir el riesgo por el que está asegurado)
 - Se tiene un método que compara el salario del asegurado y el pago del seguro para saber si podrá pagar la prima del seguro.

## Clase Aseguradora:
- Esta clase consiste en un arreglo de Asegurados en donde el usuario ingresará los datos de cada Asegurado.
