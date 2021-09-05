package entity;

import java.util.Objects;

public class Letter {
    private char letter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter1 = (Letter) o;
        return letter == letter1.letter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter);
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
}
