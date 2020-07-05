package _6_state._2_audiioplayer.state;

import _6_state._2_audiioplayer.AudioPlayer;
import _6_state._2_audiioplayer.ClickEvent;
import _6_state._2_audiioplayer.State;

public class ReadyState implements State {

    private AudioPlayer audioPlayer;

    public ReadyState(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void clickLock(ClickEvent clickEvent) {
        this.audioPlayer.changeState(new LockedState(audioPlayer));
    }

    @Override
    public void clickPlay(ClickEvent clickEvent) {
        audioPlayer.play();
        this.audioPlayer.changeState(new PlayingState(audioPlayer));
    }

    @Override
    public void clickNext(ClickEvent clickEvent) {
        audioPlayer.fastForward(10);
    }

    @Override
    public void clickPrevious(ClickEvent clickEvent) {
        audioPlayer.rewind(10);
    }
}
