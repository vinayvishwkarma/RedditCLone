package com.myspring.RedditCLone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myspring.RedditCLone.Model.Comment;
import com.myspring.RedditCLone.Model.Post;
import com.myspring.RedditCLone.Model.User;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	
	List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
