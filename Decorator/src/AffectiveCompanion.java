public class AffectiveCompanion extends CompanionDecorator{

    @Override
    public void doSomething(){
        super.doSomething();
        System.out.print(" I am here to cheer you. ");
    }
}
