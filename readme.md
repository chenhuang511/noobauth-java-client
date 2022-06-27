# NoobAuth Java Client

The simple Java spring boot app, implement OAuth2 authorization, integrate with [NoobAuth](https://github.com/chenhuang511/noob-oauth) server.

# Getting started

Change the configurations in ```src/main/resources/application.yml``` to fit with your development

```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          java-client:
            client-id: java-client
            client-secret: ZEHAAA7Uya/dFPOIjv9eQ9+1voK49aJ2
            provider: authorizationserver
            client-name: java-client
            authorization-grant-type: authorization_code
            client-authentication-method: post
            scope: profile,email
            redirect-uri-template: "{baseUrl}/login/oauth2/code/{registrationId}"
        provider:
          authorizationserver:
            authorization-uri: http://noobauth.vn:4000/oauth2/noob-realm/authorize
            token-uri: http://noobauth.vn:4000/oauth2/noob-realm/token
            user-info-uri: http://noobauth.vn:4000/oauth2/noob-realm/userinfo
            user-name-attribute: "preferred_username"
            jwk-set-uri: http://noobauth.vn:4000/oauth2/noob-realm/certs
```

With local running, you may need modify for machine ```hosts``` file, separate the domains of NoobAuth and JavaClient to avoid the confusion about cookies of 2 applications.
For example:
* 127.0.0.1 noobauth.vn
* 127.0.0.1 javaclient.vn

# License

MIT