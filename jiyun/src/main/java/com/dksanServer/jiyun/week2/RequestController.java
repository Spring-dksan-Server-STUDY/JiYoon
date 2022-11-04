package com.dksanServer.jiyun.week2;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@RestController
@RequestMapping("request")
@RequiredArgsConstructor
public class RequestController {
    private final EntityManager em;

    @GetMapping("/test")
    public String test() {
        return "매핑테스트";
    }

    @PostMapping("/member")
    @Transactional
    public Long testPost(@RequestBody final MemberOld member) {
        em.persist(member);
        return member.getId();
    }


}
