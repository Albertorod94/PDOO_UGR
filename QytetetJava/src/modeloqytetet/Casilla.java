/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

/**
 *
 * @author albertorodriguez
 */
public class Casilla {
    
    private int numeroCasilla;
    private int coste;
    private int numHoteles;
    private int numCasas;
    private TipoCasilla tipo;
    private TituloPropiedad titulo;
    
    //Constructor para casillas que no son de tipo calle
    public Casilla(int numeroCasilla, TipoCasilla tipo){
        this.numeroCasilla=numeroCasilla;
        this.tipo=tipo;
    }
    
    //CONSTRUCTOR PARA LA CASILLA DE TIPO IMPUESTO
    public Casilla(int numeroCasilla, int coste, TipoCasilla tipo){
        this.numeroCasilla=numeroCasilla;
        this.coste=coste;
        this.tipo=tipo;
    }

    public Casilla(int numeroCasilla, int coste, TipoCasilla tipo, TituloPropiedad titulo) {
        this.numeroCasilla = numeroCasilla;
        this.coste = coste;
        this.numHoteles = 0;
        this.numCasas = 0;
        this.tipo = tipo;
        this.titulo = titulo;
    }  

    @Override
    public String toString() {
        if(tipo==TipoCasilla.CALLE)
            return "\nCasilla{" + "numeroCasilla=" + numeroCasilla + ", coste=" + coste + ", numHoteles=" + numHoteles + ", numCasas=" + numCasas + ", tipo=" + tipo + ", titulo=" + titulo + '}';
        else
            return "\nCasilla{" + "numeroCasilla=" + numeroCasilla + ", tipo=" + tipo + '}';
    }
    
 
    
    private void setTituloPropiedad(TituloPropiedad titulo){
        this.titulo=titulo;
    }
    
    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public int getCoste() {
        return coste;
    }

    public int getNumHoteles() {
        return numHoteles;
    }

    public int getNumCasas() {
        return numCasas;
    }

    public TipoCasilla getTipo() {
        return tipo;
    }

    public TituloPropiedad getTitulo() {
        return titulo;
    }

    public void setNumHoteles(int numHoteles) {
        this.numHoteles = numHoteles;
    }

    public void setNumCasas(int numCasas) {
        this.numCasas = numCasas;
    }

    



}

