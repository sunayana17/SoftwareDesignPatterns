public class Main {
    public static void main(String[] args) {

        BasicCompanion b = new BasicCompanion();
        b.doSomething();
        System.out.println("\n ******");

        BasicCompanion basic = new BasicCompanion();
        HelperCompanion helper = new HelperCompanion();
        helper.add(basic);
        helper.doSomething();
        System.out.println("\n ******");

        HelperCompanion helper2 = new HelperCompanion();
        AffectiveCompanion affective = new AffectiveCompanion();
        BasicCompanion basic2 = new BasicCompanion();

        helper2.add(affective);
        affective.add(basic2);

        helper2.doSomething();
        System.out.println("\n *****");
    }
}