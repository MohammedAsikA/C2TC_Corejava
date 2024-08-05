package com.tnsif.dayeight.abstractioncom.tnsif.dayeight.interfaces.nestedinterfaces;

public class MyInterface {
	void calculateArea() {
	}
    interface MyInnerInterface {
       int  id = 20;
       void print();     
       void calculateArea();
	    interface MyInnerInterface {
	       int  id = 20;
	       void print();     
	    }
    }
}
