package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.travels.Rulesc046b37e8d074234bcbac191c7e07652.*;
import static org.acme.travels.Rulesc046b37e8d074234bcbac191c7e07652_PersonValidationService.*;

public class Rulesc046b37e8d074234bcbac191c7e07652_PersonValidationService_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatac046b37e8d074234bcbac191c7e07652.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person",
                                                                                               D.entryPoint("persons"));
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatac046b37e8d074234bcbac191c7e07652.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .unit(org.acme.travels.PersonValidationService.class)
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P85.LambdaPredicate85AA18DD8FBDD4EADF1509110B4678D9.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatac046b37e8d074234bcbac191c7e07652.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PB4.LambdaExtractorB4A2957C5F79D434388B8B3C90B21D8A.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PCE.LambdaConsequenceCE5D871D2B80CAFB5C91093342CFA0FA.INSTANCE));
        return rule;
    }
}
