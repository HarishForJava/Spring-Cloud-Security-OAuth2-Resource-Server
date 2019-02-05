# Resource Server Configuration
A Resource Server (can be the same as the Authorization Server or a separate application) serves resources that are protected by the OAuth2 token. Spring OAuth provides a Spring Security authentication filter that implements this protection. You can switch it on with @EnableResourceServer on an @Configuration class, and configure it (as necessary) using a ResourceServerConfigurer. The following features can be configured:

1. tokenServices: the bean that defines the token services (instance of ResourceServerTokenServices).
2. resourceId: the id for the resource (optional, but recommended and will be validated by the auth server if present).
3. other extension points for the resourecs server (e.g. tokenExtractor for extracting the tokens from incoming requests)
request matchers for protected resources (defaults to all)
4. access rules for protected resources (defaults to plain "authenticated")