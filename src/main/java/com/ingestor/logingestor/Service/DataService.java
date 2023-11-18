package com.ingestor.logingestor.Service;

import com.ingestor.logingestor.Dto.Data;
import org.springframework.stereotype.Service;

@Service
public interface DataService {
    Data createData(Data data);
}
