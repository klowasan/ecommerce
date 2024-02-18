package com.ecommerce.membership.application.port.in;


import com.ecommerce.common.SelfValidating;
import lombok.*;

import javax.validation.constraints.NotNull;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMembershipEventCommand extends SelfValidating<UpdateMembershipEventCommand> {

    @NotNull
    private String aggregateIdentifier;

    private String name;

    private String address;

    private String email;

    private boolean isValid;
}
