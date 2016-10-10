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
    
    @Override
    public void appendAnswer(String s) {
        answers.add(s);
    }
    
    @Override
    public String writeOut(int num) {
        return num + ". " + this.toString();
    }
    
    @Override
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
        String result = text;
        for (int i = 0; i < answers.size(); i++) {
            char c = (char) (97+i);
            result += "\r\n " + c + ") " + answers.get(i);
        }
        return result;
    }
}
