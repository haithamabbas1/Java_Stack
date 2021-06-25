package Dojosandninja.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Dojosandninja.models.dojos.Dojo;



@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {

}