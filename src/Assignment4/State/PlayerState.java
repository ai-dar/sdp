package Assignment4.State;

/*
 Интерфейс, представляющий различные состояния плеера.
 Каждое состояние (Пауза, Воспроизведение, Остановлен) предоставляет свою реализацию этих методов.
 */
public interface PlayerState {

    /*
     Вызывается, когда активируется действие "воспроизведение" на плеере.
     @param player объект плеера, который управляет своими состояниями.
     */
    void play(Player player);

    /*
     Вызывается, когда активируется действие "пауза" на плеере.
     @param player объект плеера, который управляет своими состояниями.
     */
    void pause(Player player);

    /* Вызывается, когда активируется действие "остановка" на плеере.
     @param player объект плеера, который управляет своими состояниями.
     */
    void stop(Player player);
}
