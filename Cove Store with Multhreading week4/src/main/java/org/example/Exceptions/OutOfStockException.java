package org.example.Exceptions;

public class OutOfStockException extends RuntimeException{

    public OutOfStockException (String message){
     super(message);
    }

}
