package com.blog.blog_application.payload;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private String title;
    
    private String content;
    
    private String postImage = "default.png";
    
    private CategoryDto category;
    
    private UserDto user;
    
    private Date addedDate;
}
