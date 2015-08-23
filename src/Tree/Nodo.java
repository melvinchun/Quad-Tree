/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author Brenda
 */
public class Nodo {

    private boolean value;
    private Nodo cuadrante1;
    private Nodo cuadrante2;
    private Nodo cuadrante3;
    private Nodo cuadrante4;

    public Nodo() {
        this.value = false;
        this.cuadrante1 = null;
        this.cuadrante2 = null;
        this.cuadrante3 = null;
        this.cuadrante4 = null;
    }

    public Nodo(Nodo primerHijo, Nodo segundoHijo, Nodo tercerHijo, Nodo cuartoHijo) {
        this.value = true;
        this.cuadrante1 = primerHijo;
        this.cuadrante2 = segundoHijo;
        this.cuadrante3 = tercerHijo;
        this.cuadrante4 = cuartoHijo;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean Value) {
        this.value = Value;
        if(value==true){
           this.cuadrante1 = new Nodo();
           this.cuadrante2 = new Nodo();
           this.cuadrante3 = new Nodo();
           this.cuadrante4 = new Nodo(); 
        }
    }

    public boolean hasCuadrante1() {
        if (cuadrante1 != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasCuadrante2() {
        if (cuadrante2 != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasCuadrante3() {
        if (cuadrante3 != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasCuadrante4() {
        if (cuadrante4 != null) {
            return true;
        } else {
            return false;
        }
    }

    public Nodo getCuadrante1() {
        return cuadrante1;
    }

    public Nodo getCuadrante2() {
        return cuadrante2;
    }

    public Nodo getCuadrante3() {
        return cuadrante3;
    }

    public Nodo getCuadrante4() {
        return cuadrante4;
    }

    public void setCuadrante1(Nodo cuadrante1) {
        value = true;
        this.cuadrante1 = cuadrante1;
    }

    public void setCuadrante2(Nodo cuadrante2) {
        value = true;
        this.cuadrante2 = cuadrante2;
    }

    public void setCuadrante3(Nodo cuadrante3) {
        value = true;
        this.cuadrante3 = cuadrante3;
    }

    public void setCuadrante4(Nodo cuadrante4) {
        value = true;
        this.cuadrante4 = cuadrante4;
    }
    
}
