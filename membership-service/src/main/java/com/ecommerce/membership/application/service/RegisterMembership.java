package com.ecommerce.membership.application.service;

import com.ecommerce.common.UseCase;
import com.ecommerce.membership.application.port.in.RegisterMembershipCommand;
import com.ecommerce.membership.application.port.in.RegisterMembershipUseCase;
import com.ecommerce.membership.application.port.out.RegisterMembershipPort;
import com.ecommerce.membership.domain.Membership;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class RegisterMembership implements RegisterMembershipUseCase {

	private final RegisterMembershipPort rport;

	@Override
	public void registerMembership(RegisterMembershipCommand command) {
		rport.createMembership(
				new Membership.MembershipName(command.getName()),
				new Membership.MembershipEmail(command.getEmail()),
				new Membership.MembershipAddress(command.getAddress()),
				new Membership.MembershipIsValid(command.isValid()),
				new Membership.MembershipAggregateIdentifier("default")
				);
	}
}




