package com.myspring.RedditCLone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myspring.RedditCLone.Model.Post;
import com.myspring.RedditCLone.Model.User;
import com.myspring.RedditCLone.Model.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
	Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
