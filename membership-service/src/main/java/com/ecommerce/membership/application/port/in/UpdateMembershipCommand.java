package com.ecommerce.membership.application.port.in;


import com.ecommerce.common.SelfValidating;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public class UpdateMembershipCommand extends SelfValidating<UpdateMembershipCommand> {
    @NotNull
    private String membershipId;

    private String name;

    private String address;

    private String email;

    private boolean isValid;
}
