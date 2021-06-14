package es.poc.reactiveexamples.reactiveexamples;

import es.poc.reactiveexamples.reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person michael = new Person(1,"Michael", "Weston");
    Person fiona = new Person(2, "Fiona", "Glenanne");
    Person max = new Person(3, "Sam", "Axe");
    Person jesse = new Person(4, "Jesse", "Porter");

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }

    @Override
    public Flux<Person> findAll() {

        return Flux.just(michael, fiona, max, jesse);
    }
}
