public abstract class CompanionDecorator implements Companion{

    protected Companion c;

    public void add(Companion c){
        this.c = c;
    }

    @Override
    public void doSomething() {
        c.doSomething();
    }
}
