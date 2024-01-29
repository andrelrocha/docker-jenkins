package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

public static final int TIMEOUT = 300;

/**
 *
 * @author Andre Lucio Rocha Wanderley
 * @since 25/01/2024, 10:41:57
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var perfilSistema = Var.VAR_NULL;

   public Var call() throws Exception {
    perfilSistema =
    cronapi.util.Operations.getSystemProfile();
    System.out.println(
    Var.valueOf(
    Var.valueOf("Perfil do sistema: ").getObjectAsString() +
    perfilSistema.getObjectAsString()).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

