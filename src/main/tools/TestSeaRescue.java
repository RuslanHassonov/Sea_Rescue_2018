package main.tools;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestSeaRescue {

    public static final Logger logger = Logger.getLogger(TestSeaRescue.class);

    public static void main(String[] args) {
        TestSeaRescue.logger.setLevel(Level.TRACE);



    }

}
