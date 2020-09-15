/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.util.Scanner;

/**
 *
 * @author kuroc
 */
public class BoundProperty {

    
    
    public static void main(String[] args) {
        Scanner fr = new Scanner(System.in);
        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        while(true){
            System.out.print("Enter Score :");
            String input = fr.nextLine();
            mySource.setSoccerscore(input);
            if(input.equals(""))
           { System.exit(0); }
    }
    
}

}