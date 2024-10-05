// Фасад для работы с документами
package Assignment2.Facade;

import Assignment2.Bridge.DocumentRenderer;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleDocumentRenderer;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;
public class DocumentFacade {
    //Задачи:
    //Метод для отображения документа:
    //Используйте фабрику документов, чтобы получить документ по заданному заголовку.
    //Вызовите метод для отображения документа.
    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocument(title);
        document.display();
    }

    //Метод для отображения документа с водяным знаком:
    //Получите документ по заголовку с помощью фабрики документов.
    //Оберните полученный документ декоратором, который добавляет водяной знак.
    //Вызовите метод для отображения обёрнутого документа.
    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocument(title);
        Document watermarkedDocument = new WatermarkDecorator(document);
        watermarkedDocument.display();
    }

    //Метод для рендеринга документа:
    //Создайте объект рендерера, передав в конструктор выбранный движок рендеринга.
    //Вызовите метод рендеринга в рендерере для заданного документа.
    public void renderDocument(String title, RenderEngine engine) {
        Document document = DocumentFactory.getDocument(title);
        SimpleDocumentRenderer renderer = new SimpleDocumentRenderer(engine);
        renderer.render(title);
    }
}

