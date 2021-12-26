package sk.foo.library2.di

import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import sk.foo.custom_annot.AutoInitialized
import sk.foo.custom_annot.Scoped
import sk.foo.custom_annot.SubscriberScope
import sk.foo.library2.BooFarLibrary

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 3. 9. 2021.
 */
@ContributesTo(SubscriberScope::class)
@Module
object Library2Module : Scoped {

    @AutoInitialized
    @SubscriberScope
    @JvmStatic
    @Provides
    fun library(): BooFarLibrary = BooFarLibrary()
}