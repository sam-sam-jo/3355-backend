package com.samsam.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.samsam.vo.CommentVO;
import com.samsam.vo.PostVO;
import com.samsam.vo.UserVO;

public interface CommRepository 
	extends CrudRepository<CommentVO, Integer>{
	public List<CommentVO> findByPost(PostVO post);
}