/*
 * Copyright 2013-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.cassandra.config;

import com.datastax.oss.driver.api.core.CqlSessionBuilder;
import com.datastax.oss.driver.api.core.session.SessionBuilder;

/**
 * Configuration callback class to allow a user to apply additional configuration logic to the {@link SessionBuilder}.
 *
 * @author John Blum
 * @author Mark Paluch
 * @since 3.0
 * @see com.datastax.oss.driver.api.core.CqlSession
 */
@FunctionalInterface
public interface SessionBuilderConfigurer {

	/**
	 * Apply addition configuration to the {@link SessionBuilder}.
	 *
	 * @param sessionBuilder {@link SessionBuilder} to configure.
	 * @return the argument to the {@code sessionBuilder} parameter.
	 * @see SessionBuilder
	 */
	CqlSessionBuilder configure(CqlSessionBuilder sessionBuilder);
}
