package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImp;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService{
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImp();
  public List<Speaker> findAll(){
      return repository.findAll();
  }
}
