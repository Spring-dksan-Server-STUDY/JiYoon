package com.dksanServer.jiyun.assignment2;


import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@RestController
@RequestMapping("ticket")
@RequiredArgsConstructor
public class ticketController {
    private final EntityManager em;

    @PostMapping
    @Transactional
    public Long postTicket(@RequestBody final Ticket ticket) {
        em.persist(ticket);
        return ticket.getId();
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable(value = "id") final Long id) {
        return em.find(Ticket.class, id);
    }

//    @PutMapping("/{id}")
//    public Ticket updateTicket(@PathVariable(value = "id") final Long id, @RequestBody final Ticket ticket) {
//        em.createQuery("UPDATE Ticket SET time = :time WHERE id = :id")
//                .setParameter("id", id)
//                .setParameter("time", time);
//        return em.find(Ticket.class, id);
//    }
}
