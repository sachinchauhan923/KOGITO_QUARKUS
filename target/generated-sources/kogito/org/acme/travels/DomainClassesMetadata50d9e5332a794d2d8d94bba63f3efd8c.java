package org.acme.travels;
public class DomainClassesMetadata50d9e5332a794d2d8d94bba63f3efd8c {

    public static final org.drools.model.DomainClassMetadata org_drools_ruleunits_api_DataStore_Metadata_INSTANCE = new org_drools_ruleunits_api_DataStore_Metadata();
    private static class org_drools_ruleunits_api_DataStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.drools.ruleunits.api.DataStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 1;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.drools.ruleunits.api.DataStore");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_acme_travels_Person_Metadata_INSTANCE = new org_acme_travels_Person_Metadata();
    private static class org_acme_travels_Person_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.travels.Person.class;
        }

        @Override
        public int getPropertiesSize() {
            return 4;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "adult": return 1;
                case "age": return 2;
                case "name": return 3;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.travels.Person");
        }
    }

}