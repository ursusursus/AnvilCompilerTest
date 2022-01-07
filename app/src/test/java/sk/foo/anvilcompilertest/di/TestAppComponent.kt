package sk.foo.anvilcompilertest.di

import com.squareup.anvil.annotations.MergeComponent
import dagger.Component
import sk.foo.custom_annot.AppScope

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 7. 1. 2022.
 */
@AppScope
@MergeComponent(AppScope::class)
interface TestAppComponent {
    @Component.Factory
    interface Factory {
        fun create(): TestAppComponent
    }
}