package com.nf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nf.entity.MessageTest;

public interface MessageTestDao  extends JpaRepository<MessageTest,String>{

}
