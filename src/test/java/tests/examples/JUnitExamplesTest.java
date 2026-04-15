package tests.examples;

import org.junit.jupiter.api.*;

public class JUnitExamplesTest {

    @BeforeAll
    static void startUp() {
        System.out.println("test startup");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("test ended");
    }

    @BeforeEach
    void startBrowser() {
        System.out.println("browser has started");
    }

    @AfterEach
    void stopBrowser() {
        System.out.println("browser has stopped");
    }

    @Test
    void firstTest () {
        System.out.println("- firstTest");
    }

    @Test
    void secondTest() {
        System.out.println("- secondTest");
    }
}
