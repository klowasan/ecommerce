package com.ecommerce.membership.application.port.out;

import com.ecommerce.membership.domain.Membership;

public interface RegisterMembershipPort {

	void createMembership(
			Membership.MembershipName membershipName
			, Membership.MembershipEmail membershipEmail
			, Membership.MembershipAddress membershipAddress
			, Membership.MembershipIsValid membershipIsValid
			, Membership.MembershipAggregateIdentifier membershipAggregateIdentifier
	);
}
