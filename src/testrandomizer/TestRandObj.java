package testrandomizer;

/**
 *
 * @author Mike
 */
public interface TestRandObj {
    
    public void shuffle();
    
    public String writeOut(int num);
    
    public String writeAnswerKey(int num);
    
    public int numQuestions();
    
    @Override
    public String toString();
    
    public void appendAnswer(String s);
    
    public void appendAnswer(String s, boolean isCorrect);
}
