#!/bin/bash
#!/bin/bash

echo "Script executed from: ${PWD}"
chmod +x ${PWD}
cd service-registry

mvn clean install
cd ../cloud-gateway
mvn clean install
cd ../hystrix-dashboard
mvn clean install
cd ../config-server
mvn clean install
cd ../products
mvn clean install
cd ../rps
mvn clean install
