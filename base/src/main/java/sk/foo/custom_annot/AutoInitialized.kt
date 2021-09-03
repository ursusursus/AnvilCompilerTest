package sk.foo.custom_annot

import javax.inject.Scope

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 19. 8. 2021.
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Retention(AnnotationRetention.RUNTIME)
annotation class AutoInitialized