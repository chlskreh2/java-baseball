package baseball;

import baseball.appconfig.AppConfig;
import baseball.computer.Computer;
import baseball.manager.Manager;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        AppConfig appConfig = new AppConfig();

        Manager manager = appConfig.manager();
        manager.printGameStart();

        Computer computer = appConfig.computer();
        List<Integer> computerNumbers = computer.createOtherNumber();

        manager.printInputGameValue();
        String gameValueOfUser = manager.inputGameValue();
        computer.printCorrectResult(gameValueOfUser, computerNumbers);
    }
}
