package com.example.demoajax.service.impl;

import com.example.demoajax.model.SmartPhone;
import com.example.demoajax.repository.ISmartPhoneRepository;
import com.example.demoajax.service.ICoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartPhoneServiceImpl implements ICoreService<SmartPhone> {
    @Autowired
    private ISmartPhoneRepository iSmartPhoneRepository;

    @Override
    public void delete(Long id) {
        iSmartPhoneRepository.deleteById(id);
    }

    @Override
    public List<SmartPhone> findAll() {
        return iSmartPhoneRepository.findAll();
    }

    @Override
    public SmartPhone findById(Long id) {
        return iSmartPhoneRepository.findById(id).orElse(null);
    }

    @Override
    public void save(SmartPhone smartPhone) {
        iSmartPhoneRepository.save(smartPhone);
    }
}
