package harp;

/**
 * Created by Андриан on 07.04.2017.
 */
public class Dirka {
    private Note note;
    private Tabs tabs;

    public Dirka(Tabs tabs, Note note) {
        this.tabs = tabs;
        this.note = note;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public Tabs getTabs() {
        return tabs;
    }

    public void setTabs(Tabs tabs) {

        this.tabs = tabs;
    }
}
