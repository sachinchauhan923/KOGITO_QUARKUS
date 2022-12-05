package org.acme.travels.PCE;

import static org.acme.travels.Rulesc046b37e8d074234bcbac191c7e07652.*;
import org.acme.travels.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceCE5D871D2B80CAFB5C91093342CFA0FA implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.travels.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "7D454CCC4A369E49EDC945CA20C25616";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatac046b37e8d074234bcbac191c7e07652.org_acme_travels_Person_Metadata_INSTANCE, "adult");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.travels.Person $person) throws java.lang.Exception {
        {
            {
                ($person).setAdult(true);
            }
            drools.update($person, mask_$person);
        }
    }
}
