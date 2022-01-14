package com.example.restpractice.repository;

import java.util.List;
import java.util.Optional;

public class MemberDaoImpl implements MemberDao {

    private MemberJpaRepository memberJpaRepository;

    @Override
    public Long save(MemberEntity memberEntity) {
        MemberEntity savedEntity = memberJpaRepository.save(memberEntity);
        return savedEntity.getId();
    }

    @Override
    public MemberEntity retrieve(Long id) {
        Optional<MemberEntity> memberEntityOptional = memberJpaRepository.findById(id);
        if (memberEntityOptional.isPresent()) return memberEntityOptional.get();
        throw new RuntimeException();
    }

    @Override
    public List<MemberEntity> retrieve() {
        return memberJpaRepository.findAll();

    }
}
