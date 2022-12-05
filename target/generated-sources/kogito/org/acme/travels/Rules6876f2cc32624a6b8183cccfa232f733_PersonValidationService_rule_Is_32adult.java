package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.travels.Rules6876f2cc32624a6b8183cccfa232f733.*;
import static org.acme.travels.Rules6876f2cc32624a6b8183cccfa232f733_PersonValidationService.*;

public class Rules6876f2cc32624a6b8183cccfa232f733_PersonValidationService_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata6876f2cc32624a6b8183cccfa232f733.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person",
                                                                                               D.entryPoint("persons"));
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata6876f2cc32624a6b8183cccfa232f733.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .unit(org.acme.travels.PersonValidationService.class)
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P7E.LambdaPredicate7E2ADDC309148566BE53E81F5ECFE02C.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata6876f2cc32624a6b8183cccfa232f733.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PED.LambdaExtractorEDEECCACA1F1EA6CAA11EBD317318A61.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P5B.LambdaConsequence5BF00893CF7B0E16B52858800BFFBE4B.INSTANCE));
        return rule;
    }
}
