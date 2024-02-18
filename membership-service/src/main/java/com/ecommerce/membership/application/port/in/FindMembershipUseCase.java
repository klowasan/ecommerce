package com.ecommerce.membership.application.port.in;

import com.ecommerce.membership.domain.Membership;

public interface FindMembershipUseCase {

	Membership findMembership(FindMembershipCommand command);
}
