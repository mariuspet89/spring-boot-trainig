package com.accesa.springboottrainingpetrut.service;

import com.accesa.springboottrainingpetrut.dao.InternRepository;
import com.accesa.springboottrainingpetrut.dto.InternDto;
import org.springframework.stereotype.Service;
import com.accesa.springboottrainingpetrut.dto.InternMapper;
import com.accesa.springboottrainingpetrut.entity.Intern;
import java.util.List;
import java.util.Optional;

import static com.accesa.springboottrainingpetrut.dto.InternMapper.from;




@Service
public class InternServiceImpl implements InternService {

    private final InternRepository internRepository;

    public InternServiceImpl(InternRepository internRepository) {
        this.internRepository = internRepository;
    }

    @Override
    public InternDto save(InternDto internDto) {
        Intern intern =  internRepository.save(from(internDto));
        return from(intern);
    }

    @Override
    public List<InternDto> findAll() {
        return from(internRepository.findAll());
    }

    @Override
    public Optional<InternDto> findById(Long id) {
        Optional<Intern> byId = internRepository.findById(id);
        return byId.map(InternMapper::from);
    }

    @Override
    public Optional<InternDto> findByName(String name) {
        Optional<Intern> byName = internRepository.findByName(name);
        return byName.map(InternMapper::from);
    }

    @Override
    public void deleteById(Long id) {
        internRepository.deleteById(id);
    }

}
