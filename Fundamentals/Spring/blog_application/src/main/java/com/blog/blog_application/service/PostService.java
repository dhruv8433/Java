package com.blog.blog_application.service;

import java.util.List;

import com.blog.blog_application.model.Post;
import com.blog.blog_application.payload.PostDto;

public interface PostService {

    // create
    PostDto createPost(PostDto postDto, int userId, int categoryId);

    // upadte
    PostDto updatePost(PostDto postDto, int id);

    //  delete
    void deletePost(int id);

    // read
    PostDto getPostById(int id);

    // read all
    List<PostDto> getAllPost();

    // read by user
    List<PostDto> getPostsByUser(int userId);

    // read by category
    List<PostDto> getPostsByCategory(int categoryId);

    //search 
    List<PostDto> searchPosts(String keyword);
    
}
