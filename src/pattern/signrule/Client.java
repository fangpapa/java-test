package pattern.signrule;

public class Client {

    public static void main(String[] args) {
        SignRule s = SignRuleImpl.getSignRule("2V");
        System.out.println(s.getSign("A2"));
    }

}
