import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TenantsTest {
    @Test
    void testStringEquality() {
        Tenants expected = new Tenants("Sibusiso", "Dwayi", "A102", "Sbu@gmail");
        Tenants actual = new Tenants("Sibusiso", "Dwayi", "A102", "Sbu@gmail");
        assertEquals(expected, actual);
        assertEquals(actual, expected);
    }
    @Test
    void testStringIdentity(){
        Tenants expected = new Tenants("Sibusiso", "Dwayi", "A102", "Sbu@gmail");
        Tenants actual = new Tenants("Sibusiso", "Dwayi", "A102", "Sbu@gmail");
        assertEquals(expected, actual);

    }
    @Test
    void testTimeout(){
        assertTimeout(Duration.ofSeconds(1),()-> {
            Thread.sleep(2000);
        });
}
    @Disabled("Test disabled")
    @Test
    public void testDisablingTest() {
        String str = "Sibusiso";
        int length =  str.length();
        Assertions.assertEquals(8,length);

    }

    }


