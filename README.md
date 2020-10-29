---
description: Will Power and Gratifications
---

# Home page of Public Nuisance City Game

{% api-method method="get" host="https://api.publicnuisancecitygame.com" path="/v1/games/:user\_id" %}
{% api-method-summary %}
Get Public Nuisance City Game
{% endapi-method-summary %}

{% api-method-description %}
This endpoint allows you to get Public Nuisance City Game.
{% endapi-method-description %}

{% api-method-spec %}
{% api-method-request %}
{% api-method-path-parameters %}
{% api-method-parameter name="id" type="object" %}
Games
{% endapi-method-parameter %}
{% endapi-method-path-parameters %}

{% api-method-headers %}
{% api-method-parameter name="Authentication" type="string" required=false %}
Authentication token to track users on Game Jolt.
{% endapi-method-parameter %}
{% endapi-method-headers %}

{% api-method-query-parameters %}
{% api-method-parameter name="Users" type="string" %}
The API will do its best to find a user matching the provided by the game.
{% endapi-method-parameter %}
{% endapi-method-query-parameters %}
{% endapi-method-request %}

{% api-method-response %}
{% api-method-response-example httpCode=200 %}
{% api-method-response-example-description %}
Cake successfully retrieved.
{% endapi-method-response-example-description %}

```
{    "name": "Public Nuisance City Game",    "game": "Public Nuisance City Game",    "user_id": "HTTP URL"}
```
{% endapi-method-response-example %}

{% api-method-response-example httpCode=404 %}
{% api-method-response-example-description %}
Could not find a cake matching this query.
{% endapi-method-response-example-description %}

```
{    "message": "no user_id."}
```
{% endapi-method-response-example %}
{% endapi-method-response %}
{% endapi-method-spec %}
{% endapi-method %}



