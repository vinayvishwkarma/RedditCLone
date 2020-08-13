package com.myspring.RedditCLone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myspring.RedditCLone.Model.Post;
import com.myspring.RedditCLone.Model.Subreddit;
import com.myspring.RedditCLone.Model.User;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
