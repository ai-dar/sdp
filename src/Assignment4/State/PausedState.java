package Assignment4.State;


//Представляет состояние плеера "Пауза".

public class PausedState implements PlayerState{
    @Override
    public void play(Player player) {
        System.out.println("Resuming playback.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping playback and resetting track.");
        player.setState(new StoppedState());
    }
}
