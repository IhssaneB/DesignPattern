package _6_state._99_exercice;

public class Watch {
    private int hours = 0;
    private int minutes = 0;

    private State state = State.SHOW;

    public void incrementHours() {
        hours++;
    }

    public void incrementMinutes() {
        minutes++;
    }

    public void showTime() {
        System.out.println(hours + ":" + minutes);
    }

    public void clickButton1() {
        switch (state) {
            case SHOW:
                state = State.EDIT_HOURS;
                break;
            case EDIT_HOURS:
                state = State.EDITS_MINUTES;
                break;
            case EDITS_MINUTES:
                state = State.SHOW;
                break;
        }
    }

    public void clickButton2() {
        switch (state) {
            case SHOW:
                // nothing
                break;
            case EDIT_HOURS:
                incrementHours();
                break;
            case EDITS_MINUTES:
                incrementMinutes();
                break;
        }
    }
}
