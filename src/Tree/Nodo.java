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

    private boolean Value;
    private Nodo primerHijo;
    private Nodo segundoHijo;
    private Nodo tercerHijo;
    private Nodo cuartoHijo;

    public Nodo() {
        this.Value = false;
        this.primerHijo = null;
        this.segundoHijo = null;
        this.tercerHijo = null;
        this.cuartoHijo = null;
    }

    public Nodo(boolean Value) {
        this.Value = Value;
        this.primerHijo = null;
        this.segundoHijo = null;
        this.tercerHijo = null;
        this.cuartoHijo = null;
    }

    public Nodo(boolean Value, Nodo primerHijo, Nodo segundoHijo, Nodo tercerHijo, Nodo cuartoHijo) {
        this.Value = Value;
        this.primerHijo = primerHijo;
        this.segundoHijo = segundoHijo;
        this.tercerHijo = tercerHijo;
        this.cuartoHijo = cuartoHijo;
    }

    public boolean isValue() {
        return Value;
    }

    public void setValue(boolean Value) {
        this.Value = Value;
    }

    public boolean hasPrimerHijo() {
        if (primerHijo != null) {
            return true;
        } else {
            return false;
        }
    }

    public void primerHijo(Nodo primerHijo) {
        this.primerHijo = primerHijo;
    }

    public boolean hasSegundoHijo() {
        if (segundoHijo != null) {
            return true;
        } else {
            return false;
        }
    }

    public void segundoHijo(Nodo segundoHijo) {
        this.segundoHijo = segundoHijo;
    }

    public boolean hasTercerHijo() {
        if (tercerHijo != null) {
            return true;
        } else {
            return false;
        }
    }

    public void tercerHijo(Nodo tercerHijo) {
        this.tercerHijo = tercerHijo;
    }

    public boolean hasCuartoHijo() {
        if (cuartoHijo != null) {
            return true;
        } else {
            return false;
        }
    }

    public void cuartoHijo(Nodo cuartoHijo) {
        this.cuartoHijo = cuartoHijo;
    }

    public Nodo getPrimerHijo() {
        return primerHijo;
    }

    public Nodo getSegundoHijo() {
        return segundoHijo;
    }

    public Nodo getTercerHijo() {
        return tercerHijo;
    }

    public Nodo getCuartoHijo() {
        return cuartoHijo;
    }

}
