package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.travels.Rules50d9e5332a794d2d8d94bba63f3efd8c.*;
import static org.acme.travels.Rules50d9e5332a794d2d8d94bba63f3efd8c_PersonValidationService.*;

public class Rules50d9e5332a794d2d8d94bba63f3efd8c_PersonValidationService_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata50d9e5332a794d2d8d94bba63f3efd8c.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person",
                                                                                               D.entryPoint("persons"));
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata50d9e5332a794d2d8d94bba63f3efd8c.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .unit(org.acme.travels.PersonValidationService.class)
                                      .build(D.pattern(var_$person).expr("GENERATED_008D42369EBA8176141BB96FB696F033",
                                                                         org.acme.travels.P6E.LambdaPredicate6E7A22667B20ABB243D8F77DD22260AE.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata50d9e5332a794d2d8d94bba63f3efd8c.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PB1.LambdaExtractorB1E9D32DEE25E309C1B28FDDA338539E.INSTANCE,
                                                                                          20),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PA0.LambdaConsequenceA0A645E4EFB7AA62A6DE8F7A71A82BBE.INSTANCE));
        return rule;
    }
}
