package se.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class StartTest {

    @DisplayName("Kanarie Test")
    @Test
    void kanarie() {
        assertEquals(true, false);
    }
}