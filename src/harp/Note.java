package harp;

/**
 * Created by Андриан on 07.04.2017.
 */
public class Note {
    public static final Note A0 = new Note("G");
    public static final Note A1 = new Note("Ab");
    public static final Note A2 = new Note("A");
    public static final Note A3 = new Note("Bb");
    public static final Note A4 = new Note("B");
    public static final Note A5 = new Note("C");
    public static final Note A6 = new Note("C#");
    public static final Note A7 = new Note("D");
    public static final Note A8 = new Note("Eb");
    public static final Note A9 = new Note("E");
    public static final Note A10 = new Note("F");
    public static final Note A11 = new Note("F#");
    public static final Note A12 = new Note("G");
    public static final Note A13 = new Note("Ab");
    public static final Note A14 = new Note("A");
    public static final Note A15 = new Note("Bb");
    public static final Note A16 = new Note("B");
    public static final Note A17 = new Note("C");
    public static final Note A18 = new Note("C#");
    public static final Note A19 = new Note("D");
    public static final Note A20 = new Note("Eb");
    public static final Note A21 = new Note("E");
    public static final Note A22 = new Note("F");
    public static final Note A23 = new Note("F#");
    public static final Note A24 = new Note("G");
    public static final Note A25 = new Note("Ab");
    public static final Note A26 = new Note("A");
    public static final Note A27 = new Note("Bb");
    public static final Note A28 = new Note("B");
    public static final Note A29 = new Note("C");
    public static final Note A30 = new Note("C#");
    public static final Note A31 = new Note("D");
    public static final Note A32 = new Note("Eb");
    public static final Note A33 = new Note("E");
    public static final Note A34 = new Note("F");
    public static final Note A35 = new Note("F#");
    public static final Note A36 = new Note("G");
    public static final Note A37 = new Note("Ab");
    public static final Note A38 = new Note("A");
    public static final Note A39 = new Note("Bb");
    public static final Note A40 = new Note("B");
    public static final Note A41 = new Note("C");
    public static final Note A42 = new Note("C#");
    public static final Note A43 = new Note("D");
    public static final Note A44 = new Note("Eb");
    public static final Note A45 = new Note("E");
    public static final Note A46 = new Note("F");
    public static final Note A47 = new Note("F#");


    public static Note[] values = {A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10,
            A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26,
            A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42,
            A43, A44, A45, A46, A47};

    private String name;

    Note(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
