package com.ecommerce.membership.application.service;

import com.ecommerce.common.UseCase;
import com.ecommerce.membership.application.port.in.UpdateMembershipCommand;
import com.ecommerce.membership.application.port.in.UpdateMembershipEventCommand;
import com.ecommerce.membership.application.port.in.UpdateMembershipUseCase;
import com.ecommerce.membership.application.port.out.FindMembershipPort;
import com.ecommerce.membership.application.port.out.UpdateMembershipPort;
import com.ecommerce.membership.domain.Membership;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class UpdateMembership implements UpdateMembershipUseCase {

	private final UpdateMembershipPort uport;
	private final FindMembershipPort fport;

	@Override
	public Membership updateMembership(UpdateMembershipCommand command) {
		return uport.updateMembership(
				new Membership.MembershipId(command.getMembershipId()),
				new Membership.MembershipName(command.getName()),
				new Membership.MembershipEmail(command.getEmail()),
				new Membership.MembershipAddress(command.getAddress()),
				new Membership.MembershipIsValid(command.isValid())
		);
	}

	@Override
	public Membership updateAxonMembership(UpdateMembershipCommand command) {
		System.out.println("update axon membership");
		Membership membership = fport.findMembership(new Membership.MembershipId(command.getMembershipId()));
		UpdateMembershipEventCommand eventCommand = UpdateMembershipEventCommand.builder()
				.aggregateIdentifier(membership.getAggregateIdentifier())
				.name(command.getName())
				.email(command.getEmail())
				.address(command.getAddress())
				.isValid(command.isValid())
				.build();

		this.updateMembership(command);
		return null;
	}
}




