package _6_state._2_audiioplayer;

import _6_state._2_audiioplayer.state.ReadyState;

public class AudioPlayer implements ClickListener {

    private State state = new ReadyState(this);

    /**
     * opérations élémentaires
     */
    public void clickLock(ClickEvent clickEvent) {
        state.clickLock(clickEvent);
    }

    public void clickPlay(ClickEvent clickEvent) {
        state.clickPlay(clickEvent);
    }

    public void clickNext(ClickEvent clickEvent) {
        state.clickNext(clickEvent);
    }

    public void clickPrevious(ClickEvent clickEvent) {
        state.clickPrevious(clickEvent);
    }

    /**
     * Commandes
     */

    public void play() {
        // ...
    }

    public void stop() {
        // ...
    }

    public void nextSong() {
        // ...
    }

    public void previousSong() {
        // ...
    }

    public void fastForward(long time) {
        // ...
    }

    public void rewind(long time) {
        // ...
    }

    public void changeState(State state) {
        this.state = state;
    }
}
