package sk.foo.anvilcompilertest

import android.content.Context
import com.squareup.anvil.annotations.ContributesTo
import com.squareup.anvil.annotations.MergeComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Scope

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 19. 8. 2021.
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@AppScope
@MergeComponent(scope = AppScope::class)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}

@Module
@ContributesTo(AppScope::class)
object AppModule {
    @Provides
    @JvmStatic
    @AppScope
    fun foo(context: Context): Foo = Foo(context)
}