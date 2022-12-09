import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {

    public String answerQuestion( String s)
    {
        System.out.println("Thinking bout " + s);
        return "Thinking bout " + s;
    }
    @Override
    public void update(Observable o, Object arg) {
        String x = ((Tutor)o).getQuestions();
        String y = answerQuestion(x);
    }
}
