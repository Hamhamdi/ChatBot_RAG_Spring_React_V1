package com.hamdi.chatbot_rag_v1.services;

import com.hamdi.chatbot_rag_v1.entities.Person;
import com.hamdi.chatbot_rag_v1.repository.PersonRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person,Long, PersonRepository> {

}
