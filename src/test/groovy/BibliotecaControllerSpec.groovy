import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll
import wsousa.micronaut.controller.BibliotecaController

class BibliotecaControllerSpec extends Specification {

    @Shared
    @AutoCleanup
    EmbeddedServer embeddedServer =  ApplicationContext.run(EmbeddedServer)

    @Shared
    BibliotecaController client = embeddedServer.applicationContext.getBean(BibliotecaController)

    @Unroll
    void "test hello #name response"() {
        expect:
        client.index() == 'Hello World'
        where:
        name = 'Hello World'
    }
}
