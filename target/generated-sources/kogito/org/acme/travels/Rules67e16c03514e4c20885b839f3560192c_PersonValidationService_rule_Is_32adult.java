package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.travels.Rules67e16c03514e4c20885b839f3560192c.*;
import static org.acme.travels.Rules67e16c03514e4c20885b839f3560192c_PersonValidationService.*;

public class Rules67e16c03514e4c20885b839f3560192c_PersonValidationService_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata67e16c03514e4c20885b839f3560192c.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person",
                                                                                               D.entryPoint("persons"));
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata67e16c03514e4c20885b839f3560192c.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .unit(org.acme.travels.PersonValidationService.class)
                                      .build(D.pattern(var_$person).expr("GENERATED_159B0D029B9202357AAFAA996B3EA855",
                                                                         org.acme.travels.PEB.LambdaPredicateEBF9AD4E02CB994FA9A5632DA93DB9B7.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata67e16c03514e4c20885b839f3560192c.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P7B.LambdaExtractor7BA70C18FDE6E1B92FA162C802A7EC2D.INSTANCE,
                                                                                          21),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PEF.LambdaConsequenceEFD7793D65B8EB2D223C7E9B023B553B.INSTANCE));
        return rule;
    }
}
