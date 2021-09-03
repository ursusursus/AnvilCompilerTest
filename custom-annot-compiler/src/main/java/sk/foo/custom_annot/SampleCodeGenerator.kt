package sk.foo.custom_annot

import com.google.auto.service.AutoService
import com.squareup.anvil.annotations.ExperimentalAnvilApi
import com.squareup.anvil.compiler.api.AnvilContext
import com.squareup.anvil.compiler.api.CodeGenerator
import com.squareup.anvil.compiler.api.GeneratedFile
import com.squareup.anvil.compiler.internal.classesAndInnerClass
import org.jetbrains.kotlin.descriptors.ModuleDescriptor
import org.jetbrains.kotlin.psi.KtFile
import java.io.File

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 19. 8. 2021.
 */
@ExperimentalAnvilApi
@AutoService(CodeGenerator::class)
class SampleCodeGenerator : CodeGenerator {
    override fun generateCode(
        codeGenDir: File,
        module: ModuleDescriptor,
        projectFiles: Collection<KtFile>
    ): Collection<GeneratedFile> {
        return emptyList()
    }

    override fun isApplicable(context: AnvilContext): Boolean = true
}