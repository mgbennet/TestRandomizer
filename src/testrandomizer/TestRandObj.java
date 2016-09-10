/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testrandomizer;

/**
 *
 * @author Mike
 */
public interface TestRandObj {
    
    public void shuffle();
    
    public String writeOut(int num);
    
    public int numQuestions();
    
    public String toString();
    
    public void appendAnswer(String s);
}
