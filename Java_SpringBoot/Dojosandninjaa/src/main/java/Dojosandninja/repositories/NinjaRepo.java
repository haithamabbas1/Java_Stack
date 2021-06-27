package Dojosandninja.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Dojosandninja.models.ninjas.Ninja;



@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {

}