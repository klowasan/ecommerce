package com.ecommerce.membership.application.port.out;

import com.ecommerce.membership.domain.Membership;

public interface FindMembershipPort {

	Membership findMembership(
			Membership.MembershipId membershipId
	);
}
