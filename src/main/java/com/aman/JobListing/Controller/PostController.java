package com.aman.JobListing.Controller;

import com.aman.JobListing.model.Post;
import com.aman.JobListing.repository.PostRepository;
import com.aman.JobListing.repository.SearchRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepositoryImpl srepo;
    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts(){
      try{
      return repo.findAll();
     }
       catch(Exception e){
           e.printStackTrace(); // Log the exception (optional)
           throw new RuntimeException("An error occurred while searching: " + e.getMessage());
        }
    }
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text)
    {

        return srepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }
}
