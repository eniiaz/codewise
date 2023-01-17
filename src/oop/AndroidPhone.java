package oop;

import com.sun.tools.corba.se.idl.constExpr.And;
import oopRecap.SmartPhone;

public class AndroidPhone extends SmartPhone {

// AndroidPhone <- SmartPhone <- Phone <- Object
    // means it calls(creates) its' super classes default constructor
    // super(); => calling SmartPhone default constructor
    // Why? Because it needs to create an object from parent
    // so that java technology works. Then it inherits its' properties

    public AndroidPhone(){
        super();
          System.out.println("Hey there. It's AndroidPhone default constructor");
    }

    public AndroidPhone(String color){
        this.color = color;
    }

    public AndroidPhone(String color, String brand){
        this(color);
    }


}
