package com.nice;

import com.nice.my_spring.Hobbit;
import com.nice.my_spring.IRobot;
import com.nice.my_spring.ObjectFactory;
import com.nice.my_spring.Person;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Evgeny Borisov
 */
@Log4j
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
       /* Hobbit hobbit = ObjectFactory.getInstance().createObject(Hobbit.class);
        System.out.println("hobbit = " + hobbit);*/
    }
}
