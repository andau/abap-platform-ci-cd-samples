# Running ATC checks on a transient ABAP Environment system

[back to master](https://github.com/SAP-samples/abap-platform-ci-cd-samples/tree/master)

## Description

This pipeline goes through the following steps:

* Creating an SAP Cloud Platform ABAP Environment system
* Creating a Communication Arrangement for the Scenario SAP_COM_0510
* Pulling the specified Software Components / Git repositories
* Running the configured ABAP Test Cockpit (ATC) checks
* Deprovisioning the SAP Cloud Platform ABAP Environment system

The results are displayed using the [Warnings Next Generation Plugin](https://www.jenkins.io/doc/pipeline/steps/warnings-ng/#warnings-next-generation-plugin). If you don't want to use this plugin - or if it's not available on your Jenkins server - leave out the extension for the ATC stage (.pipeline/extensions/ATC.groovy).

**Please note:** Currently, it is necessary to confirm manually that the system is ready. The system is ready, if the confirmation email has been received by the initial administrator (email address provided in the manifest.yml). In this example an extension for the "Prepare System" stage is used to substitute the manual confirmation by a "wait" statement. A waiting period of three hours is usually more than enough. Nevertheless, it could happen that the system is not yet ready by that time and the pipeline will fail. If you rather want to use the default behavior, please have a look at this [example](https://github.com/SAP-samples/abap-platform-ci-cd-samples/tree/atc-transient).
