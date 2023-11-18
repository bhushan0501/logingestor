package com.ingestor.logingestor.Service.impl;

import com.ingestor.logingestor.Dto.Data;
import com.ingestor.logingestor.Repository.DataRepository;
import com.ingestor.logingestor.Service.DataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DataServiceImpl implements DataService{
    private DataRepository dataRepository;
    @Override
    public Data createData(Data data){
        return dataRepository.save(data);
    }
}