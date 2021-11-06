package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {
    
    @Test
    void testnewRoomClient(){

        //Entrada
        int roomNunber = 200;
        String roomName = "lux room";
        double roomPrice = 500;

        //Teste
        Room roomLux = new Room(roomNunber, roomName, roomPrice);

        //Resultados
        assertEquals(roomNunber, roomLux.getId());
        assertEquals(roomName, roomLux.getName());
        assertEquals(roomPrice, roomLux.getPricePerDay());
    }


}
