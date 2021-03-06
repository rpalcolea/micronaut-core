/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.context.event;

import io.micronaut.context.BeanContext;

import java.util.EventObject;

/**
 * A BeanContextEvent is an event fired from the {@link BeanContext} instance.
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public abstract class BeanContextEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param beanContext The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public BeanContextEvent(BeanContext beanContext) {
        super(beanContext);
    }

    @Override
    public BeanContext getSource() {
        return (BeanContext) super.getSource();
    }
}
