package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.SingleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleRespository extends JpaRepository<SingleEntity,Long> {

}
