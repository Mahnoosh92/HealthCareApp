package presentation

import android.app.Application
import data.api.di.initKoin

class HealthApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            applicationContext
        }
    }
}