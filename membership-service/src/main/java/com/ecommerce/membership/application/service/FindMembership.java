package com.ecommerce.membership.application.service;

import com.ecommerce.common.UseCase;
import com.ecommerce.membership.application.port.in.FindMembershipCommand;
import com.ecommerce.membership.application.port.in.FindMembershipUseCase;
import com.ecommerce.membership.application.port.out.FindMembershipPort;
import com.ecommerce.membership.application.port.out.query.FindMembershipQuery;
import com.ecommerce.membership.domain.Membership;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class FindMembership implements FindMembershipUseCase {

	private final FindMembershipPort fport;

	@Override
	public Membership findMembership(FindMembershipCommand command) {
		return fport.findMembership(new Membership.MembershipId(command.getMembershipId()));
	}
}




