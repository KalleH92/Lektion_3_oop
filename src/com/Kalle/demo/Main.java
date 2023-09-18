package com.Kalle.demo;

import com.Kalle.demo.model.Student;

public class Main {
    public static void main(String[] args) {
        //Instansiate object
        Student benny = new Student("Benny",15,true);
        Student frida = new Student("Frida",22,false);

        System.out.println("is this the first commit?");

        benny.name = "Benny";
        frida.name = "Frida";
        benny.age = 15;
        frida.age = 22;

        System.out.println(benny.age);
        System.out.println(benny.isTired);
        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida.isTired);

    }
}

        /*
        System.out.println(addition(15,15));
        System.out.println(addition(299,999));
        System.out.println(addition(999,2134));
    }
    //* How to create a method
    // #1 visibility modifier: public, protected, no-mod, private
    // #2 Static: excluded if not needed
    // #3 Datatype to return: Send data. If nothing == void
    // #4 Name: start with camelcase (addTwoNumbers)
    // %5 Followed by {) and {}

    public static void addition(int x, int y) {
        System.out.println(x + y);
    }
}

         */