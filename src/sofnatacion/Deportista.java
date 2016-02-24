/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofnatacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Deportista {
    protected String nombre;
    protected double doc;
    protected String gen;
    protected int nacimiento;
    protected String categor;
    protected int competencia1;
    protected int competencia2;
    protected int competencia3;
    protected int competencia4;
    
    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDoc() {
        return doc;
    }

    public void setDoc(double doc) {
        this.doc = doc;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(int gen) {
        if(gen==0)
        this.gen = "mujer";
        else
        this.gen = "hombre";    
    }

    public String getCategor() {
        return categor;
    }

    public void setCategor(String categor) {
        this.categor = categor;
    }

    public int getCompetencia1() {
        return competencia1;
    }

    public void setCompetencia1(int competencia1) {
        this.competencia1 = competencia1;
    }

    public int getCompetencia2() {
        return competencia2;
    }

    public void setCompetencia2(int competencia2) {
        this.competencia2 = competencia2;
    }

    public int getCompetencia3() {
        return competencia3;
    }

    public void setCompetencia3(int competencia3) {
        this.competencia3 = competencia3;
    }

    public int getCompetencia4() {
        return competencia4;
    }

    public void setCompetencia4(int competencia4) {
        this.competencia4 = competencia4;
    }



    
    
      

    
}
