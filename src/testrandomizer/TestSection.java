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
        return questions.isEmpty();
    }
    
    @Override
    public int numQuestions() {
        int result = 0;
        for (TestRandObj question : questions) {
            result += question.numQuestions();
        }
        return result;
    }
    
    @Override
    public String writeOut(int num) {
        String result = "";
        for (TestRandObj i : questions) {
            if (!result.equals("")) {
                result += "\r\n\r\n";
            }
            result += i.writeOut(num);
            num += i.numQuestions();
        }
        return result + "";
    }
    
    public int size() {
        return questions.size();
    }
    
    public TestRandObj get(int i) {
        return questions.get(i);
    }
    
    @Override
    public void shuffle() {
        for (TestRandObj question : questions) {
            question.shuffle();
        }
        Collections.shuffle(questions);
    }
    
    @Override
    public void appendAnswer(String s) {
        questions.get(questions.size()-1).appendAnswer(s);
    }
    
    @Override
    public String toString() {
        String result = "{";
        for (int i = 0; i < questions.size(); i++) {
            if (i != 0) {
                result += "\r\n\r\n";
            }
            result += questions.get(i).toString();
        }
        return result + "}";
    }
    
}
