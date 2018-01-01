package pattern.signrule;

public class SignRuleImpl {

    private SignRuleImpl() {

    }

    public static SignRule getSignRule(String bu) {
        if ("SP".equals(bu) || "TH".equals(bu) || "IN".equals(bu) || "MA".equals(bu)) {
            return new SouthAsiaSignRule();
        } else if ("67".equals(bu) || "KR".equals(bu) || "BS".equals(bu)) {
            return new KoreaSignRule();
        } else {
            return new TaiwanSignRule();
        }
    }
}
