package com.mapbox.navigation.trip.session

import com.mapbox.navigation.base.trip.model.RouteProgress

interface RouteProgressObserver {
    fun onRouteProgressChanged(routeProgress: RouteProgress)
}
