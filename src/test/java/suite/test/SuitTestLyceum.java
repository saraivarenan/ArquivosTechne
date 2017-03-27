package suite.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import portal.processo.seletivo.AlterarDadosCandidato;
import portal.processo.seletivo.Candidato;


@RunWith(Suite.class)

@Suite.SuiteClasses({
   Candidato.class,
   AlterarDadosCandidato.class
  // AlterarDadosCandidato.class
   
})
public class SuitTestLyceum {

}
