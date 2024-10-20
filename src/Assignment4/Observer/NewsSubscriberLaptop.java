package Assignment4.Observer;

/*
  Конкретный наблюдатель, представляющий устройство ноутбука.
  Подписывается на новости в категории 'Science'.
 */
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Science")) {
            System.out.println("Laptop: News in 'Science': " + news);
        }
    }
}
