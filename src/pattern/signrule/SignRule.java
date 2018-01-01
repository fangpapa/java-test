package pattern.signrule;

interface SignRule {

    default String getSign(String reasonCode) {
        if ("A2".equals(reasonCode)) {
            return signA2();
        } else if ("A3".equals(reasonCode)) {
            return signA3();
        }
        return null;
    }

    abstract String signA2();
    abstract String signA3();
}
