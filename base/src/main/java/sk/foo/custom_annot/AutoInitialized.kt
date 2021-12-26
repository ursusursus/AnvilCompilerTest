package sk.foo.custom_annot

import javax.inject.Qualifier
import javax.inject.Scope
import kotlin.reflect.KClass

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 19. 8. 2021.
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class UserScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class SubscriberScope

@Retention(AnnotationRetention.RUNTIME)
annotation class AutoInitialized

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class AutoInitializedSet(val scope: KClass<*>)

interface Scoped