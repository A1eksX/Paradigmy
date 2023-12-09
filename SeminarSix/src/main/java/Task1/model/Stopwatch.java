package Task1.model;

import java.sql.Time;
import java.time.LocalTime;

public class Stopwatch {
    private long miliseconds;   // считаем время работы
    private long startTime;
    private long pausedMilliseconds;    // накапливает время нахождения на паузах
    private long startPauseMilliseconds;    // время начала паузы
    private long allPausedMilliseconds;

    private boolean isActive;
    private boolean isPaused;


    public void start(){
        isActive = true;
        isPaused = false;
        startTime = System.currentTimeMillis(); // получаем текущее время системы
    }

    public void stop(){
        unPause();
        miliseconds = System.currentTimeMillis() - startTime - pausedMilliseconds;
        isActive = false;
    }

    public long printCurrentTime(){
        if (isActive && !isPaused){
            return System.currentTimeMillis() - startTime - allPausedMilliseconds;
        }
        return miliseconds;
    }

    public void pause(){
        if (!isPaused && isActive){
            miliseconds = System.currentTimeMillis() - startTime - pausedMilliseconds; // общее время работы с учётом пауз
            startPauseMilliseconds = System.currentTimeMillis(); // запоминает время начала паузы
            isPaused = true;
        }
    }

    public void unPause(){
        if (isPaused && isActive) {
            pausedMilliseconds = System.currentTimeMillis() - startPauseMilliseconds; // считает длительность паузы
            allPausedMilliseconds += pausedMilliseconds;
            isPaused = false;
        }
    }

}
