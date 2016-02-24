/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofnatacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class SofNatacion {
int contador=0, cod=1; //variable llevar control usuarios ingresados
    Deportista depor[] = new Deportista[100]; //creando el arreglo de objetos (clase userBanc
    
    public SofNatacion(){ //constructor de la clase 
        Scanner lector= new Scanner(System.in);
        int sel=0, sel1=0, op1=0;
            
        do{
            System.out.println("Qué desea hacer: ");
            System.out.println("1. Gestionar deportistas 2. Inscribir en competencia 3. Salir");
            op1=lector.nextInt();
        if(op1==1){
        do{
            System.out.println(     "1. Ingresar "
                                   +"2. Atualizar "
                                   +"3. Eliminar "
                                   +"4. Buscar "
                                   +"5. Salir ");
            sel=lector.nextInt();
                switch(sel){
                    case 1:
                        ingresarD();
                        break;
                    case 2:
                        actualizarD();
                        break;
                    case 3:
                        eliminarD();
                        break;
                    case 4:
                        buscarD();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("No es una opción");                  
                }
            }while(sel!=5);
        }
        else if(op1==2){
            do{
            System.out.println(     "1. Inscribir nadador a prueba "
                                   +"2. Eliminar nadaro "
                                   +"3. Mostrar prueba"
                                   +"4. Salir ");
                sel1=lector.nextInt();
                switch(sel1){
                    case 1:
                        inscribirN();
                        break;
                    case 2:
                        eliminarN();
                        break;
                    case 3:
                        mostrarPrueba();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("No es una opción");                  
                }            
            }while(sel1!=4);
        }
        }while (op1!=3);
    }
    

    public void ingresarD(){
        Deportista deportemp= new Deportista();
        String nombre;
        double doc;
        int gen;
        int nan, edad;
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese nombre completo: ");
        nombre=lector.nextLine();
        deportemp.setNombre(nombre);
        System.out.println("Ingrese documento identidad: ");
        doc=lector.nextDouble();
        deportemp.setDoc(doc);
        System.out.println("Ingrese año nacimiento: ");
        nan=lector.nextInt();
        deportemp.setNacimiento(nan);
        System.out.println("Ingrese rama(0. mujer 1. hombre): ");
        gen=lector.nextInt();
        deportemp.setGen(gen);
        edad=2016-nan;
        if(5<edad && edad<11){
            deportemp.setCategor("Infantil A");
        }
        if(10<edad && edad<18){
            deportemp.setCategor("Infantil B");
        }
        if(17<edad && edad<26){
            deportemp.setCategor("Juvenil");
        }
        if(25<edad){
            deportemp.setCategor("Senior");
        }
        
        depor[contador] = deportemp;
        contador++;
        
        
    }
    
      public void actualizarD(){

          Deportista deportemp= new Deportista();
        double iden;
        String nombre;
        double doc;
        int gen, existe=0;
        int nan, edad;
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite la identificacion del nadador a buscar: ");
        iden=lector.nextDouble();
        if(contador!=0){
                for(int i=0; i<contador; i++){
                    if(iden==depor[i].getDoc()){
                                lector.nextLine();
                                System.out.println("Ingrese nombre completo: ");
                                nombre=lector.nextLine();
                                deportemp.setNombre(nombre);
                                System.out.println("Ingrese año nacimiento: ");
                                nan=lector.nextInt();
                                deportemp.setNacimiento(nan);
                                System.out.println("Ingrese rama(0. mujer 1. hombre): ");
                                gen=lector.nextInt();
                                deportemp.setGen(gen);
                                edad=2016-nan;
                                deportemp.setDoc(iden);
                                if(5<edad && edad<11){
                                    deportemp.setCategor("Infantil A");
                                }
                                if(10<edad && edad<18){
                                    deportemp.setCategor("Infantil B");
                                }
                                if(17<edad && edad<26){
                                    deportemp.setCategor("Juvenil");
                                }
                                if(25<edad){
                                    deportemp.setCategor("Senior");
                                }

                                depor[i] = deportemp;
                                existe=1;

                    }
 
                }
                if(existe==0)
                    System.out.println("No se ha encontrado el usuario");
                
            }
        
    }
    
    public void eliminarD(){
        double iden;
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite la identificacion del nadador a eliminar: ");
        iden=lector.nextDouble();
        Deportista deporTemp[] = new Deportista[contador-1];

 
                            for(int i=0; i<contador; i++){ //Inicio ciclo para realizar la eliminacion
                                if(iden == depor[i].getDoc()){ //si el codigo a aliminar coincide con el codigo que hay en la posicion i
                                    depor[i]=null; contador--;
                                    System.out.println("Deportista elinimado ");
                                }
                                else{

                                        deporTemp[i-1] = depor[i]; //se almacena con el nuevo codigo
                                    
                                }                                                                   
                            } //Fin ciclo para realizar la eliminacion
                            
                            depor = new Deportista[100]; //se vuelve a crear el arreglo 
                            for(int i=0; i<deporTemp.length; i++){ //se almacenan los valores no eliminados
                                depor[i]=deporTemp[i];
                            }                            
                        }

    
    public void buscarD(){
        double iden;
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite la identificacion del nadador a buscar: ");
        iden=lector.nextDouble();
        if(contador!=0){
                for(int i=0; i<contador; i++){
                    if(iden==depor[i].getDoc()){
                         System.out.println("Nombre completo: " +depor[i].getNombre());
                         System.out.println("Genero: "+depor[i].getGen());
                         System.out.println("Año nacimiento: "+depor[i].getNacimiento());
                         System.out.println("Categoria: "+depor[i].getCategor());
                         
        
                    }
                    else{
                        System.out.println("No se ha encontrado el usuario"); 
                    }
                }
                
            }
 
        }
    
    public void inscribirN(){
        double iden;
        int selprueba;
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite la identificacion del nadador a inscribir: ");
        iden=lector.nextDouble();
        if(contador!=0){
                for(int i=0; i<contador; i++){
                    if(iden==depor[i].getDoc()){
                        System.out.println("Competencia a nadar \n 1. Libre 2. Mariposa 3. Pecho 4. Espalda ");
                        selprueba=lector.nextInt();
                        
                        if(selprueba==1)
                            depor[i].setCompetencia1(1);
                        else
                            depor[i].setCompetencia1(0);
                        if(selprueba==2)
                            depor[i].setCompetencia2(1);
                        else
                            depor[i].setCompetencia2(0);
                        if(selprueba==3)
                            depor[i].setCompetencia3(1);
                        else
                            depor[i].setCompetencia3(0);
                        if(selprueba==4)
                            depor[i].setCompetencia4(1);
                        else
                            depor[i].setCompetencia4(0);
                         
                        
                    }
                    else{
                        System.out.println("No se ha encontrado el usuario"); 
                    }
                }
                
            }
        
    }
    public void eliminarN(){
        double iden;
        int selprueba=0;
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite la identificacion del nadador a inscribir: ");
        iden=lector.nextDouble();
        if(contador!=0){
                for(int i=0; i<contador; i++){
                    if(iden==depor[i].getDoc()){
                        System.out.println("Está inscrito en: ");
                        
                        if(depor[i].getCompetencia1()==1)
                            System.out.println("Libre ");
                        if(depor[i].getCompetencia2()==1)
                            System.out.println("Mariposa ");
                        if(depor[i].getCompetencia3()==1)
                            System.out.println("Pecho ");
                        if(depor[i].getCompetencia4()==1)
                            System.out.println("Espalda ");
                        System.out.println("Competencia a eliminar \n 1. Libre 2. Mariposa 3. Pecho 4. Espalda ");
                        selprueba=lector.nextInt();
                        if(selprueba==1)
                            depor[i].setCompetencia1(0);
                        if(selprueba==2)
                            depor[i].setCompetencia2(0);
                        if(selprueba==3)
                            depor[i].setCompetencia3(0);
                        if(selprueba==4)
                            depor[i].setCompetencia4(0);

                         
        
                    }
                    else{
                        System.out.println("No se ha encontrado el usuario"); 
                    }
                }
                
            }
    }
    
    public void mostrarPrueba(){
        double iden;
        int selprueba=0;
        Scanner lector= new Scanner(System.in);
        System.out.println("Competencia a listar \n 1. Libre 2. Mariposa 3. Pecho 4. Espalda ");
        selprueba=lector.nextInt();   
        if(contador!=0){
                for(int i=0; i<contador; i++){
                    if(depor[i].getCompetencia1()==1 ){
                        System.out.println(depor[i].getNombre());
                        System.out.println("Está inscrito en: ");
                        
                        if(depor[i].getCompetencia1()==1)
                            System.out.println("Libre ");
                        if(depor[i].getCompetencia2()==1)
                            System.out.println("Mariposa ");
                        if(depor[i].getCompetencia3()==1)
                            System.out.println("Pecho ");
                        if(depor[i].getCompetencia4()==1)
                            System.out.println("Espalda ");
                        System.out.println("Competencia a eliminar \n 1. Libre 2. Mariposa 3. Pecho 4. Espalda ");
                        selprueba=lector.nextInt();
                        if(selprueba==1)
                            depor[i].setCompetencia1(0);
                        if(selprueba==2)
                            depor[i].setCompetencia2(0);
                        if(selprueba==3)
                            depor[i].setCompetencia3(0);
                        if(selprueba==4)
                            depor[i].setCompetencia4(0);

                         
        
                    }
                    else{
                        System.out.println("No se ha encontrado el usuario"); 
                    }
                }
                
            }
    }
    


    public static void main(String[] args) {
        SofNatacion nat1=new SofNatacion();
        System.exit(0);        
        
    }
}

