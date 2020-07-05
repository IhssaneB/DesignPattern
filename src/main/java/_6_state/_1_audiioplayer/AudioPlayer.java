package _6_state._1_audiioplayer;

public class AudioPlayer implements ClickListener {

    private State state = State.Ready;

    public AudioPlayer() {
    }

    /**
     * opérations élémentaires
     */
    public void clickLock(ClickEvent clickEvent) {
        switch (state) {
            case Ready:
                this.state = State.Locked;
                break;
            case Playing:
                this.state = State.PlayLocked;
                break;
            case Locked:
                this.state = State.Ready;
                break;
        }
    }

    public void clickPlay(ClickEvent clickEvent) {
        switch (state) {
            case Ready:
                this.play();
                this.state = State.Playing;
                break;
            case Playing:
                this.stop();
                this.state = State.Ready;
                break;
            case Locked:
                // Rien
                break;
            case PlayLocked:
                break;
        }
    }

    public void clickNext(ClickEvent clickEvent) {
        switch (state) {
            case Ready:
                this.nextSong();
                break;
            case Playing:
                this.fastForward(10);
                break;
            case Locked:
                //rien
                break;
            case PlayLocked:
                //rien
                break;
        }
    }

    public void clickPrevious(ClickEvent clickEvent) {
        switch (state) {
            case Ready:
                break;
            case Playing:
                break;
            case Locked:
                break;
            case PlayLocked:
                break;
        }
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

}
