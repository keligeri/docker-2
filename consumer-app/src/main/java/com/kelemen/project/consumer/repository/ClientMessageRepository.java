package com.kelemen.project.consumer.repository;

import com.kelemen.project.consumer.domain.ClientMessage;
import org.springframework.data.repository.CrudRepository;

public interface ClientMessageRepository extends CrudRepository<ClientMessage, Integer> {

}
