package com.nicatguliyev.mysocialdemo2.repo;

import com.nicatguliyev.mysocialdemo2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

}
