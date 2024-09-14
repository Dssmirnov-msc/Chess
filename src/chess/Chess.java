/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Dmitry
 */
public class Chess {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        int desk_size;
        if (args.length > 0) {
            if (args.length > 0) {
                throw new Exception("Слишком много входных аргументов");
            } else{
                desk_size = Integer.valueOf(args[0]);
            }
        } else {
            System.out.println("Нет входных аргументов. Размер доски по умолчанию 8 x 8");
            desk_size = 8;
        }
        
        
    }
    
}
