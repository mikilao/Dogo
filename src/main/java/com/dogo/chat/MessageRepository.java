package com.dogo.chat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
	//two type parameters the first is the domain type the repository manages, In this case, Message. The second is the
	//data type of the primary key (Id) of the entity the repository manages

}