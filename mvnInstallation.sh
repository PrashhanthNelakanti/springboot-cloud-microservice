#!/bin/bash

echo "Script executed from: ${PWD}"
chmod +x ${PWD}
cd service-registr
./install_run.sh
cd ../cloud-gateway
./install_run.sh