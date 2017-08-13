package tallerdos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tefa-PC
 */
public class RandomAdivinar {
    static int getNumber(int min, int max) {
        return (int) (Math.random() * max - min);
    }
}
