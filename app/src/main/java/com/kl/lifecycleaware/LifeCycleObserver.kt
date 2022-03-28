package com.kl.lifecycleaware

import android.util.Log
import androidx.lifecycle.*

internal class LifeCycleObserver : LifecycleEventObserver {

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_CREATE -> {
                Log.e( "LifeCycleEvent" , "on create" )
            }
            Lifecycle.Event.ON_START -> {
                Log.e( "LifeCycleEvent" , "on start" )
            }
            Lifecycle.Event.ON_RESUME -> {
                Log.e( "LifeCycleEvent" , "on resume" )
            }
            Lifecycle.Event.ON_PAUSE -> {
                Log.e( "LifeCycleEvent" , "on pause" )
            }
            Lifecycle.Event.ON_STOP -> {
                Log.e( "LifeCycleEvent" , "on stop" )
            }
            Lifecycle.Event.ON_DESTROY -> {
                Log.e( "LifeCycleEvent" , "on destroy" )
            }
            Lifecycle.Event.ON_ANY -> {
                Log.e( "LifeCycleEvent" , "on any" )
            }
        }
    }
}




