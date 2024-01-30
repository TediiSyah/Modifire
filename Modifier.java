
package com.mycompany.modifier;

/**
 *
 * @author Tedii
 */
public class Modifier {

    public static void main(String[] args) {
       
        //public
        Person person = new Person();
        
        person.NAME = "Tedii";
        
        System.out.println("Nama saya Public adalah = " + person.NAME);
        
        //private
        
        Person Person = new Person();
        Person.setName("Tedii");
        
        System.out.println("Nama saya private adalah = " + Person.getName());
    
    
        //Protected
        Person PERSON = new Person();

            PERSON.NAME = "Tedii";
            System.out.println("Nama saya protacted adalah = " + PERSON.NAME);
    }
}
