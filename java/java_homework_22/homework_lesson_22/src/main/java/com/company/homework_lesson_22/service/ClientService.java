package com.company.homework_lesson_22.service;

import java.util.List;
import com.company.homework_lesson_22.model.Client;

public interface ClientService extends CRUDInterface<Client>{
    Client findClientById(long id);

    List<Client> findClientByFirstNameAndLastName(String firstName, String lastName);

    List<Client> findClientByNumberPhone(String numberPhone);

    List<Client> findClientByFlatId(long flatId);

    List<Client> findClientByRentingDateStartMonth();

    List<Client> findClientByRentingDateFinishMonth();

    List<Client> findClientByRentingDateRangeLessThanMonth();

    List<Client> findClientByRentingDateMoreThanYear();
}
