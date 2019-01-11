/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.acme.reactivex.example;

import java.util.Map;
import io.reactivex.Observable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


@io.vertx.lang.rx.RxGen(com.acme.example.ExampleProxy.class)
public class ExampleProxy {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExampleProxy that = (ExampleProxy) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.rx.TypeArg<ExampleProxy> __TYPE_ARG = new io.vertx.lang.rx.TypeArg<>(    obj -> new ExampleProxy((com.acme.example.ExampleProxy) obj),
    ExampleProxy::getDelegate
  );

  private final com.acme.example.ExampleProxy delegate;
  
  public ExampleProxy(com.acme.example.ExampleProxy delegate) {
    this.delegate = delegate;
  }

  public com.acme.example.ExampleProxy getDelegate() {
    return delegate;
  }

  public static com.acme.reactivex.example.ExampleProxy createProxy(io.vertx.reactivex.core.Vertx vertx, String address) { 
    com.acme.reactivex.example.ExampleProxy ret = com.acme.reactivex.example.ExampleProxy.newInstance(com.acme.example.ExampleProxy.createProxy(vertx.getDelegate(), address));
    return ret;
  }

  public void save(String collection, JsonObject document, Handler<AsyncResult<Void>> resultHandler) { 
    delegate.save(collection, document, resultHandler);
  }

  public Completable rxSave(String collection, JsonObject document) { 
    return io.vertx.reactivex.impl.AsyncResultCompletable.toCompletable(handler -> {
      save(collection, document, handler);
    });
  }


  public static  ExampleProxy newInstance(com.acme.example.ExampleProxy arg) {
    return arg != null ? new ExampleProxy(arg) : null;
  }
}
