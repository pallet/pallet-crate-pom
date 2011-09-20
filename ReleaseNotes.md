# Release notes

## pallet-crate-pom-0.6.0

- Move back to an independent parent pom for the crates.

- Explicit overide of parent pom relativePath

- Remove relativePath elements, and update to https for github links


## pallet-crates-0.4.1

- Update release notes and versions for 0.4.1

- Fix relative-link for parent pom

- Update to vmfest 0.2.2


## pallet-crates-0.4.0

- Switch to pallet and pallet-pom 0.4.0

- Switch to vmfest 0.1.1

- Switch back to pallet-0.4.0-SNAPSHOT


## pallet-crates-0.4.0-beta-1

- Move to release dependencies

- Add live-test properties to pallet-crate-pom

- Forward the pallet.test.image-list property in the live tests

- Propogate pallet.test.cleanup-nodes property for live tests.
  To run live tests without cleanup, specify
    -P live-test -Dpallet.test.cleanup-nodes=false

- Fix circular project dependency

- Add live test for java crate

- Add compile and tests phase executions for clojure-maven-plugin to
  pallet-crate-pom pluginManagement. Set-up marginalia.

- Remove distributionManagement from pallet-crate-pom

- Update for new repository location

