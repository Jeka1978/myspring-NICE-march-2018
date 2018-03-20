package com.nice.my_spring;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.sayMessage("I started to clean");
        cleaner.clean();
        speaker.sayMessage("I finished to clean");
    }
}
