package data.api.di

import com.vitoksmile.kmp.health.HealthManagerFactory
import data.api.KtorApi
import data.api.KtorApiImpl
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration) = startKoin {
    appDeclaration()
    modules(
        apiModule,
        healthCareModule,
        datasourceModule,
        repositoryModule,
        viewModelModule
    )
}

private val apiModule = module {
    single<KtorApi> { KtorApiImpl() }
}
private val viewModelModule = module {

}
private val repositoryModule = module {

}
private val datasourceModule = module {

}
private val healthCareModule: Module = module {
    single { HealthManagerFactory() }
}
fun initKoin() = initKoin {}