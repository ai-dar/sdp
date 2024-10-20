package Assignment4.State;

// Класс плеера, который может находиться в разных состояниях (Остановлен, Воспроизводит, Пауза).
public class Player {

    private PlayerState state;

    public Player() {
        // Начальное состояние - остановлен
        this.state = new StoppedState();
    }

    /*
      Устанавливает новое состояние для плеера.
      @param state новое состояние, которое будет применено к плееру.
     */
    public void setState(PlayerState state) {
        this.state = state;
    }

    // Делегирует действие "воспроизведение" текущему состоянию./
    public void play() {
        state.play(this);
    }

    // Делегирует действие "пауза" текущему состоянию.
    public void pause() {
        state.pause(this);
    }

    //  Делегирует действие "остановка" текущему состоянию.
    public void stop() {
        state.stop(this);
    }

}
