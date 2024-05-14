package com.aman.JobListing.repository;

import com.aman.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}