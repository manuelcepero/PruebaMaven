package com.manuelceperosanchez.prueba;

import java.util.ArrayList;
import java.util.List;

import com.manuelceperosanchez.modelo.Coche;
import com.manuelceperosanchez.modelo.Persona;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello world!");
    	
    	Persona persona1 = new Persona("Paco");
        Persona persona2 = new Persona("Carlos");
        
        List<Persona> personas = new ArrayList();
        personas.add(persona1);
        personas.add(persona2);
        
        Coche coche1 = new Coche(personas);
        
        System.out.println(persona1.nombre);
        System.out.println(persona2.nombre);
    }
}
