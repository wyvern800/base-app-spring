package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.repository.MemberRepository;

@Service
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MemberService {

    @Autowired
    MemberRepository userRepository;
}