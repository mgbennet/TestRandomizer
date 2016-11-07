package testrandomizer;

import java.util.*;

/**
 *
 * @author Mike
 */
public class Question implements TestRandObj{
    
    private String text;
    private List<String> answers;
    private String correctAnswer;
    
    public Question(String txt) {
        text = txt;
        this.answers = new ArrayList<>();
        correctAnswer = null;
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
    public void appendAnswer(String s, boolean isCorrect) {
        answers.add(s);
        if (isCorrect)
            correctAnswer = s;
    }
    
    @Override
    public String writeOut(int num) {
        return num + ". " + this.toString();
    }
    
    @Override
    public String writeAnswerKey(int num) {
        char answer = '?';
        int i = answers.indexOf(correctAnswer);
        if (i >= 0)
            answer = (char) (97+i);
        return num + ": " + answer;
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
