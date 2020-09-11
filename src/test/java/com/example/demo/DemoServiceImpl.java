package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    private DemoRepository repository;

    @Override
    public Demo     saveDemo(Demo demo) {
        return repository.save(demo);
    }

    @Override
    public Demo updateDemo(Demo demo) {
        return repository.save(demo);
    }

    @Override
    public void deleteDemo(Demo demo) {
        repository.delete(demo);

    }

    @Override
    public Optional<Demo> getDemoByID(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Demo> getAllDemos() {
        return repository.findAll();
    }

    public DemoRepository getRepository() {
        return repository;
    }

    public void setRepository(DemoRepository repository) {
        this.repository = repository;
    }

}
