package com.myspring.RedditCLone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.myspring.RedditCLone.Model.VarificationToken;


@Repository
public interface VarificationTokenRepository extends JpaRepository<VarificationToken, Long> {
	Optional<VarificationToken> findByToken(String token);

}
