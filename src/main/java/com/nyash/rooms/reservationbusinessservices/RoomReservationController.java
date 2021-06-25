package com.nyash.rooms.reservationbusinessservices;

import com.nyash.rooms.reservationbusinessservices.client.RoomService;
import com.nyash.rooms.reservationbusinessservices.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class RoomReservationController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> getAllRooms(){
        return this.roomService.findAll(null);
    }
}
