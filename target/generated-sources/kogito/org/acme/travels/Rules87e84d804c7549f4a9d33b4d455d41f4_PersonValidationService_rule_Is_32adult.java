package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.travels.Rules87e84d804c7549f4a9d33b4d455d41f4.*;
import static org.acme.travels.Rules87e84d804c7549f4a9d33b4d455d41f4_PersonValidationService.*;

public class Rules87e84d804c7549f4a9d33b4d455d41f4_PersonValidationService_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata87e84d804c7549f4a9d33b4d455d41f4.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person",
                                                                                               D.entryPoint("persons"));
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata87e84d804c7549f4a9d33b4d455d41f4.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .unit(org.acme.travels.PersonValidationService.class)
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PF2.LambdaPredicateF2C5E52CE45DC840BA20155FD9E6834F.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata87e84d804c7549f4a9d33b4d455d41f4.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P81.LambdaExtractor8107488C91F258890F990ECC18411103.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P35.LambdaConsequence359A4F09DC2086305CA5CAE46E742055.INSTANCE));
        return rule;
    }
}
