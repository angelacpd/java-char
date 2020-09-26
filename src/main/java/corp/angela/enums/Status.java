package corp.angela.enums;

public enum Status {
    /*
    OPEN,
    CLOSE
    */

    OPEN(13, "Open"),
    CLOSE(02, "Closed");


    private int cod;
    private String text;

    Status(final int cod, final String text) {
        this.cod = cod;
        this.text = text;
    }

    public int getCod() {
        return cod;
    }

    public String getText() {
        return text;
    }

}