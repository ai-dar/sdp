package Assignment4.Observer;

/*
  Конкретный наблюдатель, представляющий устройство планшета.
  Подписывается на все категории новостей без фильтра.
 */
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Tablet: News in '" + category + "': " + news);
    }
}
