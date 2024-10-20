package Assignment4.Observer;

/*
  Конкретный наблюдатель, представляющий устройство смартфона.
  Подписывается на новости в категории 'Sports'.
 */
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Sports")) {
            System.out.println("Smartphone: News in 'Sports': " + news);
        }
    }
}
