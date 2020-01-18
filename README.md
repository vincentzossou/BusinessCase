# Gozem Developer: Business Case

## Login Form
Android Login System with Material Design. I don't use backend, just put true credentials directly in Activity.
- *Email:* gozem@gmail.com
- *Password:* gozem

## Android-Map-Project
In this project I explore work with Google Map SDK and Google Places Web API for :
- searching info about current location;
- searching a place that will be a destination
- plot the route between these two points on the map.

At this project I don't use any third libraries besides libs from Google.
1. You'll need a Google Server API key for you application. There are instructions on how to set up your API project and generate a key [here](https://developers.google.com/places/web-service/get-api-key)

2. Then you'll add your API key to `google_maps_api.xml` file in `res/values`

    ```xml
   <string name="google_maps_key" templateMergeStrategy="preserve" translatable="false">you_api_key</string>
    ```

3. APIs that you have to enable are:
- Maps SDK for Android
- Places API
- Directions API
- Roads API
- Geocoding API