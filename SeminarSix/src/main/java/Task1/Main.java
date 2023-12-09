package Task1;

import Task1.model.Stopwatch;
import Task1.view.ConsoleView;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch();
        ConsoleView consoleView = new ConsoleView(stopwatch);
        consoleView.run();


    }
}
