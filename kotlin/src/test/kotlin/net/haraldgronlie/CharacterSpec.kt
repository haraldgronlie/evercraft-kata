package net.haraldgronlie

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CharacterSpec : Spek({
    lateinit var subject: Hero

    beforeEachTest { subject = Hero() }

    describe("#name") {
        it("has a default name") {
            assertThat(subject.name).isEqualTo("")
        }

        it("can be changed") {
            subject.name = "Caleb"
            assertThat(subject.name).isEqualTo("Caleb")
        }
    }
})