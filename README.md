On this branch (dev2) I've integrated the spring security to the application, where the proper definitions were set on;

--> spring-application-context.xml; http with an intercept url, alongside the proper definition for http-basic, also a sample/fake user definition
--> web.xml; the proper servlet filter definition, required to spring security usage.

Nothing has been defined yet for CSRF nor CORS.
