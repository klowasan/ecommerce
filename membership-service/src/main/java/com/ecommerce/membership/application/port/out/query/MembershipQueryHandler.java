package com.ecommerce.membership.application.port.out.query;

import com.ecommerce.membership.application.port.out.FindMembershipPort;
import com.ecommerce.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MembershipQueryHandler{

    private final FindMembershipPort fport;

    public Membership handle(FindMembershipQuery query) {
        System.out.println("MembershipQueryHandler Handler");

        // Retrieve the event sourcing repository

        return fport.findMembership(new Membership.MembershipId(query.getMembershipId()));
    }

}