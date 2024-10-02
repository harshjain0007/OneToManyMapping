package com.example.onetomany.service;

import com.example.onetomany.model.MobileNumber;
import com.example.onetomany.repository.MobileNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileNumberService {
	@Autowired
	private MobileNumberRepository mobileNumberRepository;

	public MobileNumber save(MobileNumber mobileNumber) {
		return mobileNumberRepository.save(mobileNumber);
	}

	public Iterable<MobileNumber> list() {
		return mobileNumberRepository.findAll();
	}
}
