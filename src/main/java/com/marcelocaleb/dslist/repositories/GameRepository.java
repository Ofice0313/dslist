package com.marcelocaleb.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelocaleb.dslist.domain.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
