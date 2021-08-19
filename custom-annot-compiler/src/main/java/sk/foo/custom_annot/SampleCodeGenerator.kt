package sk.foo.custom_annot

import com.google.auto.service.AutoService
import com.squareup.anvil.annotations.ExperimentalAnvilApi
import com.squareup.anvil.compiler.api.AnvilContext
import com.squareup.anvil.compiler.api.CodeGenerator
import com.squareup.anvil.compiler.api.GeneratedFile
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
        module: org.jetbrains.kotlin.descriptors.ModuleDescriptor,
        projectFiles: Collection<KtFile>
    ): Collection<GeneratedFile> {
//        val foo = projectFiles
//            .filter { it.annotations.contains(FqName("foo")) }

        println("HELLO")

        return error("zis")
    }

    override fun isApplicable(context: AnvilContext): Boolean = true
}