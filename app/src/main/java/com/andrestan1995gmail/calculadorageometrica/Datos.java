package com.andrestan1995gmail.calculadorageometrica;

import java.util.ArrayList;

/**
 * Created by Estan on 23/09/2017.
 */

public class Datos {
    private static ArrayList<Operacion> operaciones= new ArrayList<>();

    public static void guardar(Operacion p){
        operaciones.add(p);
    }

    public static ArrayList<Operacion> obtener(){
        return operaciones;
    }

}