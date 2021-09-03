package sk.foo.library1.di

import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import sk.foo.custom_annot.AppScope
import sk.foo.library1.Library1

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 3. 9. 2021.
 */
@ContributesTo(AppScope::class)
@Module
object LibraryModule {

    @JvmStatic
    @Provides
    @AppScope
    fun library(): Library1 = Library1()
}