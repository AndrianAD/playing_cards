package harp;

/**
 * Created by Андриан on 07.04.2017.
 */
public class Tabs {
    public static final Tabs A0 = new Tabs("1");
    public static final Tabs A1 = new Tabs("-1'");
    public static final Tabs A2 = new Tabs("-1");
    public static final Tabs A3 = new Tabs("1*");
    public static final Tabs A4 = new Tabs("2");
    public static final Tabs A5 = new Tabs("-2''");
    public static final Tabs A6 = new Tabs("-2'");
    public static final Tabs A7 = new Tabs("-2");
    public static final Tabs A8 = new Tabs("-3'''");
    public static final Tabs A9 = new Tabs("-3''");
    public static final Tabs A10 = new Tabs("-3'");
    public static final Tabs A11 = new Tabs("-3");
    public static final Tabs A12 = new Tabs("4");
    public static final Tabs A13 = new Tabs("-4'");
    public static final Tabs A14 = new Tabs("-4");
    public static final Tabs A15 = new Tabs("4*");
    public static final Tabs A16 = new Tabs("5");
    public static final Tabs A17 = new Tabs("-5");
    public static final Tabs A18 = new Tabs("5*");
    public static final Tabs A19 = new Tabs("6");
    public static final Tabs A20 = new Tabs("-6'");
    public static final Tabs A21 = new Tabs("-6");
    public static final Tabs A22 = new Tabs("6*");
    public static final Tabs A23 = new Tabs("-7");
    public static final Tabs A24 = new Tabs("7");
    public static final Tabs A25 = new Tabs("-7*");
    public static final Tabs A26 = new Tabs("-8");
    public static final Tabs A27 = new Tabs("8'");
    public static final Tabs A28 = new Tabs("8");
    public static final Tabs A29 = new Tabs("-9");
    public static final Tabs A30 = new Tabs("9'");
    public static final Tabs A31 = new Tabs("9");
    public static final Tabs A32 = new Tabs("-9*");
    public static final Tabs A33 = new Tabs("-10");
    public static final Tabs A34 = new Tabs("10''");
    public static final Tabs A35 = new Tabs("10'");
    public static final Tabs A36 = new Tabs("10");
    public static final Tabs A37 = new Tabs("-10*");

    public static Tabs[] values = {A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10,
            A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26,
            A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37};

    private String name;

    Tabs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}



