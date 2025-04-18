package com.blog.blog_application.payload;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private Integer postId;

    private String title;
    
    private String content;
    
    private String postImage;
    
    private CategoryDto category;
    
    private UserDto user;
    
    private Date addedDate;

    private Set<CommentDto> comments = new HashSet<>();
}
