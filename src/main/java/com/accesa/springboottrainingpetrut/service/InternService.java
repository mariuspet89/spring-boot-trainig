package com.accesa.springboottrainingpetrut.service;

import com.accesa.springboottrainingpetrut.dto.InternDto;

import java.util.List;

public interface InternService {

    List<InternDto> findAllById();
    InternDto findAllById(Long id);
}
