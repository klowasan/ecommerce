package com.ecommerce.membership.application.port.in;

import com.ecommerce.membership.domain.Membership;

public interface UpdateMembershipUseCase {

	Membership updateMembership(UpdateMembershipCommand command);
	Membership updateAxonMembership(UpdateMembershipCommand command);
}
