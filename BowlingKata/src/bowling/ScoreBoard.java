package bowling;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {
    private Match match;

    public ScoreBoard(Match match) {
        this.match = match;
    }

    private Frame[] frames() {
        return toArray(buildFrames());
    }

    private Frame[] toArray(List<Frame> frames) {
        return frames.toArray(new Frame(frames.size()));
    }

    private List<Frame> buildFrames() {
        List<Frame> frames = new ArrayList<>();
        for (int i = 0; i < numberOfRolls(); i+=2) frames.add(new Frame(i));
        return frames;
    }

    private Frame[] noFrames() {
        return new Frame[] {};
    }

    private int numberOfRolls() {
        return rolls().size();
    }

    private Frame[] frames(Frame... frames) {
        return frames;
    }

    public List<Integer> rolls() {
        return match.rolls();
    }

    public class Frame {
        private int initialRoll;

        public Frame(int initialRoll) {
            this.initialRoll = initialRoll;
        }

        public Integer score() {
            return isComplete() ? sumPinRolls() : null;
        }

        private boolean isComplete() {
            return hastTwoRolls() && sumPinRolls() < 10;
        }

        private boolean hastTwoRolls() {
            return numberOfRolls() - initialRoll > 1;
        }

        private int sumPinRolls() {
            return rolls().get(initialRoll) + rolls().get(initialRoll + 1);
        }
    }
}
