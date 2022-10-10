package spring_introduction.spring_introduction2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_introduction.spring_introduction2022.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    Optional<Member> findByName(String name);
}
