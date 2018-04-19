public enum Hi {
    SUCCESS(1,"AA");
    // 成员变量
    private String name;
    private int index;

    Hi(int index,String name) {
        this.name = name;
        this.index = index;
    }
    // 普通方法
    public static String getName(int index) {
        for (Hi c : Hi.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
