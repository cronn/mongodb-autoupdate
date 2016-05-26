# mongodb-autoupdate
A demo project for demonstrating automatic update scripts for MongoDB using Spring Boot

<b>Short summary:</b>

> When you look at a development with Continuous Deployment the database is also continuously adapted. It's difficult to find solutions for non-relational databases (similar to Liquibase or Flyway), so I developed my own solution for a database management:
The idea is to scan a folder containing update scripts and to apply them to the database if needed. The database will store executed scripts to distinguish them from not executed scripts. This feature will then be attached to the application launch, so whenever the application is started, it’ll check for new scripts. The mechanism is fully integrated into the Spring Boot environment and uses helpful key features like `@Service` and `@Autowired` annotations.

Please visit my <a href="http://blog.cronn.de/database-migration-for-mongodb-spring">blog post</a> for more details on the project.

