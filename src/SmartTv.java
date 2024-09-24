/**
 *<h1>SmartTv</h1>
 * <p>Class that simulates the behavior of a smart TV. <br />
 * Contains variables responsible for representing TV states.
 * In addition, it also has methods for interacting with the TV.</p>
 * @author guilherme
 * @version 1.0
*/

public class SmartTv {
    boolean isOn = false;
    int chanel = 1;
    int volume = 98;

    /**
     * <h1>changeStatus</h1>
     * <p>When called, this method changes the TV state between on and off</p>
     *
     */
    void changeStatus () {
        this.isOn = !this.isOn;
    }

    /**
     * <h1>increaseVolume</h1>
     * <p>When called, this method increases a single volume (maximum volume of 100)</p>
     */
    void increaseVolume () {
        if (this.volume < 100) {
            this.volume++;
        }
    }

    /**
     * <h1>decreaseVolume</h1>
     * <p>When called, this method decreases a single volume (just above 0)</p>
     */
    void decreaseVolume () {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    /**
     * <h1>increaseChanel</h1>
     * <p>When called, this method moves to the next channel</p>
     */
    void increaseChanel() {
        this.chanel++;
    }

    /**
     * <h1>decreaseChanel</h1>
     * <p>When called, this method moves to the previous channel (just above 0)</p>
     */
    void decreaseChanel () {
        if (this.chanel > 1) {
            this.chanel--;
        }
    }

    /**
     * <h1>changeChannel</h1>
     * <p>This method changes to the channel informed through the parameter</p>
     * @param newChannel desired channel number (just above 0)
     */
    void changeChannel (int newChannel) {
        if (newChannel >= 1) {
            this.chanel = newChannel;
        }
    }
}

