package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Blog;
import com.example.mapper.BlogMapper;
import com.example.service.BlogService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Resource
    BlogMapper blogMapper;
    @Override
    public void DeleteById(Blog blog) {
        blogMapper.deleteById(blog.getId());
    }
}
