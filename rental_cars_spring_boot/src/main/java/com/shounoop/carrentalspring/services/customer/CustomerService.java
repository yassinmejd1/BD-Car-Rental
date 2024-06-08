package com.shounoop.carrentalspring.services.customer;

import com.shounoop.carrentalspring.dto.BookACarDto;
import com.shounoop.carrentalspring.dto.CarDto;
import com.shounoop.carrentalspring.entity.BookACar;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<CarDto> getAllCars();
    boolean bookACar(BookACarDto bookACarDto);
    CarDto getCarById(Long id);
    List<BookACarDto> getBookingsByUserId(Long userId);
    String bookAndPayForCar(BookACarDto bookACarDto) throws Exception;
    boolean cancelBooking(Long bookingId);
    void updateBookingStatusToPaid(String paymentIntentId);
}
