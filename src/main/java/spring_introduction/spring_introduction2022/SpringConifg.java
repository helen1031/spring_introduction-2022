package spring_introduction.spring_introduction2022;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_introduction.spring_introduction2022.repository.MemberRepository;
import spring_introduction.spring_introduction2022.repository.MemoryMemberRepository;
import spring_introduction.spring_introduction2022.service.MemberService;

@Configuration
public class SpringConifg {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
