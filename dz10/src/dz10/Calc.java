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
public class Calc {

    static void Podschet() throws MyException {

        String s = ConsVvod.vvod();
        String[] sArray = s.split("\\D");
        //if(sArray[0])
        char znak ='2';
        try{
        znak = s.charAt(sArray[0].length());
        }
        catch(){
        
        
        
        }
      
            double chisl1=0.0;
            double chisl2=0.0;
        try{
            chisl1=Double.valueOf(sArray[0]);
            chisl2=Double.valueOf(sArray[1]);
        }catch(Exception e){
            throw new MyException(e); 
        
        }
        
        switch (znak) {

            case '+':
                System.out.println( chisl1+ chisl2);
                //  return sArray[0]+sArray[1];
                break;
            case '-':
                System.out.println(chisl1 - chisl2);
                // return sArray[0]-sArray[1];
                break;
            case '/':
                System.out.println(chisl1 / chisl2);
                //   return sArray[0]+sArray[1];
                break;
            case '*':
                System.out.println(chisl1 * chisl2);
                //   return sArray[0]+sArray[1];

                break;

        }
     
       
    }

}
