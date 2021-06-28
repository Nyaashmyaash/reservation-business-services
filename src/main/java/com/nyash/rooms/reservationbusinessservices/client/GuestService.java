package com.nyash.rooms.reservationbusinessservices.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("GUESTSERVICES")
public interface GuestService {
    @RequestMapping(value = "/guests", method = RequestMethod.GET)
    List<Guest>
}
