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
public class TestSection implements TestRandObj{
    
    private List<TestRandObj> questions;
    
    public TestSection() {
        questions = new ArrayList<>();
    }
    
    public TestSection(List<TestRandObj> questions) {
        this.questions = questions;
    }
    
    public void add(TestRandObj inp) {
        questions.add(inp);
    }
    
    public Boolean isEmpty() {
        return (questions.size()==0);
    }
    
    public int numQuestions() {
        int returnMe = 0;
        for (int i = 0; i < questions.size(); i++) {
            returnMe += questions.get(i).numQuestions();
        }
        return returnMe;
    }
    
    public String writeOut(int num) {
        String returnMe = "";
        for (TestRandObj i : questions) {
            if (!returnMe.equals("")) {
                returnMe += "\r\n\r\n";
            }
            returnMe += i.writeOut(num);
            num+=i.numQuestions();
        }
        return returnMe+"";
    }
    
    public int size() {
        return questions.size();
    }
    
    public TestRandObj get(int i) {
        return questions.get(i);
    }
    
    @Override
    public void shuffle() {
        for (int i = 0; i < questions.size(); i++) {
            questions.get(i).shuffle();
        }
        Collections.shuffle(questions);
    }
    
    public void appendAnswer(String s) {
        questions.get(questions.size()-1).appendAnswer(s);
    }
    
    @Override
    public String toString() {
        String returnMe = "{";
        for (int i = 0; i<questions.size(); i++) {
            if (i!=0) {
                returnMe+="\r\n\r\n";
            }
            returnMe += questions.get(i).toString();
        }
        return returnMe+"}";
    }
    
}
