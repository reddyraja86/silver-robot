# silver-robot

## Following implementations required when we start a new Project

- List down the Features
## Project Architecture
- Authentication and Authorization ( JWT Token & Oauth2)
- Exception handling
- Custom Response Message
- Caching
- Database versioning ( flyway )
- Connection pooling
- Logging & Distributed Tracing
- CI CD pipeline
- Event Handling



OncePerRequestFilter and WebSecurityConfigurerAdapter are both used for security configuration in a Spring Boot application, but they serve different purposes.

OncePerRequestFilter is a filter that can be used to modify the incoming request or response before it reaches the servlet. It is called once per request and is useful for performing actions such as token validation, logging, and adding headers to the response.

On the other hand, WebSecurityConfigurerAdapter is an abstract class that provides a convenient base implementation for configuring Spring Security. It allows you to configure authentication and authorization rules for specific URL patterns, configure authentication providers, set up form-based authentication, and more.

In other words, OncePerRequestFilter is used for low-level filtering and processing of incoming requests, while WebSecurityConfigurerAdapter provides a higher-level configuration interface for security-related settings in your application.

You can use both OncePerRequestFilter and WebSecurityConfigurerAdapter together to achieve a more comprehensive security configuration in your Spring Boot application. For example, you might use WebSecurityConfigurerAdapter to define the global security settings, and then use OncePerRequestFilter to implement custom token validation or logging for specific endpoints.