package com.justpark.models.parking.interfaces;

import com.justpark.models.parking.Ticket;

public interface PaymentEnabled {
    void processTicket(Ticket ticket);

    void processPayment();
}
