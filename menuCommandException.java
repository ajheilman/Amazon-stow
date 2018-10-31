/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajhei
 */
public class menuCommandException extends Exception {

    /**
     * Creates a new instance of <code>menuCommandException</code> without
     * detail message.
     */
    public menuCommandException() {
        super("You didn't type in a number! Please try again.");
    }

    /**
     * Constructs an instance of <code>menuCommandException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public menuCommandException(String msg) {
        super(msg);
    }
}
