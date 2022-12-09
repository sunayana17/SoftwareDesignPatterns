public class HelperCompanion extends CompanionDecorator{

    @Override
    public void doSomething(){
        super.doSomething();
        System.out.print("i am here to help you. ");
    }
}
