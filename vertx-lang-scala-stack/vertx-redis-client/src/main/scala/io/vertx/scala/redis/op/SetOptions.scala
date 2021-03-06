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

package io.vertx.scala.redis.op

import io.vertx.core.json.JsonObject
import scala.collection.JavaConverters._
import io.vertx.lang.scala.json.Json._
import io.vertx.redis.op.{SetOptions => JSetOptions}

/**
  */

class SetOptions(val asJava: JSetOptions) {

  def setEX(value: Long) = {
    asJava.setEX(value)
    this
  }
  def setNX(value: Boolean) = {
    asJava.setNX(value)
    this
  }
  def setPX(value: Long) = {
    asJava.setPX(value)
    this
  }
  def setXX(value: Boolean) = {
    asJava.setXX(value)
    this
  }
}

object SetOptions {
  
  def apply() = {
    new SetOptions(new JSetOptions(emptyObj()))
  }
  
  def apply(t: JSetOptions) = {
    if(t != null)
      new SetOptions(t)
    else
      null
  }
  
  def fromJson(json: JsonObject):SetOptions = {
    if(json != null)
      new SetOptions(new JSetOptions(json))
    else
      null
  }
}
