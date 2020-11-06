---
description: Will Power and Gratifications Saga
---

# Home of Public Nuisance City Game API

{% api-method method="post" host="https://api.publicnuisancecitygame.com" path="/v1/playablelocations/:place\_id" %}
{% api-method-summary %}
Google Map PlayableLocations
{% endapi-method-summary %}

{% api-method-description %}

{% endapi-method-description %}

{% api-method-spec %}
{% api-method-request %}
{% api-method-path-parameters %}
{% api-method-parameter name="" type="string" required=false %}

{% endapi-method-parameter %}
{% endapi-method-path-parameters %}
{% endapi-method-request %}

{% api-method-response %}
{% api-method-response-example httpCode=200 %}
{% api-method-response-example-description %}

{% endapi-method-response-example-description %}

```

```
{% endapi-method-response-example %}
{% endapi-method-response %}
{% endapi-method-spec %}
{% endapi-method %}

{% api-method method="get" host="https://api.publicnuisancecitygame.com" path="/v1/playablelocations/:place\_id" %}
{% api-method-summary %}
Google Map PlayableLocations
{% endapi-method-summary %}

{% api-method-description %}
This endpoint allows you to get Playable Locations for Google Map SDK for Unity
{% endapi-method-description %}

{% api-method-spec %}
{% api-method-request %}
{% api-method-path-parameters %}
{% api-method-parameter name="place\_id" type="string" required=false %}
Wrigleyville
{% endapi-method-parameter %}

{% api-method-parameter name="place\_id" type="string" required=false %}
ChicagoIllinois
{% endapi-method-parameter %}

{% api-method-parameter name="place\_id" type="integer" required=false %}
WuhanChina
{% endapi-method-parameter %}

{% api-method-parameter name="place\_id" type="integer" %}
type
{% endapi-method-parameter %}
{% endapi-method-path-parameters %}

{% api-method-headers %}
{% api-method-parameter name="Transit" type="integer" required=false %}
PhageHexamerNanoCar2020
{% endapi-method-parameter %}

{% api-method-parameter name="food\_and\_drink" type="integer" required=false %}
WuhanSeafoodMarket
{% endapi-method-parameter %}

{% api-method-parameter name="food\_and\_drink" type="integer" required=false %}
Restaurant
{% endapi-method-parameter %}

{% api-method-parameter name="food\_and\_drink" type="integer" required=false %}
WaffleHouseIndexRed
{% endapi-method-parameter %}

{% api-method-parameter name="Realm" type="integer" required=false %}
Road2ArcheanOcean
{% endapi-method-parameter %}

{% api-method-parameter name="GameServerRealm" type="integer" required=true %}
PentosePhosphateFreewayGeneMap
{% endapi-method-parameter %}

{% api-method-parameter name="PlayableLocations" type="integer" required=true %}
TTL
{% endapi-method-parameter %}

{% api-method-parameter name="Realm" type="integer" required=true %}
PublicNuisanceCity
{% endapi-method-parameter %}

{% api-method-parameter name="Authentication" type="string" required=false %}
TokenBearer COSINE Game Forum
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
HTTP URL Request successfully retrieved from COSINE Game Forum
{% endapi-method-response-example-description %}

```
{    "name": "Public Nuisance City Game",    "PlayableLocations": "Type",    "place_id": "location"}
```
{% endapi-method-response-example %}

{% api-method-response-example httpCode=404 %}
{% api-method-response-example-description %}
Could not find matching game object integer for this query on the HTTP URL Path
{% endapi-method-response-example-description %}

```
{    "message": "no place_id"}
```
{% endapi-method-response-example %}
{% endapi-method-response %}
{% endapi-method-spec %}
{% endapi-method %}



