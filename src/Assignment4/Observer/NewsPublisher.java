package Assignment4.Observer;


 //Интерфейс, представляющий издателя новостей, который управляет подписчиками (наблюдателями).

public interface NewsPublisher {
    /*
      Метод для добавления нового наблюдателя (подписчика) к издателю.
      @param observer наблюдатель, который будет добавлен в список подписок.
     */
    void subscribe(Observer observer);

    /*
      Метод для удаления наблюдателя (подписчика) у издателя.

      @param observer наблюдатель, который будет удален из списка подписок.
     */
    void unsubscribe(Observer observer);

    /*
        Метод для уведомления всех подписчиков при публикации нового контента.
        @param category категория новостей.
        @param news новостной контент, который будет передан подписчикам.
     */
    void notifySubscribers(String category, String news);
}
