package com.marcelocaleb.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelocaleb.dslist.domain.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	
}
