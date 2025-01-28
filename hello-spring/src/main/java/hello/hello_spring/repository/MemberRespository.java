package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberRespository {
    Member save(Member member);
    Optional<Member> findById(long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
