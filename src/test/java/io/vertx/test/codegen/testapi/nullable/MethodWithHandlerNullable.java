package io.vertx.test.codegen.testapi.nullable;

import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Handler;
import io.vertx.test.codegen.testapi.VertxGenClass1;

import java.util.List;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface MethodWithHandlerNullable {

  void method(Handler<@Nullable VertxGenClass1> handler);

}
