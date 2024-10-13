package Assignment3.Memento;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private StringBuilder text;

    public TextEditor() {
        text = new StringBuilder(); // Инициализация
    }

    public void addText(String newText) {
        text.append(newText);
    }

    public String getText() {
        return text.toString(); // Возвращаем текст в виде строки
    }

    public TextMemento save() {
        return new TextMemento(text.toString()); // Сохраняем состояние
    }

    public void restore(TextMemento memento) {
        text = new StringBuilder(memento.getText()); // Восстанавливаем состояние
    }
}