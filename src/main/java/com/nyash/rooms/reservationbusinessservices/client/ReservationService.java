package com.nyash.rooms.reservationbusinessservices.client;

import com.nyash.rooms.reservationbusinessservices.domain.Reservation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("RESERVATIONSERVICES")
public interface ReservationService {

    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
    List<Reservation> findAll(@RequestParam(name = "date", required = false) String date);
}
