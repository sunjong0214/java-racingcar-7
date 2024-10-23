package racingcar;

import java.util.Arrays;
import java.util.List;

public class IOPreprocessor {
    public static List<String> parsingInput(String input) {
        return Arrays.stream(input.split(",")).toList();
    }

    public static void setRacingCarTrace(List<String> parsingInput, RacingCarTrace racingCarTrace) {
        parsingInput.stream().map(RacingCar::new).forEach(racingCarTrace::put);
    }

    public static void inputPreprocessing(String input, RacingCarTrace racingCarTrace) {
        List<String> parsingInput = parsingInput(input);
        setRacingCarTrace(parsingInput, racingCarTrace);
    }
}