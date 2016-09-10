/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testrandomizer;

import java.util.*;

/**
 *
 * @author Mike
 */
public class Question implements TestRandObj{
    
    private String text;
    private List<String> answers;
    
    public Question(String txt) {
        text = txt;
        this.answers = new ArrayList<>();
    }
    
    @Override
    public void shuffle() {
        Collections.shuffle(answers);
    }
    
    public void setText(String s) {
        text = s;
    }
    
    public String getText() {
        return text;
    }
    
    public void appendAnswer(String s) {
        answers.add(s);
    }
    
    public String writeOut(int num) {
        return num+". "+this.toString();
    }
    
    public int numQuestions() {
        return 1;
    }
    
    public List getAnswers() {
        return answers;
    }
    
    public String getAnswer(int i) {
        return answers.get(i);
    }
    
    @Override
    public String toString() {
        String returnMe = text;
        for (int i = 0; i<answers.size(); i++) {
            char c = (char) (97+i);
            returnMe += "\r\n " +c+") "+answers.get(i);
        }
        return returnMe;
    }
}
