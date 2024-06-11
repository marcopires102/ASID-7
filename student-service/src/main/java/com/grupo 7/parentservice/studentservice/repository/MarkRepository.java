package com.grupo7.parentservice.studentservice.repository;

import com.grupo7.parentservice.studentservice.model.entity.Mark;
import com.grupo7.parentservice.studentservice.model.entity.enums.MarkEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {

    Mark findByMark(MarkEnum mark);
}
