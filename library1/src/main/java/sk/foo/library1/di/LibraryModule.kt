package sk.foo.library1.di

import com.squareup.anvil.annotations.ContributesSubcomponent
import com.squareup.anvil.annotations.ContributesTo
import com.squareup.anvil.annotations.ExperimentalAnvilApi
import dagger.Module
import dagger.Provides
import sk.foo.custom_annot.AppScope
import sk.foo.custom_annot.AutoInitialized
import sk.foo.custom_annot.Scoped
import sk.foo.custom_annot.UserScope
import sk.foo.library1.LibraryFooBar

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 3. 9. 2021.
 */
@OptIn(ExperimentalAnvilApi::class)
@ContributesSubcomponent(
    scope = UserScope::class,
    parentScope = AppScope::class
)
interface LibraryComponent {
    // This works
//    @ContributesTo(AppScope::class)
//    interface ParentComponent {
//        fun libraryComponent(): LibraryComponent
//    }

    // This doesnt
    @ContributesTo(AppScope::class)
    interface ParentComponent {
        val libraryComponentFactory: Factory
    }

    @ContributesSubcomponent.Factory
    interface Factory {
        fun create(): LibraryComponent
    }
}

@ContributesTo(AppScope::class)
@Module
object LibraryModule : Scoped {

    @AppScope
    @JvmStatic
    @Provides
    @AutoInitialized
    fun library(): LibraryFooBar = LibraryFooBar()
}