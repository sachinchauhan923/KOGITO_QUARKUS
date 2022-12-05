package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.travels.Rules88f2a7c730ee474398cca42a9ad6bf09.*;
import static org.acme.travels.Rules88f2a7c730ee474398cca42a9ad6bf09_PersonValidationService.*;

public class Rules88f2a7c730ee474398cca42a9ad6bf09_PersonValidationService_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata88f2a7c730ee474398cca42a9ad6bf09.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person",
                                                                                               D.entryPoint("persons"));
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata88f2a7c730ee474398cca42a9ad6bf09.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .unit(org.acme.travels.PersonValidationService.class)
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PCA.LambdaPredicateCA42457ADAE1F9B4E40716C15E7F1D98.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata88f2a7c730ee474398cca42a9ad6bf09.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PA8.LambdaExtractorA8341568A9401C339E7F12E31D513F9C.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P6D.LambdaConsequence6DCDEB72345318817EC46974D7BD0C9F.INSTANCE));
        return rule;
    }
}
