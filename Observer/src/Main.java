public class Main {
    public static void main(String[] args) {

        Student student= new Student();
        Tutor tutor = new Tutor();
        tutor.addObserver(student);

        tutor.askQuestion();

    }
}