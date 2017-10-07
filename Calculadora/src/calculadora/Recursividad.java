package calculadora;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**Declaracion de la clase Recursividad
 * @author Harold Pedraza
 * @version 16/09/2017
 */

public class Recursividad {

	//declaracion de los lectores
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    /**Metodo en el cual integro los anteriores parametros con nuevas variables.
    */     
    public static void main(String[] args) throws IOException{
            int option;
            int[]parameters;
            do{
                option = getOption();
                parameters =getParameters(option);
                makeOperation(option, parameters);
            }
            while (option !=12);//diferente a la ultima opcion creada
            bw.write(getOption());
            bw.flush();        
        }
        
        /**metodo en el cual lee la opcion a escogencia.
         *Declaracion clase tipo entero para leer la opcion en la consola
         */         
        public static int getOption() throws IOException{//static cuando no se crean objetos
            bw.write("\nSeleccione por favor una de las siguientes opciones:\n"
                    +"1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Modulo\n"
                    + "6.Potencia\n7. Factorial\n8. Seno\n9. Coseno\n10. Integral\n"
                    + "11. Cuadratica\n12. Salir\n ");        
            bw.flush();//Fuanciona para que imprima el mensaje
            bw.write("\nCual desea?: \n");
            bw.flush();
            int option;
            option = Integer.parseInt(br.readLine());//lector de la opcion escogida
            return option;//devuelve la opcion
        }
        
        /**metodo en el cual hace lectura de la operacion escogida.
        *@param option, parametro option en donde lee la opcion escogida y dependiendo de esta 
        *lee el numero o los numeros a escogencia.
        *declaracion clase entero con arreglo.
        */
        public static int[] getParameters(int option) throws IOException{
            int[] parameters = null;
            switch(option){
                case 1://suma
                {
                   parameters = new int [2];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de suma\n");
                   bw.write("Ingrese el primer valor:\n");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el segundo valor:\n");
                   bw.flush();
                   parameters[1]=Integer.parseInt(br.readLine()); 
                }break;
                case 2://resta
                {
                    parameters = new int [2];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de resta\n");
                   bw.write("Ingrese el primer valor:\n");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el segundo valor:\n");
                   bw.flush();
                   parameters[1]=Integer.parseInt(br.readLine());
                }break;  
                case 3://multiplicacion
                {
                  parameters = new int [2];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de multiplicacion\n");
                   bw.write("Ingrese el primer valor:\n");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el segundo valor:\n");
                   bw.flush();
                   parameters[1]=Integer.parseInt(br.readLine());  
                }break;
                case 4://division
                {
                   parameters = new int [2];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de division\n");
                   bw.write("Ingrese el primer valor:\n");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el segundo valor:\n");
                   bw.flush();
                   parameters[1]=Integer.parseInt(br.readLine()); 
                }break;
                case 5://residuo
                {
                    parameters = new int [2];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de residuo\n");
                   bw.write("Ingrese el primer valor:\n ");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el segundo valor:\n ");
                   bw.flush();
                   parameters[1]=Integer.parseInt(br.readLine());
                }break;
                case 6://potencia
                {
                  parameters = new int [2];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de potencia\n");
                   bw.write("Ingrese la base:\n ");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el exponente:\n ");
                   bw.flush();
                   parameters[1]=Integer.parseInt(br.readLine());  
                }break;
                case 7://factorial
                {
                  parameters = new int [1];//numero de parametros
                  bw.write("\nAcontinuacion se va a realizar una operacion de factorial\n");
                  bw.write("Ingrese numero:\n ");
                  bw.flush();
                  parameters[0]=Integer.parseInt(br.readLine());
                 
                }break;
                case 8://seno
                {
                   parameters = new int [1];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de seno\n");
                   bw.write("Ingrese el valor:\n ");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                }break; 
                case 9://coseno
                {
                   parameters = new int [1];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de coseno:\n");
                   bw.write("Ingrese el valor:\n ");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                }break;  
                case 10://integral
                {
                   parameters = new int [3];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de integral:\n");
                   bw.write("Ingrese el valor:\n ");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el valor inicial:\n ");
                   bw.flush();
                   parameters[1]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el valor final:\n ");
                   bw.flush();
                   parameters[2]=Integer.parseInt(br.readLine());
                }break;
                case 11://cuadratica
                {
                   parameters = new int [3];//numero de parametros
                   bw.write("\nAcontinuacion se va a realizar una operacion de cuadratica:\n");
                   bw.write("Ingrese el primer termino:\n ");
                   bw.flush();
                   parameters[0]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el segundo termino:\n ");
                   bw.flush();
                   parameters[1]=Integer.parseInt(br.readLine());
                   bw.write("Ingrese el tercer termino:\n ");
                   bw.flush();
                   parameters[2]=Integer.parseInt(br.readLine()); 
                }break;
                case 12://salir
                {
                    bw.write("\nAdios\n");
                    bw.flush();
                }break;
                default://incorrecto
                {
                    System.out.println("\nHa ingresado el numero incorrecto...!");
                    System.exit(0);
                }
            }
    return parameters;  
}
        
        /**creacion del constructor.
         *@param option, el parametro option define la opcion seleccionada 
         *@param parameters, este parametro trae los numeros escogidos para realizar la operacion.
         *La clase makeOperation realiza la accion juntando los parametros y abriendo la otra clase en donde estan las operaciones.
        */ 
        public static void makeOperation(int option, int[] parameters) throws IOException{ 
              Operaciones oper = new Operaciones();
            switch(option){
                case 1://suma
                {
                 int result = oper.suma(parameters[0], parameters[1]);
                 bw.write("\nresultado de la suma es "+result+"\n");
                 bw.flush();
                }break;
                case 2://resta
                {
                 int result = oper.resta(parameters[0], parameters[1]);
                 bw.write("\nresultado de la resta es "+result+"\n");
                 bw.flush();
                }break;  
                case 3://multiplicacion
                {
                  int result = oper.multi(parameters[0], parameters[1]);
                  bw.write("\nresultado de la multiplicacion es "+result+"\n");
                  bw.flush(); 
                }break;
                case 4://division
                {
                 int result = (int) oper.division(parameters[0], parameters[1]);
                 bw.write("\nresultado de la division es: "+result+"\n");
                 bw.flush();
                }break;
                case 5://residuo
                {
                   int result = oper.modulo(parameters[0], parameters[1]);
                   bw.write("\nresultado del residuo es: "+result+"\n");
                   bw.flush();
                }break;
                case 6://potencia
                {
                  int result = (int) oper.potencia(parameters[0], parameters[1]);
                  bw.write("\nresultado de la potencia es: "+result+"\n");
                  bw.flush();
                }break;
                case 7://factorial
                {
                 int result = oper.factorial(parameters[0]);
                 bw.write("\nresultado del factorial es: "+result+"\n");
                 bw.flush();
                }break;
                case 8://seno
                {
                  double result = (double) oper.seno(parameters[0]);
                  bw.write("\nresultado del seno es "+result+"\n");
                  bw.flush();
                }break; 
                case 9://coseno
                {
                  int result = (int) oper.coseno(parameters[0]);
                  bw.write("\nresultado del coseno es: "+result+"\n");
                  bw.flush();
                }break;  
                case 10://integral
                {
                   int result = (int) oper.integral(parameters[0], parameters[1], parameters[2]);
                   bw.write("\nresultado de la integral es: "+result+"\n");
                   bw.flush();
                }break;
                case 11://cuadratica
                { 
                   double resultado1[] = oper.cuadratica(parameters[0], parameters[1], parameters[2]);
                   bw.write("\nResultado de la cuadratica 1: "+resultado1[0]+"\n");
                   bw.flush();
                   double resultado2[] = oper.cuadratica(parameters[0], parameters[1], parameters[2]);
                   bw.write("\nResultado de la cuadratica 2: "+resultado2[1]+"\n");
                   bw.flush();
                }break;
                default://salir
                {
                   System.exit(0);
                }
            } 
        }
}
