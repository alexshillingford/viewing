/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

/**
 *
 * @author etcharn1
 */
public interface StackInterface<T> {
    T pop() throws Exception;
    T peek() throws Exception;
    void push(T item);
    boolean isEmpty();
    void clear();
}
