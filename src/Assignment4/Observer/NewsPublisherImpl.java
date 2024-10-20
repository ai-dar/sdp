package Assignment4.Observer;

import java.util.ArrayList;
import java.util.List;

/*Конкретная реализация интерфейса NewsPublisher.
  Управляет списком подписчиков и уведомляет их при публикации новостей.
 */
public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String category, String news) {
        for (Observer subscriber : subscribers) {
            subscriber.update(category, news);
        }
    }

    /*
     Вспомогательный метод для публикации новостей для всех подписчиков.
     @param category категория новостей.
     @param news новостной контент, который будет опубликован.
     */
    public void publishNews(String category, String news) {
        System.out.println("Publishing news in category: " + category + " - " + news);
        notifySubscribers(category, news);
    }
}
