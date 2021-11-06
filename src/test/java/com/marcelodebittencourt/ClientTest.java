package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    @DisplayName("Create a new client")
    void testCreateNewClient() {
        Client client = new Client(1, "Erica");
        assertEquals(1, client.getId());
        assertEquals("Erica", client.getName());
    }

}
