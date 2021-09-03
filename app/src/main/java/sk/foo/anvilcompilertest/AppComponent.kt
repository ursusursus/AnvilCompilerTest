package sk.foo.anvilcompilertest

import android.content.Context
import com.squareup.anvil.annotations.ContributesTo
import com.squareup.anvil.annotations.MergeComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import sk.foo.custom_annot.AppScope
import sk.foo.library1.Library1

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 19. 8. 2021.
 */
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
    fun foo(library: Library1): Foo = Foo(library)
}