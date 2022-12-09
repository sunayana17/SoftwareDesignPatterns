import java.util.Observable;

public class Tutor extends Observable {
    private String question;

    public void askQuestion(){
        question = String.valueOf(((int)(Math.random()*10)));
        setChanged();
        notifyObservers();
    }
    public String getQuestions() {
        return question;
    }
}
