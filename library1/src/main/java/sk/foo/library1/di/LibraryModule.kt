package sk.foo.library1.di

import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import sk.foo.custom_annot.AppScope
import sk.foo.custom_annot.AutoInitialized
import sk.foo.custom_annot.Scoped
import sk.foo.library1.LibraryFooBar

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 3. 9. 2021.
 */
@ContributesTo(AppScope::class)
@Module
object LibraryModule : Scoped {

    @AppScope
    @JvmStatic
    @Provides
    @AutoInitialized
    fun library(): LibraryFooBar = LibraryFooBar()
}