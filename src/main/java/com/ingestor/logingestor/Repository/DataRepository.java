package com.ingestor.logingestor.Repository;

import com.ingestor.logingestor.Dto.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository  extends JpaRepository<Data,Long> {
}
