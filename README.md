# Repository08


# Hpw to run the test
edge
mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags="@smoke"
mvn verify -Denv=qa -Dbrowser=firefox -D"cucumber.filter.tags=@smoke"
mvn verify -Denv=qa -Dbrowser=chrome -D"cucumber.filter.tags=@smoke"
mvn verify -Denv=qa -Dbrowser=edge -D"cucumber.filter.tags=@smoke"