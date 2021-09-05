package entity;

public class Paragraph {
    private String text;

    public Paragraph(String text) {             // можно ли так??????????????
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Paragraph {" +
                text +
                "}";
    }
}
