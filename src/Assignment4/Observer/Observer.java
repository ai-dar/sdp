package Assignment4.Observer;

/**
 * Интерфейс наблюдателя, представляющий подписчика, который может быть уведомлен издателем.
 */
public interface Observer {
    /*
      Метод, вызываемый при уведомлении подписчика издателем.
      @param category категория новостей.
      @param news новостной контент.
     */
    void update(String category, String news);
}
