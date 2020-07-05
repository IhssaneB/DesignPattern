package _6_state._2_audiioplayer.state;

import _6_state._2_audiioplayer.AudioPlayer;
import _6_state._2_audiioplayer.ClickEvent;
import _6_state._2_audiioplayer.State;

public class PlayingState implements State {

    private AudioPlayer audioPlayer;

    public PlayingState(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void clickLock(ClickEvent clickEvent) {

    }

    @Override
    public void clickPlay(ClickEvent clickEvent) {

    }

    @Override
    public void clickNext(ClickEvent clickEvent) {

    }

    @Override
    public void clickPrevious(ClickEvent clickEvent) {

    }
}
