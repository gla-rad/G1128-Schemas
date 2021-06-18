# G1128-Schemas
JAXB generated classed for the G1128 specification definitions.

## General Information
This repository is actually a Maven project. It contains the schema definitions
of the G1128 standard.

    src/main/resources/xsd/ServiceBaseTypesSchema.xsd
    src/main/resources/xsd/ServiceDesignSchema.xsd
    src/main/resources/xsd/ServiceInstanceSchema.xsd
    src/main/resources/xsd/ServiceSpecificationSchema.xsd

Apart from the G1128 definitions, this project can also be used as a Java
dependency after it is built with Maven. Using JAXB it can parse the G1128
complying XML schemas and produce a list of Java objects to parse the service 
specifications in a Java service. Handy... right?

## Contributing
Pull requests are welcome. For major changes, please open an issue first to
discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
Distributed under the Apache License. See [LICENSE](./LICENSE) for more
information.

## Contact
Nikolaos Vastardis - Nikolaos.Vastardis@gla-rad.org
