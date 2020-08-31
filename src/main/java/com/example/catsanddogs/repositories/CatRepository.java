package com.example.catsanddogs.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.catsanddogs.models.Cat;

public interface CatRepository extends CrudRepository<Cat,Long>
{
}
