/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz10;

/**
 *
 * @author Doshchechko
 */
public class MyException  extends Exception{

    public MyException(Throwable e) {
        initCause(e);
        getRussianException();
      
    }
    
    
    public String getRussianException(){
      System.out.println("Произошла страшная ошибка!!");
    return "";
    }
}
