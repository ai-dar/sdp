// Proxy для ленивой загрузки документа
package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title;

    public ProxyDocument(String title) {
        this.title = title;
    }

    // Задача: Реализуйте логику для создания документа только при первом обращении к методу display().
    @Override
    public void display() {
        if (realDocument == null) {
            realDocument = new RealDocument(title);
        }
        realDocument.display();
    }

    // Задача: Вам нужно реализовать логику для создания документа только при первом обращении к методу display().
    // Если документ уже был загружен, он не должен загружаться заново.

}

