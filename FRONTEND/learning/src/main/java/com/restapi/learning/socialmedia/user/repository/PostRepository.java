package com.restapi.learning.socialmedia.user.repository;

import com.restapi.learning.socialmedia.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
